package Modelo;


public class Usuario {
    private static Usuario user;
    private int id;
    private String nombreUsuario;
    private String contraseña;
    private String nombre;
    private String apellido;
    private String funcion;
    private int rol;

    private Usuario(){
        
    }
    
    private Usuario(String user, String pass){
        nombreUsuario = user;
        contraseña = pass;
    }    
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
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
    
    public static Usuario getUsuarioSingleton(){
        if (user == null)
            user = new Usuario();
        
        return user;
    }
    
    
    @Override
    public String toString(){
        return ("El usuario de ID: " + id + " se llama " + nombre + " " + apellido + " y su rol es: " + rol );
    }
    
}
