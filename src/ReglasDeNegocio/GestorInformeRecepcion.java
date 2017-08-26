package ReglasDeNegocio;

import CapaDeDatos.InformeRecepcionDAO;

/**
 *
 * @author Luciano
 */
public class GestorInformeRecepcion {
    
    //Métodos
    public int registrarInformeRecepcion(InformeRecepcion inf){
        return (InformeRecepcionDAO.registrarInforme(inf));
    }
    
    
    
}
