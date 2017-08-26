package ReglasDeNegocio;

public abstract class Producto {

    protected int id;
    protected String descripcion;
    protected int stock;
    protected int stockCritico;
    protected int loteInterno;
    
    public Producto(){}
    
    public Producto(String nom, int st, int stCritico, int loteInt){
        this.id = GestorProveedor.obtenerIdProducto();
        this.descripcion = nom;
        this.stock = st;
        this.stockCritico = stCritico;
        this.loteInterno = loteInt;
    }
    
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public int getStockCritico() {
        return stockCritico;
    }

    public void setStockCritico(int stockCritico) {
        this.stockCritico = stockCritico;
    }

    public int getLoteInterno() {
        return loteInterno;
    }

    public void setLoteInterno(int loteInterno) {
        this.loteInterno = loteInterno;
    }
    
    
}
