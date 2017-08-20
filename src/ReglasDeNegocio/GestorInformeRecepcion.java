package ReglasDeNegocio;

import CapaDeDatos.InformeRecepcionDAO;

/**
 *
 * @author Luciano
 */
public class GestorInformeRecepcion {
    private static GestorInformeRecepcion gestor;
    
    //Métodos
    public int registrarInformeRecepcion(InformeRecepcion inf){
        
        return (InformeRecepcionDAO.registrarInforme(inf));
    }
    
    
    
}
