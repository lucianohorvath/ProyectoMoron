package Modelo;

/**
 *
 * @author Alfa02
 */
public class Proveedor {
    private int idProveedor;
    private String razonSocial;
    private long cuit;
    private String direccion;
    private String telefono;
    private String email;

    public String getRazonSocial() {
        return razonSocial;
    }

    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }

    public long getCuit() {
        return cuit;
    }

    public void setCuit(long cuit) {
        this.cuit = cuit;
    }
    
    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    public int getIdProveedor() {
        return idProveedor;
    }

    public void setIdProveedor(int IdProveedor) {
        this.idProveedor = IdProveedor;
    }
    
    public String toString(){
        return ("Información del proveedor:\nID: " + idProveedor + "\nNombre: " + razonSocial + "\nCUIT: " + cuit + "\nDirección: " + direccion + "\nTeléfono: " + telefono + "\nEmail: " + email);
    }
    
}
