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
        int[] listaProveedores = new int[listaProv.length];
        
        for (int i=0; i < listaProv.length; i++)
            listaProveedores[i] = Integer.parseInt(listaProv[i]);        
        
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
    
    public MateriaPrima traerMp(String nombre){
        return (MateriaPrimaDAO.traerMp(nombre));
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
    
    public DefaultTableModel traerTablaMpConStock(DefaultTableModel modelo, String idMp, String nombre){
        int id = 0;
        
        if (idMp.isEmpty())
            id = traerMp(nombre).getId();
        else
            id = Integer.parseInt(idMp);
        
        return MateriaPrimaDAO.traerTablaMpConStock(modelo, id);
    }
    
    public int modificarStock(int idMp, int cantidad){
        return MateriaPrimaDAO.modificarStock(idMp, cantidad);
    }

}
