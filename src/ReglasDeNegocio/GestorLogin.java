package ReglasDeNegocio;

import CapaDeDatos.UsuarioDAO;

/**
 *
 * @author Luciano
 */
public class GestorLogin {
    
    public int iniciarSesion(String user, String pass) {
        return (UsuarioDAO.iniciarSesion(user, pass));
        
    }

}
