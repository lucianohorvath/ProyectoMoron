package CapaDePresentacion;

import ReglasDeNegocio.GestorProveedor;
import ReglasDeNegocio.GestorProductoTerminado;
import ReglasDeNegocio.GestorInformeRecepcion;
import ReglasDeNegocio.GestorLogin;
import Modelo.Usuario;
import ReglasDeNegocio.GestorMateriaPrima;
import java.awt.Component;
import javax.swing.JOptionPane;


public class Inicio extends javax.swing.JFrame {
    
    /**
     * Creates new form NewJFrame
     */
    private GestorProveedor gestorProveedor;
    private GestorProductoTerminado gestorPt;
    private GestorMateriaPrima gestorMp;
    private GestorInformeRecepcion gestorInformeR;
    private GestorLogin gestorL;
    //private int rolUsuario;
    
    public Inicio() {
        initComponents();
        inicializaciones();
    }

    private void inicializaciones(){
        //todos estos gestores podrían ser singleton
        gestorProveedor = new GestorProveedor();
        gestorInformeR = new GestorInformeRecepcion();
        gestorMp = new GestorMateriaPrima();
        gestorPt = new GestorProductoTerminado();
        gestorL = new GestorLogin();
        //int rolUsuario = 0;
        modificarVentana();             //o hago esto o hago modal la ventana interna, de lo contrario se puede acceder a todos los menues.
        //this.setExtendedState(JFrame.MAXIMIZED_BOTH);           // Para iniciar maximizada.
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jInternalFrameIniciarSesion = new javax.swing.JInternalFrame();
        jLUsuario = new javax.swing.JLabel();
        jLContraseña = new javax.swing.JLabel();
        jTFUsuario = new javax.swing.JTextField();
        jPasswordFieldContraseña = new javax.swing.JPasswordField();
        jBIngresar = new javax.swing.JButton();
        jBSalir = new javax.swing.JButton();
        jMenuPrincipal = new javax.swing.JMenuBar();
        jMenuABM = new javax.swing.JMenu();
        jMenuABMmp = new javax.swing.JMenu();
        jItemMpAlta = new javax.swing.JMenuItem();
        jItemMpModificacion = new javax.swing.JMenuItem();
        jItemMpBaja = new javax.swing.JMenuItem();
        jMenuABMpt = new javax.swing.JMenu();
        jItemPtAlta = new javax.swing.JMenuItem();
        jItemPtModificacion = new javax.swing.JMenuItem();
        jItemPtBaja = new javax.swing.JMenuItem();
        jMenuABMProveedores = new javax.swing.JMenu();
        jItemAltaProveedores = new javax.swing.JMenuItem();
        jItemModificacionProveedores = new javax.swing.JMenuItem();
        jItemBajaProveedores = new javax.swing.JMenuItem();
        jMenuTrazabilidad = new javax.swing.JMenu();
        jItemConsultarPorLote = new javax.swing.JMenuItem();
        jItemRegistrarInfRec = new javax.swing.JMenuItem();
        jMenuStock = new javax.swing.JMenu();
        jItemStockMp = new javax.swing.JMenuItem();
        jItemStockPt = new javax.swing.JMenuItem();
        jMenuSesion = new javax.swing.JMenu();
        jItemIniciarSesion = new javax.swing.JMenuItem();
        jItemCerrarSesion = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sistema");

        jInternalFrameIniciarSesion.setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        jInternalFrameIniciarSesion.setTitle("Iniciar sesión");
        jInternalFrameIniciarSesion.setToolTipText("Necesita una cuenta de usuario para utilizar el sistema.");
        jInternalFrameIniciarSesion.setPreferredSize(new java.awt.Dimension(300, 200));
        jInternalFrameIniciarSesion.setVisible(true);

        jLUsuario.setText("Usuario");

        jLContraseña.setText("Contraseña");

        jPasswordFieldContraseña.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordFieldContraseñaActionPerformed(evt);
            }
        });

        jBIngresar.setText("Ingresar");
        jBIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBIngresarActionPerformed(evt);
            }
        });

        jBSalir.setText("Salir");
        jBSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jInternalFrameIniciarSesionLayout = new javax.swing.GroupLayout(jInternalFrameIniciarSesion.getContentPane());
        jInternalFrameIniciarSesion.getContentPane().setLayout(jInternalFrameIniciarSesionLayout);
        jInternalFrameIniciarSesionLayout.setHorizontalGroup(
            jInternalFrameIniciarSesionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrameIniciarSesionLayout.createSequentialGroup()
                .addContainerGap(52, Short.MAX_VALUE)
                .addComponent(jBIngresar)
                .addGap(36, 36, 36)
                .addComponent(jBSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50))
            .addGroup(jInternalFrameIniciarSesionLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jInternalFrameIniciarSesionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jInternalFrameIniciarSesionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTFUsuario)
                    .addComponent(jPasswordFieldContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30))
        );
        jInternalFrameIniciarSesionLayout.setVerticalGroup(
            jInternalFrameIniciarSesionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrameIniciarSesionLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jInternalFrameIniciarSesionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTFUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jInternalFrameIniciarSesionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jPasswordFieldContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLContraseña, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(32, 32, 32)
                .addGroup(jInternalFrameIniciarSesionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBIngresar)
                    .addComponent(jBSalir))
                .addGap(20, 20, 20))
        );

        jMenuABM.setText("ABM");

        jMenuABMmp.setText("Materia prima");

        jItemMpAlta.setText("Alta");
        jItemMpAlta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jItemMpAltaActionPerformed(evt);
            }
        });
        jMenuABMmp.add(jItemMpAlta);

        jItemMpModificacion.setText("Modificación");
        jItemMpModificacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jItemMpModificacionActionPerformed(evt);
            }
        });
        jMenuABMmp.add(jItemMpModificacion);

        jItemMpBaja.setText("Baja");
        jItemMpBaja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jItemMpBajaActionPerformed(evt);
            }
        });
        jMenuABMmp.add(jItemMpBaja);

        jMenuABM.add(jMenuABMmp);

        jMenuABMpt.setText("Producto terminado");

        jItemPtAlta.setText("Alta");
        jItemPtAlta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jItemPtAltaActionPerformed(evt);
            }
        });
        jMenuABMpt.add(jItemPtAlta);

        jItemPtModificacion.setText("Modificación");
        jItemPtModificacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jItemPtModificacionActionPerformed(evt);
            }
        });
        jMenuABMpt.add(jItemPtModificacion);

        jItemPtBaja.setText("Baja");
        jItemPtBaja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jItemPtBajaActionPerformed(evt);
            }
        });
        jMenuABMpt.add(jItemPtBaja);

        jMenuABM.add(jMenuABMpt);

        jMenuABMProveedores.setText("Proveedores");

        jItemAltaProveedores.setText("Alta");
        jItemAltaProveedores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jItemAltaProveedoresActionPerformed(evt);
            }
        });
        jMenuABMProveedores.add(jItemAltaProveedores);

        jItemModificacionProveedores.setText("Modificación");
        jItemModificacionProveedores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jItemModificacionProveedoresActionPerformed(evt);
            }
        });
        jMenuABMProveedores.add(jItemModificacionProveedores);

        jItemBajaProveedores.setText("Baja");
        jItemBajaProveedores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jItemBajaProveedoresActionPerformed(evt);
            }
        });
        jMenuABMProveedores.add(jItemBajaProveedores);

        jMenuABM.add(jMenuABMProveedores);

        jMenuPrincipal.add(jMenuABM);

        jMenuTrazabilidad.setText("Trazabilidad");

        jItemConsultarPorLote.setText("Consultar por lote...");
        jItemConsultarPorLote.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jItemConsultarPorLoteActionPerformed(evt);
            }
        });
        jMenuTrazabilidad.add(jItemConsultarPorLote);

        jItemRegistrarInfRec.setText("Registrar informe de recepción...");
        jItemRegistrarInfRec.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jItemRegistrarInfRecActionPerformed(evt);
            }
        });
        jMenuTrazabilidad.add(jItemRegistrarInfRec);

        jMenuPrincipal.add(jMenuTrazabilidad);

        jMenuStock.setText("Control de stock");

        jItemStockMp.setText("Materias primas");
        jItemStockMp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jItemStockMpActionPerformed(evt);
            }
        });
        jMenuStock.add(jItemStockMp);

        jItemStockPt.setText("Productos terminados");
        jItemStockPt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jItemStockPtActionPerformed(evt);
            }
        });
        jMenuStock.add(jItemStockPt);

        jMenuPrincipal.add(jMenuStock);

        jMenuSesion.setText("Sesión");

        jItemIniciarSesion.setText("Iniciar sesión");
        jItemIniciarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jItemIniciarSesionActionPerformed(evt);
            }
        });
        jMenuSesion.add(jItemIniciarSesion);

        jItemCerrarSesion.setText("Cerrar sesión");
        jItemCerrarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jItemCerrarSesionActionPerformed(evt);
            }
        });
        jMenuSesion.add(jItemCerrarSesion);

        jMenuPrincipal.add(jMenuSesion);

        setJMenuBar(jMenuPrincipal);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(170, 170, 170)
                .addComponent(jInternalFrameIniciarSesion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(170, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(129, 129, 129)
                .addComponent(jInternalFrameIniciarSesion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(130, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jBSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSalirActionPerformed
        if (Usuario.getUsuarioSingleton().getRol() != 0)            //permite salir sólo si ya se inició sesión
            jInternalFrameIniciarSesion.dispose();
        else
            JOptionPane.showMessageDialog(this, "Debe iniciar sesión para utilizar el sistema.");
    }//GEN-LAST:event_jBSalirActionPerformed

    private void jItemConsultarPorLoteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jItemConsultarPorLoteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jItemConsultarPorLoteActionPerformed

    private void jItemMpAltaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jItemMpAltaActionPerformed
        ABMMateriaPrima abmMp = new ABMMateriaPrima(1, gestorMp, gestorProveedor);
        abmMp.setVisible(true);
    }//GEN-LAST:event_jItemMpAltaActionPerformed

    private void jItemMpModificacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jItemMpModificacionActionPerformed
        VerMateriasPrimas verMp = new VerMateriasPrimas(2, gestorMp);
        verMp.setVisible(true);
    }//GEN-LAST:event_jItemMpModificacionActionPerformed

    private void jItemMpBajaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jItemMpBajaActionPerformed
        VerMateriasPrimas verMp = new VerMateriasPrimas(3, gestorMp);
        verMp.setVisible(true);
    }//GEN-LAST:event_jItemMpBajaActionPerformed

    private void jItemPtAltaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jItemPtAltaActionPerformed
        ABMProductoTerminado abmPt = new ABMProductoTerminado(1, gestorPt);
        abmPt.setVisible(true);
    }//GEN-LAST:event_jItemPtAltaActionPerformed

    private void jItemPtModificacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jItemPtModificacionActionPerformed
        VerProductosTerminados verPt = new VerProductosTerminados(2, gestorPt);
        verPt.setVisible(true);
    }//GEN-LAST:event_jItemPtModificacionActionPerformed

    private void jItemPtBajaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jItemPtBajaActionPerformed
        VerProductosTerminados verPt = new VerProductosTerminados(3, gestorPt);
        verPt.setVisible(true);
    }//GEN-LAST:event_jItemPtBajaActionPerformed

    private void jItemStockPtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jItemStockPtActionPerformed
        Stock st = new Stock(gestorMp, gestorPt);
        st.mostrarPestanaPt();
        st.setVisible(true);
    }//GEN-LAST:event_jItemStockPtActionPerformed

    private void jItemStockMpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jItemStockMpActionPerformed
        Stock st = new Stock(gestorMp, gestorPt);
        st.setVisible(true);
    }//GEN-LAST:event_jItemStockMpActionPerformed

    private void jItemAltaProveedoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jItemAltaProveedoresActionPerformed
        ABMProveedores abmProv = new ABMProveedores(1, gestorProveedor);
        abmProv.setVisible(true);
    }//GEN-LAST:event_jItemAltaProveedoresActionPerformed

    private void jItemModificacionProveedoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jItemModificacionProveedoresActionPerformed
        VerProveedores tablaProv = new VerProveedores(2, gestorProveedor);
        tablaProv.setVisible(true);
    }//GEN-LAST:event_jItemModificacionProveedoresActionPerformed

    private void jItemBajaProveedoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jItemBajaProveedoresActionPerformed
        VerProveedores tablaProv = new VerProveedores(3, gestorProveedor);
        tablaProv.setVisible(true);
    }//GEN-LAST:event_jItemBajaProveedoresActionPerformed

    private void jItemRegistrarInfRecActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jItemRegistrarInfRecActionPerformed
        RegistrarInformeRecepcion infRec = new RegistrarInformeRecepcion(gestorInformeR, gestorProveedor, gestorMp);
        infRec.setVisible(true);
    }//GEN-LAST:event_jItemRegistrarInfRecActionPerformed

    private void jBIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBIngresarActionPerformed
        String nick = jTFUsuario.getText();
        String pass = String.valueOf(jPasswordFieldContraseña.getPassword());
        
        Usuario.getUsuarioSingleton().setNombreUsuario(nick);        
        Usuario.getUsuarioSingleton().setContraseña(pass);
        Usuario.getUsuarioSingleton().setRol(gestorL.iniciarSesion(nick, pass));
        
        if (Usuario.getUsuarioSingleton().getRol() == 0){
            JOptionPane.showMessageDialog(this, "Error al iniciar sesión.");
        }
        else{
            JOptionPane.showMessageDialog(this, "Inició sesión con éxito.");
            jInternalFrameIniciarSesion.dispose();
            modificarVentana();
        }   
    }//GEN-LAST:event_jBIngresarActionPerformed

    private void jItemIniciarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jItemIniciarSesionActionPerformed
        jTFUsuario.setText("");
        jPasswordFieldContraseña.setText("");        
        jInternalFrameIniciarSesion.setVisible(true);
        jTFUsuario.requestFocus();
    }//GEN-LAST:event_jItemIniciarSesionActionPerformed

    private void jItemCerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jItemCerrarSesionActionPerformed
        Usuario.getUsuarioSingleton().setRol(0);
        modificarVentana();
        JOptionPane.showMessageDialog(this, "Finalizó la sesión.");
    }//GEN-LAST:event_jItemCerrarSesionActionPerformed

    private void jPasswordFieldContraseñaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordFieldContraseñaActionPerformed
        jBIngresarActionPerformed(evt);
    }//GEN-LAST:event_jPasswordFieldContraseñaActionPerformed
    
    /**
     * Modifica la ventana según los permisos que posea el usuario que inició sesión.
     * El rol 0 (cero) indica que no hay ninguna sesión iniciada.
     */
    private void modificarVentana() {
        switch(Usuario.getUsuarioSingleton().getRol()){
            case 0: {
                    deshabilitarMenues();
                    break;
            }
            case 1: {        
                    habilitarTodo();
                    break;
            }
            case 2: {
                    habilitarTodo();
                    deshabilitarABM();
                    break;
            }
        }
    }
    
    private void deshabilitarMenues() {
        Component[] listaMenues = jMenuPrincipal.getComponents();
        
        for (Component c: listaMenues)
            c.setEnabled(false);
        
        jMenuSesion.setEnabled(true);
    }

    private void habilitarTodo(){
        Component[] listaMenues = jMenuPrincipal.getComponents();
        
        for (Component c: listaMenues)
            c.setEnabled(true);
    }
    
    private void deshabilitarABM(){
        jMenuABM.setEnabled(false);
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
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
              //AccesoADatos.Conectar();         para qué acá? Si después se conecta en cada operación.
                new Inicio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBIngresar;
    private javax.swing.JButton jBSalir;
    private javax.swing.JInternalFrame jInternalFrameIniciarSesion;
    private javax.swing.JMenuItem jItemAltaProveedores;
    private javax.swing.JMenuItem jItemBajaProveedores;
    private javax.swing.JMenuItem jItemCerrarSesion;
    private javax.swing.JMenuItem jItemConsultarPorLote;
    private javax.swing.JMenuItem jItemIniciarSesion;
    private javax.swing.JMenuItem jItemModificacionProveedores;
    private javax.swing.JMenuItem jItemMpAlta;
    private javax.swing.JMenuItem jItemMpBaja;
    private javax.swing.JMenuItem jItemMpModificacion;
    private javax.swing.JMenuItem jItemPtAlta;
    private javax.swing.JMenuItem jItemPtBaja;
    private javax.swing.JMenuItem jItemPtModificacion;
    private javax.swing.JMenuItem jItemRegistrarInfRec;
    private javax.swing.JMenuItem jItemStockMp;
    private javax.swing.JMenuItem jItemStockPt;
    private javax.swing.JLabel jLContraseña;
    private javax.swing.JLabel jLUsuario;
    private javax.swing.JMenu jMenuABM;
    private javax.swing.JMenu jMenuABMProveedores;
    private javax.swing.JMenu jMenuABMmp;
    private javax.swing.JMenu jMenuABMpt;
    private javax.swing.JMenuBar jMenuPrincipal;
    private javax.swing.JMenu jMenuSesion;
    private javax.swing.JMenu jMenuStock;
    private javax.swing.JMenu jMenuTrazabilidad;
    private javax.swing.JPasswordField jPasswordFieldContraseña;
    private javax.swing.JTextField jTFUsuario;
    // End of variables declaration//GEN-END:variables
}
