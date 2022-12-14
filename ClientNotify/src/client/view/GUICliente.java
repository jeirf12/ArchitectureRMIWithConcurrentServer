package client.view;

import common.entities.NotifyDTO;
import javax.swing.DefaultListModel;

/**
 *
 * @author fallen
 */
public class GUICliente extends javax.swing.JFrame {
    private DefaultListModel model;
    
    public GUICliente() {
        initComponents();
        this.model = new DefaultListModel();
        this.lstIndicadores.setModel(model);   
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlNuevaAlerta = new javax.swing.JPanel();
        lblNuevaAlerta = new javax.swing.JLabel();
        pnlMensajeAlerta = new javax.swing.JPanel();
        lblMensajeAlerta = new javax.swing.JLabel();
        lblIndicadores = new javax.swing.JLabel();
        pnlListaIndicadores = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        lstIndicadores = new javax.swing.JList<>();
        pnlDesarrolladores = new javax.swing.JPanel();
        lblDesarrolladores = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblNuevaAlerta.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblNuevaAlerta.setText("NUEVA ALERTA");

        javax.swing.GroupLayout pnlNuevaAlertaLayout = new javax.swing.GroupLayout(pnlNuevaAlerta);
        pnlNuevaAlerta.setLayout(pnlNuevaAlertaLayout);
        pnlNuevaAlertaLayout.setHorizontalGroup(
            pnlNuevaAlertaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlNuevaAlertaLayout.createSequentialGroup()
                .addGap(135, 135, 135)
                .addComponent(lblNuevaAlerta)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlNuevaAlertaLayout.setVerticalGroup(
            pnlNuevaAlertaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlNuevaAlertaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblNuevaAlerta)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        lblMensajeAlerta.setText("---");

        lblIndicadores.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblIndicadores.setText("Indicadores Fuera de rango");

        lstIndicadores.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(lstIndicadores);

        javax.swing.GroupLayout pnlListaIndicadoresLayout = new javax.swing.GroupLayout(pnlListaIndicadores);
        pnlListaIndicadores.setLayout(pnlListaIndicadoresLayout);
        pnlListaIndicadoresLayout.setHorizontalGroup(
            pnlListaIndicadoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlListaIndicadoresLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        pnlListaIndicadoresLayout.setVerticalGroup(
            pnlListaIndicadoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlListaIndicadoresLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout pnlMensajeAlertaLayout = new javax.swing.GroupLayout(pnlMensajeAlerta);
        pnlMensajeAlerta.setLayout(pnlMensajeAlertaLayout);
        pnlMensajeAlertaLayout.setHorizontalGroup(
            pnlMensajeAlertaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMensajeAlertaLayout.createSequentialGroup()
                .addGroup(pnlMensajeAlertaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlMensajeAlertaLayout.createSequentialGroup()
                        .addGroup(pnlMensajeAlertaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlMensajeAlertaLayout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addComponent(lblMensajeAlerta))
                            .addGroup(pnlMensajeAlertaLayout.createSequentialGroup()
                                .addGap(89, 89, 89)
                                .addComponent(lblIndicadores)))
                        .addGap(0, 88, Short.MAX_VALUE))
                    .addGroup(pnlMensajeAlertaLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(pnlListaIndicadores, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        pnlMensajeAlertaLayout.setVerticalGroup(
            pnlMensajeAlertaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMensajeAlertaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblMensajeAlerta)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblIndicadores)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlListaIndicadores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        lblDesarrolladores.setText("Desarrollado por: ");

        javax.swing.GroupLayout pnlDesarrolladoresLayout = new javax.swing.GroupLayout(pnlDesarrolladores);
        pnlDesarrolladores.setLayout(pnlDesarrolladoresLayout);
        pnlDesarrolladoresLayout.setHorizontalGroup(
            pnlDesarrolladoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDesarrolladoresLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(lblDesarrolladores)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlDesarrolladoresLayout.setVerticalGroup(
            pnlDesarrolladoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDesarrolladoresLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(lblDesarrolladores)
                .addContainerGap(56, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlNuevaAlerta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(pnlMensajeAlerta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlDesarrolladores, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnlNuevaAlerta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlMensajeAlerta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlDesarrolladores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    public void showNotification(NotifyDTO notify) {
        GUICliente gui = new GUICliente();
        gui.lblMensajeAlerta.setText("El paciente en la habitacion " + notify.getNumberRoom() + 
                " presenta " + notify.getCounterOutOfRange() + " indicadores fuera de rango");
        
        if(notify.getCounterOutOfRange() > 0) {
            String value[] = new String[3];
            for (String clave: notify.getIndicators().keySet()) {
                if(notify.getIndicators().get(clave)) {
                    value = clave.split(",");
                    if (value.length == 2) {
                        gui.model.addElement(value[0] + ": " + value[1]);
                    } else if (value.length == 3) {
                        gui.model.addElement(value[0] + " - " + value[1] + ": " + value[2]);
                    }
                }
            }
        }
        gui.setVisible(true);
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblDesarrolladores;
    private javax.swing.JLabel lblIndicadores;
    private javax.swing.JLabel lblMensajeAlerta;
    private javax.swing.JLabel lblNuevaAlerta;
    private javax.swing.JList<String> lstIndicadores;
    private javax.swing.JPanel pnlDesarrolladores;
    private javax.swing.JPanel pnlListaIndicadores;
    private javax.swing.JPanel pnlMensajeAlerta;
    private javax.swing.JPanel pnlNuevaAlerta;
    // End of variables declaration//GEN-END:variables
}