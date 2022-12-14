package server.domain;

import server.access.IClientAccess;

/**
 * servicios que el cliente puede usar del servidor (mascaras)
 * se comunica con la capa de bajo nivel que envia la solicitud
 * @author fallen
 */
public class ClientService {
    private final IClientAccess service;
    
    /**
     * inyeccion de dependencias
     * @param service un clase concreta que implementa la interfaz de acceso, se instancia con una fabrica
     */
    public ClientService(IClientAccess service) {
        this.service = service;
    }
    
    public boolean sendMessageLog(String message) throws Exception {
        return this.service.sendMessageLog(message);
    }
}