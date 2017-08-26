/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CapaDePresentacion;

import ReglasDeNegocio.GestorInformeRecepcion;
import javax.swing.JOptionPane;
import ReglasDeNegocio.InformeRecepcion;

/**
 *
 * @author Luciano
 */
public class RegistrarInformeRecepcion extends javax.swing.JFrame {

    private static GestorInformeRecepcion gestor;
    /**
     * Creates new form InformeRecepcionAlta
     */
    public RegistrarInformeRecepcion(GestorInformeRecepcion g) {
        initComponents();
        gestor = g;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabelNroLoteInt = new javax.swing.JLabel();
        jLabelFecha = new javax.swing.JLabel();
        jLabelIdProv = new javax.swing.JLabel();
        jLabelRazonSocial = new javax.swing.JLabel();
        jLabelIdMp = new javax.swing.JLabel();
        jLabelMpDesc = new javax.swing.JLabel();
        jLabelNroRemitoProv = new javax.swing.JLabel();
        jLabelNroLoteProv = new javax.swing.JLabel();
        jTextNroLoteInt = new javax.swing.JTextField();
        jTextFecha = new javax.swing.JTextField();
        jTextIdProv = new javax.swing.JTextField();
        jTextRazonSocial = new javax.swing.JTextField();
        jTextIdMp = new javax.swing.JTextField();
        jTextDescMp = new javax.swing.JTextField();
        jTextNroRemito = new javax.swing.JFormattedTextField();
        jTextNroLoteProv = new javax.swing.JFormattedTextField();
        jBBuscarMp = new javax.swing.JButton();
        jBBuscarProv = new javax.swing.JButton();
        jBRegistrar = new javax.swing.JButton();
        jBCancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Registrar Informe de Recepción");

        jPanel1.setPreferredSize(new java.awt.Dimension(800, 400));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelNroLoteInt.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabelNroLoteInt.setText("Número de Lote Interno");
        jPanel1.add(jLabelNroLoteInt, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 183, 30));

