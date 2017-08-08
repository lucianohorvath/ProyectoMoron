package ReglasDeNegocio;
import CapaDeDatos.*;
import java.sql.SQLException;

public class Administradora {
    
    public static int darId(){
        int id = 0;
        
        return id;
    }
    
    public void cargarFormula(ProductoTerminado p){
        // esperar al formulario
    }    
    
    public int darAltaProveedor(Proveedor prov){
       
        try{
            AccesoADatos d = new AccesoADatos();
            return (d.altaProveedor(prov.getIdProveedor(), prov.getNombre(), prov.getDireccion(), prov.getTelefono(), prov.getEmail()));
        }
       
        catch(SQLException exc){
            System.out.println(exc.getMessage());
            return 0;
        }
        
        
        
    }
}
