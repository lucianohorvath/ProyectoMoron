package ReglasDeNegocio;

public abstract class Producto {
    
    protected int id;
    protected String nombre;
    protected int stock;
    protected int stockCritico;
    protected int loteInterno;
    
    public Producto(String nom, int st, int stCritico, int loteInt){
        this.id = GestorABM.obtenerId();
        this.nombre = nom;
        this.stock = st;
        this.stockCritico = stCritico;
        this.loteInterno = loteInt;
    }
    
    
    
    
}
