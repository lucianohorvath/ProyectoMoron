package ReglasDeNegocio;

import Modelo.Proveedor;
import CapaDeDatos.ProveedorDAO;
import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;

public class GestorProveedor {

    public static int obtenerIdProducto() {
     // ProductoDAO.obtenerId;
       
        return 1;
    }

    
    public int darAltaProveedor(Proveedor prov){
       
        try{
            return (ProveedorDAO.altaProveedor(prov));
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
            return (ProveedorDAO.bajaProveedor(idProv));
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
            return (ProveedorDAO.modificarProveedor(prov));
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
    
    public Proveedor traerProveedor(int idProv){
        return (ProveedorDAO.traerProveedor(idProv));
    }    
    
    /**Verifica que el proveedor que se está dando de alta no exista ya en la base de datos.
     * 
     * @param rs razón social que se quiere dar de alta.
     * @param cuit cuit que se quiere dar de alta.
     * @return 0 si no existe, 1 si existe la razón social, 2 si existe el CUIT.
     */
    public int comprobarExistencia(String rs, Long cuit){
        int error = 0;   
        
        if (ProveedorDAO.buscarPorRazonSocial(rs) == 1)
            error = 1;
        if (ProveedorDAO.buscarPorCuit(cuit) == 1)
            error = 2;        
        
        return error;
    }

    public DefaultTableModel leerTablaProveedorYDevolverModelo(DefaultTableModel modelo) {
        return ProveedorDAO.leerTablaProveedor(modelo);
    }
    
}
