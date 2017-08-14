package CapaDePresentacion;

import CapaDeDatos.AccesoADatos;
import ReglasDeNegocio.Administradora;
import javax.swing.JFrame;


public class Inicio extends javax.swing.JFrame {
    
    /**
     * Creates new form NewJFrame
     */
    Administradora admin;
    
    
    public Inicio() {
        initComponents();
        admin = new Administradora();
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
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenuABM = new javax.swing.JMenu();
        jMenuABMmp = new javax.swing.JMenu();
        jItemMpAlta = new javax.swing.JMenuItem();
        jItemMpModificacion = new javax.swing.JMenuItem();
        jItemMpBaja = new javax.swing.JMenuItem();
        jMenuABMpt = new javax.swing.JMenu();
        jItemPtAlta = new javax.swing.JMenuItem();
        jItemPtModificacion = new javax.swing.JMenuItem();
        jItemPtBaja = new javax.swing.JMenuItem();
        jMenuProveedores = new javax.swing.JMenu();
        jItemAltaProveedores = new javax.swing.JMenuItem();
        jItemModificacionProveedores = new javax.swing.JMenuItem();
        jItemBajaProveedores = new javax.swing.JMenuItem();
        jMenuTrazabilidad = new javax.swing.JMenu();
        jItemConsultarPorLote = new javax.swing.JMenuItem();
        jItemRegistrarInfRec = new javax.swing.JMenuItem();
        jMenuStock = new javax.swing.JMenu();
        jMenuStockMp = new javax.swing.JMenu();
        jItemStockMpAgregar = new javax.swing.JMenuItem();
        jItemStockMpDescontar = new javax.swing.JMenuItem();
        jMenuStockPt = new javax.swing.JMenu();
        jItemStockPtAgregar = new javax.swing.JMenuItem();
        jItemStockPtDescontar = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sistema");

        jInternalFrameIniciarSesion.setTitle("Iniciar sesión");
        jInternalFrameIniciarSesion.setToolTipText("Necesita una cuenta de usuario para utilizar el sistema.");
        jInternalFrameIniciarSesion.setPreferredSize(new java.awt.Dimension(300, 200));
        jInternalFrameIniciarSesion.setVisible(true);

        jLUsuario.setText("Usuario");

        jLContraseña.setText("Contraseña");

        jBIngresar.setText("Ingresar");

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

        jMenuProveedores.setText("Proveedores");

        jItemAltaProveedores.setText("Alta");
        jItemAltaProveedores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jItemAltaProveedoresActionPerformed(evt);
            }
        });
        jMenuProveedores.add(jItemAltaProveedores);

        jItemModificacionProveedores.setText("Modificación");
        jItemModificacionProveedores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jItemModificacionProveedoresActionPerformed(evt);
            }
        });
        jMenuProveedores.add(jItemModificacionProveedores);

        jItemBajaProveedores.setText("Baja");
        jItemBajaProveedores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jItemBajaProveedoresActionPerformed(evt);
            }
        });
        jMenuProveedores.add(jItemBajaProveedores);

        jMenuABM.add(jMenuProveedores);

        jMenuBar1.add(jMenuABM);

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

        jMenuBar1.add(jMenuTrazabilidad);

        jMenuStock.setText("Control de stock");

        jMenuStockMp.setText("Materia prima");

        jItemStockMpAgregar.setText("Agregar");
        jItemStockMpAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jItemStockMpAgregarActionPerformed(evt);
            }
        });
        jMenuStockMp.add(jItemStockMpAgregar);

        jItemStockMpDescontar.setText("Descontar");
        jItemStockMpDescontar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jItemStockMpDescontarActionPerformed(evt);
            }
        });
        jMenuStockMp.add(jItemStockMpDescontar);

        jMenuStock.add(jMenuStockMp);

        jMenuStockPt.setText("Producto terminado");

        jItemStockPtAgregar.setText("Agregar");
        jItemStockPtAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jItemStockPtAgregarActionPerformed(evt);
            }
        });
        jMenuStockPt.add(jItemStockPtAgregar);

        jItemStockPtDescontar.setText("Descontar");
        jItemStockPtDescontar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jItemStockPtDescontarActionPerformed(evt);
            }
        });
        jMenuStockPt.add(jItemStockPtDescontar);

        jMenuStock.add(jMenuStockPt);

        jMenuBar1.add(jMenuStock);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(170, 170, 170)
                .addComponent(jInternalFrameIniciarSesion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(619, 619, 619))
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
        // TODO add your handling code here:
    }//GEN-LAST:event_jBSalirActionPerformed

    private void jItemConsultarPorLoteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jItemConsultarPorLoteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jItemConsultarPorLoteActionPerformed

    private void jItemMpAltaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jItemMpAltaActionPerformed
        MpAlta mpa = new MpAlta();
        mpa.setVisible(true);
    }//GEN-LAST:event_jItemMpAltaActionPerformed

    private void jItemMpModificacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jItemMpModificacionActionPerformed
        MpModificacion mpm = new MpModificacion();
        mpm.setVisible(true);
    }//GEN-LAST:event_jItemMpModificacionActionPerformed

    private void jItemMpBajaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jItemMpBajaActionPerformed
        MpBaja mpb = new MpBaja();
        mpb.setVisible(true);
    }//GEN-LAST:event_jItemMpBajaActionPerformed

    private void jItemPtAltaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jItemPtAltaActionPerformed
        PtAlta pta = new PtAlta();
        pta.setVisible(true);
    }//GEN-LAST:event_jItemPtAltaActionPerformed

    private void jItemPtModificacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jItemPtModificacionActionPerformed
        PtModificacion ptm = new PtModificacion();
        ptm.setVisible(true);
    }//GEN-LAST:event_jItemPtModificacionActionPerformed

    private void jItemPtBajaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jItemPtBajaActionPerformed
        PtBaja ptb = new PtBaja();
        ptb.setVisible(true);
    }//GEN-LAST:event_jItemPtBajaActionPerformed

    private void jItemStockPtAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jItemStockPtAgregarActionPerformed
        AgregarStockPt agregarPt = new AgregarStockPt();
        agregarPt.setVisible(true);
    }//GEN-LAST:event_jItemStockPtAgregarActionPerformed

    private void jItemStockMpAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jItemStockMpAgregarActionPerformed
        AgregarStockMp agregarMp = new AgregarStockMp();
        agregarMp.setVisible(true);
    }//GEN-LAST:event_jItemStockMpAgregarActionPerformed

    private void jItemStockPtDescontarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jItemStockPtDescontarActionPerformed
        DescontarStockPt descontarPt = new DescontarStockPt();
        descontarPt.setVisible(true);
    }//GEN-LAST:event_jItemStockPtDescontarActionPerformed

    private void jItemStockMpDescontarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jItemStockMpDescontarActionPerformed
        DescontarStockMp descontarMp = new DescontarStockMp();
        descontarMp.setVisible(true);
    }//GEN-LAST:event_jItemStockMpDescontarActionPerformed

    private void jItemAltaProveedoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jItemAltaProveedoresActionPerformed
        ABMProveedores abmProv = new ABMProveedores(1, admin);
        abmProv.setVisible(true);
    }//GEN-LAST:event_jItemAltaProveedoresActionPerformed

    private void jItemModificacionProveedoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jItemModificacionProveedoresActionPerformed
        VerProveedores tablaProv = new VerProveedores(2, admin);
        tablaProv.setVisible(true);
    }//GEN-LAST:event_jItemModificacionProveedoresActionPerformed

    private void jItemBajaProveedoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jItemBajaProveedoresActionPerformed
        VerProveedores tablaProv = new VerProveedores(3, admin);
        tablaProv.setVisible(true);
        
    }//GEN-LAST:event_jItemBajaProveedoresActionPerformed

    private void jItemRegistrarInfRecActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jItemRegistrarInfRecActionPerformed
        InformeRecepcionAlta infRec = new InformeRecepcionAlta();
        infRec.setVisible(true);
    }//GEN-LAST:event_jItemRegistrarInfRecActionPerformed

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
    private javax.swing.JMenuItem jItemConsultarPorLote;
    private javax.swing.JMenuItem jItemModificacionProveedores;
    private javax.swing.JMenuItem jItemMpAlta;
    private javax.swing.JMenuItem jItemMpBaja;
    private javax.swing.JMenuItem jItemMpModificacion;
    private javax.swing.JMenuItem jItemPtAlta;
    private javax.swing.JMenuItem jItemPtBaja;
    private javax.swing.JMenuItem jItemPtModificacion;
    private javax.swing.JMenuItem jItemRegistrarInfRec;
    private javax.swing.JMenuItem jItemStockMpAgregar;
    private javax.swing.JMenuItem jItemStockMpDescontar;
    private javax.swing.JMenuItem jItemStockPtAgregar;
    private javax.swing.JMenuItem jItemStockPtDescontar;
    private javax.swing.JLabel jLContraseña;
    private javax.swing.JLabel jLUsuario;
    private javax.swing.JMenu jMenuABM;
    private javax.swing.JMenu jMenuABMmp;
    private javax.swing.JMenu jMenuABMpt;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu jMenuProveedores;
    private javax.swing.JMenu jMenuStock;
    private javax.swing.JMenu jMenuStockMp;
    private javax.swing.JMenu jMenuStockPt;
    private javax.swing.JMenu jMenuTrazabilidad;
    private javax.swing.JPasswordField jPasswordFieldContraseña;
    private javax.swing.JTextField jTFUsuario;
    // End of variables declaration//GEN-END:variables
}
