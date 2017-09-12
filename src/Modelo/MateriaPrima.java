package Modelo;


public class MateriaPrima extends Producto{
    
    private int codigoProveedor;
    private int loteProveedor;

    
    
    public MateriaPrima(String nom, int st, int stCritico, int loteInt, int codProv, int loteProv){
        super(nom, st, stCritico, loteInt);
        this.codigoProveedor = codProv;
        this.loteProveedor = loteProv;
    }
    
}
