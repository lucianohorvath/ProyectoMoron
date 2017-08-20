/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ReglasDeNegocio;

import CapaDeDatos.ProveedorDAO;
import java.sql.SQLException;

/**
 *
 * @author DIEGO
 */
public class GestorABM {

    public static int obtenerId() {
        int id = 0;
        
        return id;
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
       
    
    
}
