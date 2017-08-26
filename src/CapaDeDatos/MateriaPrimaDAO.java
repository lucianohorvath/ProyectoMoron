package CapaDeDatos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Luciano
 */
public class MateriaPrimaDAO {
    
    /**Lee la tabla MateriaPrima de la base de datos y trae todos los registros en un 
     * DefaultTableModel.
     * 
     * @return el modelo para asignar en el JTable.
     */
    public static DefaultTableModel leerTablaMateriaPrimaYDevolverModelo() {
        Connection con;
        Statement sentencia;
        ResultSet rs;
        DefaultTableModel modelo = new DefaultTableModel();
        
        modelo.addColumn("ID");
        modelo.addColumn("Descripción");
        
        try {
            //Obtenemos la conexion a la base de datos
            con = Conexion.obtenerConexion();
            sentencia = con.createStatement();
            rs = sentencia.executeQuery("SELECT * FROM MateriaPrima");
            
            while (rs.next()) {
                Object[] fila = new Object[2];
                fila[0] = rs.getInt("IdMateriaPrima");
                fila[1] = rs.getNString("Descripcion");
                                
                modelo.addRow(fila);
            }
            
            rs.close();
            sentencia.close();
            con.close();
        } catch (ClassNotFoundException ex) {
            System.out.println("Error en el driver. " + ex.getMessage());
        } catch (SQLException ex) {
            System.out.println("Error en la consulta. " + ex.getMessage());
        }
        return modelo;
    }
    
    /**Lee la tabla MateriaPrima de la base de datos y trae todos los registros de materias primas
     * que provee el proveedor en cuestión.
     * 
     * @param idProveedor el proveedor en cuestión.
     * @return el modelo para asignar en el JTable.
     */
    public static DefaultTableModel leerTablaMateriaPrimaYDevolverModelo(int idProveedor) {
        Connection con;
        ResultSet rs;
        DefaultTableModel modelo = new DefaultTableModel();
        
        modelo.addColumn("ID");
        modelo.addColumn("Descripción");
        
        try {
            //Obtenemos la conexion a la base de datos
            con = Conexion.obtenerConexion();
            PreparedStatement ps = con.prepareStatement("SELECT * FROM MateriaPrima WHERE IdMateriaPrima IN "
                    + "(SELECT IdMateriaPrima FROM MateriaPrima_Proveedor WHERE IdProveedor = ?)");
            
            ps.setInt(1, idProveedor);
            rs = ps.executeQuery();
            
            while (rs.next()) {
                Object[] fila = new Object[2];
                fila[0] = rs.getInt("IdMateriaPrima");
                fila[1] = rs.getNString("Descripcion");
                                
                modelo.addRow(fila);
            }
            
            rs.close();
            ps.close();
            con.close();            
        } catch (ClassNotFoundException ex) {
            System.out.println("Error en el driver. " + ex.getMessage());
        } catch (SQLException ex) {
            System.out.println("Error en la consulta. " + ex.getMessage());
        }
        return modelo;
    }
    
    
}
