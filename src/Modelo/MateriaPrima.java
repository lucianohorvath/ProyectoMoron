package Modelo;


public class MateriaPrima extends Producto{
    
    private int codigoProveedor;
    private int loteProveedor;
    private int[] listaProveedores;
    
    public MateriaPrima() {
    }
    
    public MateriaPrima(String nom, int st, int stCritico, int loteInt, int codProv, int loteProv){
        super(nom, st, stCritico, loteInt);
        this.codigoProveedor = codProv;
        this.loteProveedor = loteProv;
    }
    
    public int[] getListaProveedores() {
        return listaProveedores;
    }

    public void setListaProveedores(int[] listaProveedores) {
        this.listaProveedores = listaProveedores;
    }
    
}
