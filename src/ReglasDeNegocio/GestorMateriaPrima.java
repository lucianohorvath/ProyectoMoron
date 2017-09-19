package ReglasDeNegocio;

import CapaDeDatos.MateriaPrimaDAO;
import Modelo.MateriaPrima;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Luciano
 */
public class GestorMateriaPrima {

    public int darAltaMp(String descripcion){
        return (MateriaPrimaDAO.altaMateriaPrima(descripcion));
    }
    
    public int darBajaMp(int idMp) {
        return (MateriaPrimaDAO.bajaMateriaPrima(idMp));
    }
    
    public int modificarMp(MateriaPrima mp){
        int idMp = mp.getId();
        String descripcion = mp.getDescripcion();
        
        return (MateriaPrimaDAO.modificarMateriaPrima(idMp, descripcion));
    }    
    
    public MateriaPrima traerMp(int idMp){
        return (MateriaPrimaDAO.traerMp(idMp));
    }
    
    public DefaultTableModel traerTablaMateriaPrima(){
        return MateriaPrimaDAO.traerTablaMateriaPrima();
    } 
    
    public DefaultTableModel traerTablaMateriaPrima(int idProveedor){
        return MateriaPrimaDAO.traerTablaMateriaPrima(idProveedor);
    } 
    
}
