package CapaDeDatos;

import Modelo.MateriaPrima;
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
    
    public static int altaMateriaPrima(String descripcion) {
        int lineasAfectadas = 0;
        Connection con;   
        
        try {
            con = Conexion.obtenerConexion();

            PreparedStatement ps = con.prepareStatement("INSERT INTO MateriaPrima "
                    + "(Descripcion) VALUES (?)");

            ps.setString(1, descripcion);

            lineasAfectadas = ps.executeUpdate();
            con.close();
        }
        
        catch(SQLException ex){
            System.out.println("Error en la consulta. " + ex.getMessage());
        }
        catch (ClassNotFoundException ex) {
            System.out.println("Error en el driver. " + ex.getMessage());
        }
        
        return lineasAfectadas;
    }
    
    public static int bajaMateriaPrima(int idMp){
        int lineasAfectadas = 0;
        Connection con;
        
        try {
            con = Conexion.obtenerConexion();
            Statement sentencia = con.createStatement();
            
            lineasAfectadas = sentencia.executeUpdate("DELETE FROM MateriaPrima"
                    + " WHERE IdMercaderia = " + idMp);
            con.close();            
        }
        catch(SQLException ex){
            System.out.println("Error en la consulta. " + ex.getMessage());
        }
        catch (ClassNotFoundException ex) {
            System.out.println("Error en el driver. " + ex.getMessage());
        }        
        
        return lineasAfectadas;
    }
    
    public static int modificarMateriaPrima(int idMp, String descripcion){
        int lineasAfectadas = 0;
        Connection con;   
        
        try {
            con = Conexion.obtenerConexion();

            PreparedStatement ps = con.prepareStatement("UPDATE MateriaPrima SET Descripcion = "
                    + "? WHERE IdMateriaPrima = ?");

            ps.setString(1, descripcion);
            ps.setInt(2, idMp);

            lineasAfectadas = ps.executeUpdate();
            con.close();
        }
        
        catch(SQLException ex){
            System.out.println("Error en la consulta. " + ex.getMessage());
        }
        catch (ClassNotFoundException ex) {
            System.out.println("Error en el driver. " + ex.getMessage());
        }
        
        return lineasAfectadas;
    }
    
    
    //MODIFICAR PARA QUE NO CONOZCA MATERIA PRIMA
    //ASI CUMPLE CON LA REGLA DE LAS TRES CAPAS.
    public static MateriaPrima traerMp(int idMp){
        MateriaPrima pt = null;
        Connection con;
        Statement st;
        
        try {
            con = Conexion.obtenerConexion();
            st = con.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM Mercaderia WHERE IdMercaderia = " + idMp);
            
            if (rs.next()) {
                pt = new MateriaPrima();
                
                pt.setId(idMp);
                pt.setDescripcion(rs.getNString("Descripcion"));
            } 
            st.close();
            con.close();
            
        } catch (ClassNotFoundException e) {
            System.out.println("Error en el driver. " + e.getMessage());
        } catch (SQLException e) {
            System.out.println("Error en la consulta. " + e.getMessage());
        }
        return pt;
    }
    
    /**Lee la tabla MateriaPrima de la base de datos y trae todos los registros en un 
     * DefaultTableModel.
     * 
     * @return el modelo para asignar en el JTable.
     */
    public static DefaultTableModel traerTablaMateriaPrima() {
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
    public static DefaultTableModel traerTablaMateriaPrima(int idProveedor) {
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
