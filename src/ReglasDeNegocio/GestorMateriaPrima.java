package ReglasDeNegocio;

import CapaDeDatos.MateriaPrimaDAO;
import Modelo.MateriaPrima;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Luciano
 */
public class GestorMateriaPrima {

    public int darAltaMp(MateriaPrima mp, String proveedores){
        String descripcion = mp.getDescripcion();
        int stockCritico = mp.getStockCritico();        
        String[] listaProv = proveedores.split(", ");
        int[] prov = new int[listaProv.length];
        
        for (int i=0; i < listaProv.length; i++)
            prov[i] = Integer.parseInt(listaProv[i]);
        
        int[] listaProveedores = mp.getListaProveedores();
        
        return (MateriaPrimaDAO.altaMateriaPrima(descripcion, stockCritico, listaProveedores));
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
    
    public DefaultTableModel traerTablaMpConStock(DefaultTableModel modelo){
        return MateriaPrimaDAO.traerTablaMpConStock(modelo);
    }
    
}
