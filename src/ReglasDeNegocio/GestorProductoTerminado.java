package ReglasDeNegocio;

import Modelo.ProductoTerminado;
import CapaDeDatos.ProductoTerminadoDAO;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Luciano
 */
public class GestorProductoTerminado {

    public int darAltaPt(String descripcion){
        return (ProductoTerminadoDAO.altaProductoTerminado(descripcion));
    }
    
    public int darBajaPt(int idPt) {
        return (ProductoTerminadoDAO.bajaProductoTerminado(idPt));
    }
    
    public int modificarPt(ProductoTerminado pt){
        return (ProductoTerminadoDAO.modificarProductoTerminado(pt));
    }
    
    public ProductoTerminado traerPt(int idPt){
        return (ProductoTerminadoDAO.traerPt(idPt));
    }
    
    public ProductoTerminado traerPt(String nombre){
        return (ProductoTerminadoDAO.traerPt(nombre));
    }
    
    public DefaultTableModel traerTabla(DefaultTableModel modelo){
        return ProductoTerminadoDAO.leerTablaProdTerminados(modelo);
    }
    
    public DefaultTableModel traerTablaPtConStock(DefaultTableModel modelo){
        return ProductoTerminadoDAO.traerTablaPtConStock(modelo);
    }
    
    public DefaultTableModel traerTablaPtConStock(DefaultTableModel modelo, String idPt, String nombre){
        int id;
        
        if (idPt.isEmpty())
            id = traerPt(nombre).getId(); 
        else
            id = Integer.parseInt(idPt);        
        
        return ProductoTerminadoDAO.traerTablaPtConStock(modelo, id);
    }
     
    public int modificarStock(int idMp, int cantidad){
        return ProductoTerminadoDAO.modificarStock(idMp, cantidad);
    }
    
}