        jLabelFecha.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabelFecha.setText("Fecha de recepción");
        jPanel1.add(jLabelFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 183, 30));

        jLabelIdProv.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabelIdProv.setText("ID Proveedor");
        jPanel1.add(jLabelIdProv, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 183, 30));

        jLabelRazonSocial.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabelRazonSocial.setText("Razón Social");
        jPanel1.add(jLabelRazonSocial, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 140, 100, 30));

        jLabelIdMp.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabelIdMp.setText("ID Materia Prima");
        jPanel1.add(jLabelIdMp, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, 183, 30));

        jLabelMpDesc.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabelMpDesc.setText("Descripción");
        jPanel1.add(jLabelMpDesc, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 180, 100, 30));

        jLabelNroRemitoProv.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabelNroRemitoProv.setText("Número de Remito del Proveedor");
        jPanel1.add(jLabelNroRemitoProv, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, -1, 30));

        jLabelNroLoteProv.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabelNroLoteProv.setText("Número de Lote del Proveedor");
        jPanel1.add(jLabelNroLoteProv, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, 183, 30));

        jTextNroLoteInt.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jTextNroLoteInt.setEnabled(false);
        jPanel1.add(jTextNroLoteInt, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 60, 120, 30));

        jTextFecha.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jTextFecha.setEnabled(false);
        jPanel1.add(jTextFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 100, 120, 30));
        jPanel1.add(jTextIdProv, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 140, 120, 30));
        jPanel1.add(jTextRazonSocial, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 140, 120, 30));

        jTextIdMp.setToolTipText("Primero debe seleccionar un proveedor válido.");
        jTextIdMp.setEnabled(false);
        jPanel1.add(jTextIdMp, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 180, 120, 30));

        jTextDescMp.setToolTipText("Primero debe seleccionar un proveedor válido.");
        jTextDescMp.setEnabled(false);
        jPanel1.add(jTextDescMp, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 180, 120, 30));

        try {
            jTextNroRemito.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("####-########")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jTextNroRemito.setPreferredSize(new java.awt.Dimension(6, 20));
        jPanel1.add(jTextNroRemito, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 220, 120, 30));

        jTextNroLoteProv.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("###0"))));
        jTextNroLoteProv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextNroLoteProvActionPerformed(evt);
            }
        });
        jPanel1.add(jTextNroLoteProv, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 260, 120, 30));

        jBBuscarMp.setText("Buscar en la lista");
        jBBuscarMp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBBuscarMpActionPerformed(evt);
            }
        });
        jPanel1.add(jBBuscarMp, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 180, 120, 30));

        jBBuscarProv.setText("Buscar en la lista");
        jBBuscarProv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBBuscarProvActionPerformed(evt);
            }
        });
        jPanel1.add(jBBuscarProv, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 140, 120, 30));

        jBRegistrar.setText("Registrar");
        jBRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBRegistrarActionPerformed(evt);
            }
        });
        jPanel1.add(jBRegistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 340, -1, -1));

        jBCancelar.setText("Cancelar");
        jBCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBCancelarActionPerformed(evt);
            }
        });
        jPanel1.add(jBCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 340, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(816, 438));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jBBuscarProvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBBuscarProvActionPerformed
        VerProveedores verProv = new VerProveedores(this, 4);
        verProv.setVisible(true);
        
        jTextIdProv.setText(Integer.toString(verProv.getIdProveedor()));
        jTextRazonSocial.setText(verProv.getRazonSocial());
        jTextIdProv.setEnabled(false);
        jTextRazonSocial.setEnabled(false);
        
        //la cagada de esto es que si no busco prov por tabla nunca se habilitan los botones, deberia hacerlo de otra manera.
        //por ej: que los botones se habiliten si hay datos validos en el campo id proveedor.
        //sino que esten siempre habilitados y listo.
        //otra cosa: despues de registrar se podrian mostrar la fecha y el nro lote int en los campos correspondientes(aunque esten disabled)
        jTextIdMp.setEnabled(true);
        jTextDescMp.setEnabled(true);
    }//GEN-LAST:event_jBBuscarProvActionPerformed

    private void jBCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBCancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_jBCancelarActionPerformed

    private void jBRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBRegistrarActionPerformed
        String mensaje;
        
        if ((gestor.registrarInformeRecepcion(levantarDatos()) == 1))
            mensaje = "Informe de recepción registrado exitosamente.";
        else
            mensaje = "Error al registrar el informe de recepción.";
        
        System.out.println(mensaje);        
        JOptionPane.showMessageDialog(this, mensaje);
    }//GEN-LAST:event_jBRegistrarActionPerformed

    private void jTextNroLoteProvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextNroLoteProvActionPerformed
        jBRegistrarActionPerformed(evt);
    }//GEN-LAST:event_jTextNroLoteProvActionPerformed

    private void jBBuscarMpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBBuscarMpActionPerformed
        /*
        El código sería algo así:
                
        VerMateriasPrimas verMp = new VerMateriasPrimas(this, idProv);      el "this" es xq va a ser modal.
        verMp.setVisible(true);
        
        le paso el idProv para mostrar SOLO las materias primas que da ese proveedor.
        
        cuando vuelvo de la ventana modal, le pido a verMp el idMp y la descripcionMp que se eligio dentro de esa ventana.
        
        jTextIdMp.setEnabled(false);
        jTextDescMp.setEnabled(false);
        */
    }//GEN-LAST:event_jBBuscarMpActionPerformed

    private InformeRecepcion levantarDatos(){
        InformeRecepcion inf = new InformeRecepcion();
        
        inf.setIdProveedor(Integer.parseInt(jTextIdProv.getText()));
        inf.setRazonSocialProv(jTextRazonSocial.getText());
        inf.setIdMp(Integer.parseInt(jTextIdMp.getText()));
        inf.setDescripcionMp(jTextDescMp.getText());
        String nroRemitoLimpio = jTextNroRemito.getText().replaceAll("-", "");
        inf.setNroRemitoProveedor(Long.parseLong(nroRemitoLimpio));
        inf.setNroLoteProveedor(Integer.parseInt(jTextNroLoteProv.getText()));
                
        return inf;
    }
    
    
    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(RegistrarInformeRecepcion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegistrarInformeRecepcion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegistrarInformeRecepcion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistrarInformeRecepcion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegistrarInformeRecepcion(gestor).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBBuscarMp;
    private javax.swing.JButton jBBuscarProv;
    private javax.swing.JButton jBCancelar;
    private javax.swing.JButton jBRegistrar;
    private javax.swing.JLabel jLabelFecha;
    private javax.swing.JLabel jLabelIdMp;
    private javax.swing.JLabel jLabelIdProv;
    private javax.swing.JLabel jLabelMpDesc;
    private javax.swing.JLabel jLabelNroLoteInt;
    private javax.swing.JLabel jLabelNroLoteProv;
    private javax.swing.JLabel jLabelNroRemitoProv;
    private javax.swing.JLabel jLabelRazonSocial;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextDescMp;
    private javax.swing.JTextField jTextFecha;
    private javax.swing.JTextField jTextIdMp;
    private javax.swing.JTextField jTextIdProv;
    private javax.swing.JTextField jTextNroLoteInt;
    private javax.swing.JFormattedTextField jTextNroLoteProv;
    private javax.swing.JFormattedTextField jTextNroRemito;
    private javax.swing.JTextField jTextRazonSocial;
    // End of variables declaration//GEN-END:variables
}
