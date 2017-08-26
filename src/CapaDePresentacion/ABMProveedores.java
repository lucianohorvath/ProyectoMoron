package CapaDePresentacion;

import ReglasDeNegocio.GestorProveedor;
import ReglasDeNegocio.Proveedor;
import java.awt.Component;
import java.awt.event.ActionEvent;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author LucianoHorvath
 */
public class ABMProveedores extends javax.swing.JFrame {

    private static int operacion;
    private static int idProveedor;
    private static GestorProveedor gestor;
    
    public ABMProveedores(int op, GestorProveedor gestor) {           //este constructor no incluye idProv 
        initComponents();                                           //porque es el que se llama al hacer un Alta
        operacion = op;   
        ABMProveedores.gestor = gestor;
        modificarVentana(operacion);
    }
    
    public ABMProveedores(int op, int idProv, GestorProveedor gestor) {
        initComponents();
        operacion = op;
        idProveedor = idProv;
        ABMProveedores.gestor = gestor;
        modificarVentana(operacion);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelDatos = new javax.swing.JPanel();
        jLID = new javax.swing.JLabel();
        jTextId = new javax.swing.JTextField();
        jLRazonSocial = new javax.swing.JLabel();
        jTextRazonSocial = new javax.swing.JTextField();
        jLCuit = new javax.swing.JLabel();
        jTextCuit = new javax.swing.JFormattedTextField();
        jLDireccion = new javax.swing.JLabel();
        jTextDireccion = new javax.swing.JTextField();
        jLTelefono = new javax.swing.JLabel();
        jTextTelefono = new javax.swing.JTextField();
        jLEmail = new javax.swing.JLabel();
        jTextEmail = new javax.swing.JTextField();
        jPanelBotonesSuperpuestos = new javax.swing.JPanel();
        jBAlta = new javax.swing.JButton();
        jBModificar = new javax.swing.JButton();
        jBBaja = new javax.swing.JButton();
        jBCancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("ABM de Proveedores");

        jPanelDatos.setPreferredSize(new java.awt.Dimension(250, 252));

        jLID.setText("ID Proveedor:");
        jLID.setPreferredSize(new java.awt.Dimension(70, 20));

        jTextId.setEnabled(false);
        jTextId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextIdActionPerformed(evt);
            }
        });

        jLRazonSocial.setText("Razón Social:");
        jLRazonSocial.setPreferredSize(new java.awt.Dimension(85, 20));

        jTextRazonSocial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextRazonSocialActionPerformed(evt);
            }
        });

        jLCuit.setText("CUIT:");
        jLCuit.setPreferredSize(new java.awt.Dimension(85, 20));

        try {
            jTextCuit.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##-########-#")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jTextCuit.setToolTipText("Sólo se permiten valores numéricos.");

        jLDireccion.setText("Dirección:");
        jLDireccion.setPreferredSize(new java.awt.Dimension(85, 20));

        jTextDireccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextDireccionActionPerformed(evt);
            }
        });

        jLTelefono.setText("Teléfono:");
        jLTelefono.setPreferredSize(new java.awt.Dimension(85, 20));

        jTextTelefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextTelefonoActionPerformed(evt);
            }
        });

        jLEmail.setText("E-Mail:");
        jLEmail.setPreferredSize(new java.awt.Dimension(85, 20));

        jTextEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextEmailActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelDatosLayout = new javax.swing.GroupLayout(jPanelDatos);
        jPanelDatos.setLayout(jPanelDatosLayout);
        jPanelDatosLayout.setHorizontalGroup(
            jPanelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDatosLayout.createSequentialGroup()
                .addGroup(jPanelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanelDatosLayout.createSequentialGroup()
                        .addGroup(jPanelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLRazonSocial, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLID, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextId, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                            .addComponent(jTextRazonSocial)))
                    .addGroup(jPanelDatosLayout.createSequentialGroup()
                        .addGroup(jPanelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanelDatosLayout.createSequentialGroup()
                        .addComponent(jLCuit, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jTextCuit)))
                .addContainerGap(36, Short.MAX_VALUE))
        );
        jPanelDatosLayout.setVerticalGroup(
            jPanelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDatosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLID, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLRazonSocial, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextRazonSocial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addGroup(jPanelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLCuit, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextCuit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(jPanelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jPanelBotonesSuperpuestos.setLayout(null);

        jBAlta.setText("Dar de alta");
        jBAlta.setAlignmentY(0.0F);
        jBAlta.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jBAlta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBAltaActionPerformed(evt);
            }
        });
        jPanelBotonesSuperpuestos.add(jBAlta);
        jBAlta.setBounds(0, 10, 95, 23);

        jBModificar.setText("Modificar");
        jBModificar.setAlignmentY(0.0F);
        jBModificar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jBModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBModificarActionPerformed(evt);
            }
        });
        jPanelBotonesSuperpuestos.add(jBModificar);
        jBModificar.setBounds(0, 10, 95, 23);

        jBBaja.setText("Dar de baja");
        jBBaja.setAlignmentY(0.0F);
        jBBaja.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jBBaja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBBajaActionPerformed(evt);
            }
        });
        jPanelBotonesSuperpuestos.add(jBBaja);
        jBBaja.setBounds(0, 10, 95, 23);

        jBCancelar.setText("Cancelar");
        jBCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBCancelarActionPerformed(evt);
            }
        });
        jPanelBotonesSuperpuestos.add(jBCancelar);
        jBCancelar.setBounds(125, 10, 90, 23);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanelBotonesSuperpuestos, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanelDatos, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(27, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelDatos, javax.swing.GroupLayout.DEFAULT_SIZE, 187, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jPanelBotonesSuperpuestos, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jBCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBCancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_jBCancelarActionPerformed

    private void jTextEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextEmailActionPerformed
        realizarOperacion(evt);
    }//GEN-LAST:event_jTextEmailActionPerformed

    private void jTextTelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextTelefonoActionPerformed
        realizarOperacion(evt);
    }//GEN-LAST:event_jTextTelefonoActionPerformed

    private void jTextDireccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextDireccionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextDireccionActionPerformed

    private void jTextRazonSocialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextRazonSocialActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextRazonSocialActionPerformed

    private void jTextIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextIdActionPerformed

    private void jBBajaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBBajaActionPerformed
        String mensaje;
                
        if (gestor.darBajaProveedor(idProveedor) == 1)
            mensaje = "Proveedor eliminado con éxito.";
        else
            mensaje = "Error al eliminar al proveedor.";
        
        System.out.println(mensaje);        
        JOptionPane.showMessageDialog(this, mensaje);
        this.dispose();
    }//GEN-LAST:event_jBBajaActionPerformed

    private void jBAltaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBAltaActionPerformed
        String mensaje;
        
        /*
        ¿ validarDatos() == 1 ?  ese metodo devuelve uno si los datos son correctos (no estan en blanco las claves foraneas, el email tiene arroba y .com, etc
        antes de dar dar de alta el campo id debe estar deshabilitado, y puedo mostrar ahi cual sera el id (haciendo un select del max id + 1)
        eso puede dar problemas si borre campos. sino en el mensaje de exito muestro que id efectivamente quedo
        */
        
        //Sólo levanta y registra los datos si éstos son válidos.        
        if (validarDatos()){
            if ((gestor.darAltaProveedor(levantarDatos()) == 1))
                mensaje = "Datos insertados con éxito.";
            else
                mensaje = "Error al insertar los datos.";

            System.out.println(mensaje);        
            JOptionPane.showMessageDialog(this, mensaje);   

            limpiaPanelDatos();
        }    
    }//GEN-LAST:event_jBAltaActionPerformed

    private void jBModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBModificarActionPerformed
        String mensaje;
                
        if (gestor.modificarProveedor(levantarDatos()) == 1)
            mensaje = "Datos modificados con éxito.";
        else
            mensaje = "Error al modificar los datos.";
        
        System.out.println(mensaje);        
        JOptionPane.showMessageDialog(this, mensaje);
        this.dispose();
    }//GEN-LAST:event_jBModificarActionPerformed

    private void modificarVentana(int operacion){
        modificarBotones(operacion);
        
        switch(operacion){
            case 2: {
                mostrarDatosProveedor(idProveedor);
                break;
            }    
            case 3:{
                mostrarDatosProveedor(idProveedor);
                deshabilitarPanelDatos();
                break;
            }
        }
    }    
      
    private void deshabilitarPanelDatos(){
        Component[] listaComponentes = jPanelDatos.getComponents();
        
        for (Component c: listaComponentes)
            c.setEnabled(false);
    }
    
    private void limpiaPanelDatos(){
        Component[] listaComponentes = jPanelDatos.getComponents();
        
        for (Component c: listaComponentes)
            if (c instanceof JTextField)
              ((JTextField) c).setText("");
    }
        
    /**
    * Este método modifica la visibilidad de los botones de la ventana,
    * presentando el que corresponda según el parámetro recibido.
    *
    * @param operacion 1 para alta, 2 para modificación, 3 para baja.
    */
    private void modificarBotones(int operacion){
        switch (operacion){
            case 1: {
                    this.jBAlta.setVisible(true);
                    this.jBBaja.setVisible(false);
                    this.jBModificar.setVisible(false);
                    break;}
            case 2: {
                    this.jBAlta.setVisible(false);
                    this.jBModificar.setVisible(true);
                    this.jBBaja.setVisible(false);
                    break;}
            case 3:{
                    this.jBAlta.setVisible(false);
                    this.jBModificar.setVisible(false);
                    this.jBBaja.setVisible(true);
                    break;}
        }
    }
    
    private void mostrarDatosProveedor(int idProv){
        Proveedor p = gestor.traerProveedor(idProv);
        
        jTextId.setText(Integer.toString(idProv));
        jTextRazonSocial.setText(p.getRazonSocial());
        jTextCuit.setText(Long.toString(p.getCuit()));
        jTextDireccion.setText(p.getDireccion());
        jTextTelefono.setText(p.getTelefono());
        jTextEmail.setText(p.getEmail());        
    }
    
     /**
    * Recoge los datos de las cajas de texto y los pone en el objeto
    * Proveedor que se pasa por parámetro.
    *
    * @param prov Objeto Proveedor en el que se cargan los datos.
    */
    private void levantarDatosProveedor(Proveedor prov){
        
        //se da por supuesto que los campos estan completos y la informacion es coherente
        prov.setIdProveedor(Integer.parseInt(jTextId.getText()));
        prov.setRazonSocial(jTextRazonSocial.getText());
        prov.setDireccion(jTextDireccion.getText());
        prov.setTelefono(jTextTelefono.getText());
        prov.setEmail(jTextEmail.getText());
    }
    
    /**
    * Recoge los datos de las cajas de texto y los pone en un objeto Proveedor.
    *
    * @return un objeto Proveedor con los datos cargados.
    */
    private Proveedor levantarDatos(){                  //alternativa a levantarDatosProveedor
        //se da por supuesto que los campos estan completos y la informacion es coherente
        Proveedor prov = new Proveedor();
        
        prov.setRazonSocial(jTextRazonSocial.getText());
        String cuitLimpio = jTextCuit.getText().replaceAll("-", "");    //le saco los guiones
        prov.setCuit(Long.valueOf(cuitLimpio));
        prov.setDireccion(jTextDireccion.getText());
        prov.setTelefono(jTextTelefono.getText());
        prov.setEmail(jTextEmail.getText());
         
        return prov;
    }
    
    /**
    * Realiza la operación correspondiente (A,B,M). El método se utiliza al presionar enter 
    * en un campo de texto, como alternativa a hacer click en el botón A/B/M.
    */
    private void realizarOperacion(ActionEvent evt) {
                
        switch(operacion){
            case 1: jBAltaActionPerformed(evt);
                    break;
            case 2: jBModificarActionPerformed(evt);
                    break;
            case 3: jBBajaActionPerformed(evt);
                    break;
        }
    }
    
    private boolean validarDatos(){
        boolean cuitVacio = false;
        boolean sonDatosValidos = false;
        
        if ("           ".equals(jTextCuit.getText().replaceAll("-", ""))){
            cuitVacio = true;
            JOptionPane.showMessageDialog(this, "El campo CUIT no puede estar vacío.");
        }
        
        if (!cuitVacio){
            int errorExistencia;
            String mensaje = "";
            Long cuit = Long.valueOf(jTextCuit.getText().replaceAll("-", ""));
            errorExistencia = gestor.comprobarExistencia(jTextRazonSocial.getText(), cuit);

            if (errorExistencia == 1)
                mensaje = "Ya existe esa razón social.";
            else
                if (errorExistencia == 2)
                    mensaje = "Ya existe un proveedor con ese CUIT.";

            if (errorExistencia != 0)
                JOptionPane.showMessageDialog(this, mensaje);
            
            if (!cuitVacio && (errorExistencia == 0))
                sonDatosValidos = true;
        }
        
        return sonDatosValidos;
    }
    
    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ABMProveedores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ABMProveedores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ABMProveedores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ABMProveedores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ABMProveedores(operacion, idProveedor, gestor).setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBAlta;
    private javax.swing.JButton jBBaja;
    private javax.swing.JButton jBCancelar;
    private javax.swing.JButton jBModificar;
    private javax.swing.JLabel jLCuit;
    private javax.swing.JLabel jLDireccion;
    private javax.swing.JLabel jLEmail;
    private javax.swing.JLabel jLID;
    private javax.swing.JLabel jLRazonSocial;
    private javax.swing.JLabel jLTelefono;
    private javax.swing.JPanel jPanelBotonesSuperpuestos;
    private javax.swing.JPanel jPanelDatos;
    private javax.swing.JFormattedTextField jTextCuit;
    private javax.swing.JTextField jTextDireccion;
    private javax.swing.JTextField jTextEmail;
    private javax.swing.JTextField jTextId;
    private javax.swing.JTextField jTextRazonSocial;
    private javax.swing.JTextField jTextTelefono;
    // End of variables declaration//GEN-END:variables


}
