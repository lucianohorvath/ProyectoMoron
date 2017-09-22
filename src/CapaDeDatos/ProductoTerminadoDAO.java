package CapaDeDatos;

import Modelo.ProductoTerminado;
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
public class ProductoTerminadoDAO {
    
    public static int altaProductoTerminado(String descripcion) {
        int lineasAfectadas = 0;
        Connection con;   
        
        try {
            con = Conexion.obtenerConexion();

            PreparedStatement ps = con.prepareStatement("INSERT INTO Mercaderia "
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
    
    public static int bajaProductoTerminado(int idPt){
        int lineasAfectadas = 0;
        Connection con;
        
        try {
            con = Conexion.obtenerConexion();
            Statement sentencia = con.createStatement();
            
            lineasAfectadas = sentencia.executeUpdate("DELETE FROM Mercaderia WHERE IdMercaderia = " + idPt);
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

    public static int modificarProductoTerminado(ProductoTerminado pt){
        int lineasAfectadas = 0;
        Connection con;   
        
        try {
            con = Conexion.obtenerConexion();

            PreparedStatement ps = con.prepareStatement("UPDATE Mercaderia SET Descripcion = "
                    + "? WHERE IdMercaderia = ?");

            ps.setString(1,pt.getDescripcion());
            ps.setInt(2, pt.getId());

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
    
    public static DefaultTableModel leerTablaProdTerminados(DefaultTableModel modelo){
        Connection con;
        Statement sentencia;
        ResultSet rs;
        modelo.setRowCount(0);          //Borro los datos anteriores para evitar duplicación        
        
        try {
            con = Conexion.obtenerConexion();
            sentencia = con.createStatement();
            rs = sentencia.executeQuery("SELECT * FROM Mercaderia");
            
            while (rs.next()) {
                Object[] fila = new Object[2];
                fila[0] = rs.getInt("IdMercaderia");
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
    
    public static ProductoTerminado traerPt(int idPt){
        ProductoTerminado pt = null;
        Connection con;
        Statement st;
        
        try {
            con = Conexion.obtenerConexion();
            st = con.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM Mercaderia WHERE IdMercaderia = " + idPt);
            
            if (rs.next()) {
                pt = new ProductoTerminado();
                
                pt.setId(idPt);
                pt.setDescripcion(rs.getNString("Descripcion"));                
                pt.setStock(rs.getInt("Stock"));
                pt.setStockCritico(rs.getInt("StockCritico"));
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
    
     public static ProductoTerminado traerPt(String descripcion){
        ProductoTerminado pt = null;
        Connection con;
        Statement st;
        
        try {
            con = Conexion.obtenerConexion();
            st = con.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM Mercaderia WHERE Descripcion = '"
                    + descripcion + "'");
            
            if (rs.next()) {
                pt = new ProductoTerminado();
                
                pt.setId(rs.getInt("IdMercaderia"));
                pt.setDescripcion(descripcion);
                pt.setStock(rs.getInt("Stock"));
                pt.setStockCritico(rs.getInt("StockCritico"));
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
    
    public static DefaultTableModel traerTablaPtConStock (DefaultTableModel modelo) {
        Connection con;
        Statement sentencia;
        ResultSet rs;
        modelo.setRowCount(0); 
        
        try {
            con = Conexion.obtenerConexion();
            sentencia = con.createStatement();
            rs = sentencia.executeQuery("SELECT * FROM Mercaderia ORDER BY IdMercaderia");
            
            while (rs.next()) {
                Object[] fila = new Object[6];
                fila[0] = rs.getInt("IdMercaderia");
                fila[1] = rs.getNString("Descripcion");
                fila[2] = rs.getInt("Stock");
                fila[3] = rs.getInt("StockCritico");
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
    
    public static DefaultTableModel traerTablaPtConStock (DefaultTableModel modelo, int idPt) {
        Connection con;
        Statement sentencia;
        ResultSet rs;
        modelo.setRowCount(0); 
        
        try {
            con = Conexion.obtenerConexion();
            sentencia = con.createStatement();
            rs = sentencia.executeQuery("SELECT * FROM Mercaderia WHERE IdMercaderia = " + idPt
                    + " ORDER BY IdMercaderia");
            
            while (rs.next()) {
                Object[] fila = new Object[6];
                fila[0] = rs.getInt("IdMercaderia");
                fila[1] = rs.getNString("Descripcion");
                fila[2] = rs.getInt("Stock");
                fila[3] = rs.getInt("StockCritico");
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
    
    
    public static int modificarStock(int idPt, int cantidad){
        int lineasAfectadas = 0;
        Connection con;   
        
        try {
            con = Conexion.obtenerConexion();

            PreparedStatement ps = con.prepareStatement("UPDATE Mercaderia SET Stock = "
                    + "Stock + ? WHERE IdMercaderia = ?");

            ps.setInt(1, cantidad);
            ps.setInt(2, idPt);

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
    
}
