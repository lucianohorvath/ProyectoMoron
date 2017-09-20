package CapaDeDatos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Luciano
 */
public class UsuarioDAO {

    public static int iniciarSesion(String user, String pass) {
        int rolUsuario = 0;
        ResultSet rs;
        
        try {
            Connection con = Conexion.obtenerConexion();

            PreparedStatement ps = con.prepareStatement("SELECT * FROM Usuario WHERE NombreUsuario "
                    + "= ? AND Contraseña = ?");

            ps.setString(1, user);
            ps.setString(2, pass);

            rs = ps.executeQuery();
            
            if (rs.next())
                rolUsuario = rs.getInt("Rol");
            
            con.close();
        }
        
        catch(SQLException ex){
            System.out.println("Error en la consulta. " + ex.getMessage());
        }
        catch (ClassNotFoundException ex) {
            System.out.println("Error en el driver. " + ex.getMessage());
        }
        
        return rolUsuario;
    }
    
}
