package ReglasDeNegocio;

/**
 *
 * @author Alfa02
 */
public class Proveedor {
    private int idProveedor;
    private String nombre;
    private String direccion;
    private String telefono;
    private String email;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
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
        return ("Información del proveedor:\nID: " + idProveedor + "\nNombre: " + nombre + "\nDirección: " + direccion + "\nTeléfono: " + telefono + "\nEmail: " + email);
    }
    
}
