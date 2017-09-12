package ReglasDeNegocio;

import Modelo.ProductoTerminado;
import CapaDeDatos.ProductoTerminadoDAO;

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
    
    
}
