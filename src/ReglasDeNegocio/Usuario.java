package ReglasDeNegocio;


public class Usuario {
    private int id;
    private String nombre;
    private String funcion;
    private int rol;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFuncion() {
        return funcion;
    }

    public void setFuncion(String funcion) {
        this.funcion = funcion;
    }

    public int getRol() {
        return rol;
    }

    public void setRol(int rol) {
        this.rol = rol;
    }
    
    public Usuario(int id, String nombre, String funcion, int rol){
        this.id = id;
        this.nombre = nombre;
        this.funcion = funcion;
        this.rol = rol;
    }
    
    
}
