package ReglasDeNegocio;
import CapaDeDatos.*;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Administradora {
    
    public static int darId(){
        int id = 0;
        
        return id;
    }
    
    public void cargarFormula(ProductoTerminado p){
        // esperar al formulario
    }    
    
    
    // Hace falta pasar por esta clase? O las ventanas pueden directamente llamar a AccesoADatos?
    // El año pasado haciamos eso (con la clase "Intermediario")
    
    public int darAltaProveedor(Proveedor prov){
       
        try{
            AccesoADatos d = new AccesoADatos();
            return (d.altaProveedor(prov));
        }
       
        catch(SQLException ex){
            System.out.println("Error en la consulta. " + ex.getMessage());
            return 0;
        }
        catch (ClassNotFoundException ex) {
            System.out.println("Error en el driver. " + ex.getMessage());
            return 0;
        }
    }
    
    public int darBajaProveedor(int idProv) {
        try{
            AccesoADatos d = new AccesoADatos();
            return (d.bajaProveedor(idProv));
        }
       
        catch(SQLException exc){
            System.out.println("Error en la consulta. " + exc.getMessage());
            return 0;
        }
        
        catch (ClassNotFoundException exc){
            System.out.println("Error en el driver. " + exc.getMessage());
            return 0;
        }
    }
        
    public int modificarProveedor(Proveedor prov){
       
        try{
            AccesoADatos d = new AccesoADatos();
            return (d.modificarProveedor(prov));
        }
       
        catch(SQLException exc){
            System.out.println("Error en la consulta. " + exc.getMessage());
            return 0;
        }
         catch (ClassNotFoundException exc){
            System.out.println("Error en el driver. " + exc.getMessage());
            return 0;
        }
        
    }
    
}
