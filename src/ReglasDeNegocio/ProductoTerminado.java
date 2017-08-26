package ReglasDeNegocio;
import java.util.*;

public class ProductoTerminado extends Producto{
    private PuntoDeControl idPc;
    private Queue<Componente> formula;
    
    public ProductoTerminado(String nom, int st, int stCritico, int loteInt){
        super(nom, st, stCritico, loteInt);
        formula = new LinkedList<Componente>();
    }

    public PuntoDeControl getIdPc() {
        return idPc;
    }

    public void setId(PuntoDeControl id) {
        this.idPc = id;
    }

    public Queue<Componente> getFormula() {
        return formula;
    }

    public void setFormula(Queue<Componente> formula) {
        this.formula = formula;
    }
    
 
}