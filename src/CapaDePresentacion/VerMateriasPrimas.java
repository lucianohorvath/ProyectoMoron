package CapaDePresentacion;

import ReglasDeNegocio.GestorMateriaPrima;
import javax.swing.JFrame;

/**
 *
 * @author Luciano
 */
public class VerMateriasPrimas extends javax.swing.JDialog {

    private static int operacion;
    private static GestorMateriaPrima gestor;
    private int idMp;
    private String descripcion;
     
    /**Este constructor se utiliza para que InformeRecepción sea su ventana padre.
     * 
     * @param padre el JFrame padre.
     * @param gestor para comunicarse con el DAO.
     * @param op 4 si se llama desde InformeRecepción.
     * @param idProv el id del proveedor seleccionado en el informe de recepción.
     */
    public VerMateriasPrimas(int op, GestorMateriaPrima gestor, JFrame padre, int idProv){
        super(padre, true);
        initComponents();
        inicializaciones(op, gestor);
        cargarTabla(idProv);
    }
    
    /**Constructor común, llamado previamente a realizar una baja/modificación de materia prima.   
     * 
     * @param op 2 si es modificación, 3 si es baja.
     * @param gestor para comunicarse con el DAO.
     */
    public VerMateriasPrimas(int op, GestorMateriaPrima gestor) {
        initComponents();
        inicializaciones(op, gestor);
        cargarTabla();
    }

    private void inicializaciones(int op, GestorMateriaPrima gestor){
        operacion = op;
        VerMateriasPrimas.gestor = gestor;
        if (operacion == 4)
            jBActualizar.setVisible(false);
    }
     
    public int getIdMp() {
        return idMp;
    }

    public String getDescripcion() {
        return descripcion;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTablaMateriasPrimas = new javax.swing.JTable();
        jBSeleccionar = new javax.swing.JButton();
        jBCancelar = new javax.swing.JButton();
        jBActualizar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Ver materias primas");
        setLocation(new java.awt.Point(300, 150));
        setResizable(false);
        addWindowFocusListener(new java.awt.event.WindowFocusListener() {
            public void windowGainedFocus(java.awt.event.WindowEvent evt) {
                formWindowGainedFocus(evt);
            }
            public void windowLostFocus(java.awt.event.WindowEvent evt) {
            }
        });

        jTablaMateriasPrimas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID Materia prima", "Descripción"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTablaMateriasPrimas);
        if (jTablaMateriasPrimas.getColumnModel().getColumnCount() > 0) {
            jTablaMateriasPrimas.getColumnModel().getColumn(0).setMinWidth(30);
            jTablaMateriasPrimas.getColumnModel().getColumn(0).setPreferredWidth(200);
            jTablaMateriasPrimas.getColumnModel().getColumn(0).setMaxWidth(250);
        }

        jBSeleccionar.setText("Seleccionar");
        jBSeleccionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBSeleccionarActionPerformed(evt);
            }
        });

        jBCancelar.setText("Cancelar");
        jBCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBCancelarActionPerformed(evt);
            }
        });

        jBActualizar.setText("Actualizar tabla");
        jBActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBActualizarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 602, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jBActualizar)
                .addGap(30, 30, 30)
                .addComponent(jBSeleccionar)
                .addGap(26, 26, 26)
                .addComponent(jBCancelar)
                .addGap(29, 29, 29))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 324, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBSeleccionar)
                    .addComponent(jBCancelar)
                    .addComponent(jBActualizar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBCancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_jBCancelarActionPerformed

    private void jBSeleccionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSeleccionarActionPerformed
        Object idSeleccionado = jTablaMateriasPrimas.getModel().getValueAt(jTablaMateriasPrimas.getSelectedRow(), 0);
        idMp = (int)idSeleccionado;
        
        if (operacion == 4){        //metodo llamado desde InformeRecepcion
            Object descripSeleccionada = jTablaMateriasPrimas.getModel().getValueAt(jTablaMateriasPrimas.getSelectedRow(), 1);
            descripcion = (String)descripSeleccionada;
            this.dispose();
        }
        else{
            ABMMateriaPrima abmMp = new ABMMateriaPrima(operacion, gestor, idMp, this);
            abmMp.setVisible(true);
        }                    
    }//GEN-LAST:event_jBSeleccionarActionPerformed

    private void jBActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBActualizarActionPerformed
        cargarTabla();
    }//GEN-LAST:event_jBActualizarActionPerformed

    private void formWindowGainedFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowGainedFocus
       if (operacion != 4) 
           cargarTabla();
    }//GEN-LAST:event_formWindowGainedFocus
    
    private void cargarTabla(){
        System.out.println ("Cargando la tabla de materias primas...");
                
        jTablaMateriasPrimas.setModel(gestor.traerTablaMateriaPrima());
    };
       
    private void cargarTabla(int idProveedor){
        System.out.println ("Cargando la tabla de materias primas...");
                
        jTablaMateriasPrimas.setModel(gestor.traerTablaMateriaPrima(idProveedor));
    };
     
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
            java.util.logging.Logger.getLogger(VerMateriasPrimas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VerMateriasPrimas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VerMateriasPrimas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VerMateriasPrimas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VerMateriasPrimas(operacion, gestor).setVisible(true);                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBActualizar;
    private javax.swing.JButton jBCancelar;
    private javax.swing.JButton jBSeleccionar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTablaMateriasPrimas;
    // End of variables declaration//GEN-END:variables
}
