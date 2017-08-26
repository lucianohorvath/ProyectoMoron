package CapaDeDatos;

import ReglasDeNegocio.ProductoTerminado;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Luciano
 */
public class ProductoTerminadoDAO {
    
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

    public static int altaProductoTerminado(ProductoTerminado pt) {
        int lineasAfectadas = 0;
        Connection con;   
        
        try {
            con = Conexion.obtenerConexion();

            PreparedStatement ps = con.prepareStatement("INSERT INTO Mercaderia "
                    + "(IdMercaderia, Descripcion) VALUES (?,?)");

            ps.setInt(1, pt.getId());
            ps.setString(2, pt.getDescripcion());

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
