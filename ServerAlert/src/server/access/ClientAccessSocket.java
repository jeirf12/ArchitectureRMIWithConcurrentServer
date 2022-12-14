package server.access;

import server.utilities.LogSocket;
import com.google.gson.Gson;
import common.infra.JsonError;
import common.infra.Protocol;
import java.io.IOException;
import static java.lang.System.out;

/**
 *
 * @author fallen
 */
public class ClientAccessSocket implements IClientAccess {
    private LogSocket mySocket;
    
    public ClientAccessSocket() {
        mySocket = new LogSocket();
    }
    
    private String proccessConnection(String requestJson) throws Exception {
        String jsonResponse = null;
        try {
            mySocket.connect();
            jsonResponse = mySocket.sendStream(requestJson);
            mySocket.closeStream();
            mySocket.disconnect();
        } catch (IOException ex) {
            ex.getMessage();
        }
        if (jsonResponse == null) {
            throw new Exception("no se pudo conectar al servidor");
        } else {
            if (jsonResponse.contains("error")) {
                //Devolvió algún error, usar mejor login
                out.println("hubo algun tipo de error");
                throw new Exception(this.extractMessages(jsonResponse));
            } else {
                //Devuelve la respuesta del servidor
                return jsonResponse;
            }
        }
    }
    
    private String extractMessages(String jsonResponse) {
        var errors = jsonToErrors(jsonResponse);
        var msjs = "";
        for (var error : errors) {
            msjs += error.getMessage();
        }
        return msjs;
    }
    
    private JsonError[] jsonToErrors(String jsonError) {
        var gson = new Gson();
        var error = gson.fromJson(jsonError, JsonError[].class);
        return error;
    }
    
    private String buildJson(String message) {
        Protocol protocol = new Protocol();
        protocol.setResource("log");
        protocol.setAction("sendMessageLog");
        protocol.addParameter("message", message);
        Gson gson = new Gson();
        String requestJson = gson.toJson(protocol);
        out.println("Json construido: " + requestJson);
        return requestJson;
    }
   
    @Override
    public boolean sendMessageLog(String message) throws Exception {
        String requestJson = this.buildJson(message);
        String value = this.proccessConnection(requestJson);
        return true;
    }
}