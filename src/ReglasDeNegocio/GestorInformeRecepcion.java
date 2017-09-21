package ReglasDeNegocio;

import Modelo.InformeRecepcion;
import CapaDeDatos.InformeRecepcionDAO;

/**
 *
 * @author Luciano
 */
public class GestorInformeRecepcion {
    
    public String registrarInformeRecepcion(InformeRecepcion inf){
        int resultado = InformeRecepcionDAO.registrarInforme(inf);
        String mensaje;
        
        switch (resultado) {
            case 1:
                mensaje = "Informe de recepción registrado exitosamente.";
                break;
            case 0:
                mensaje = "Error al registrar el informe de recepción.";
                break;
            default:
                mensaje = "La materia prima no se relaciona con el proveedor.";
                break;
        }
                
        return mensaje;
    }
    
    
    
}
