package CapaDeDatos;
import java.sql.*;
import javax.swing.table.DefaultTableModel;

public class AccesoADatos {
   
    private static Connection obtenerConexionSQL() throws ClassNotFoundException, SQLException{
        //Cargamos el driver JDBC en memoria
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        
        String url = ("jdbc:sqlserver://localhost\\conexionSQL:1433;databaseName=ProyectoMoron");
        Connection con = DriverManager.getConnection(url, "lucho", "lala");
        System.out.println("Conectado con éxito a la base de datos.");     
        
        return con;
    }
    
    
    public static void Conectar(){
    
    Connection conec;
    String conexionURL;
    
    
        try {
          conexionURL = "jdbc:sqlserver://;database=ProyectoMoron;integratedSecurity=true;";
          conec = DriverManager.getConnection(conexionURL);
          System.out.println("Conectado con éxito a la base de datos.");
        } 

        catch (SQLException ex) 
        {
          System.out.println("Error en la conexión a la base de datos.");
        }
    }       //version de mierda
    
    
    public int altaProveedor(int id, String nombre, String direccion, String tel, String email) throws SQLException{
        String conexionURL = "jdbc:sqlserver://;database=ProyectoMoron;integratedSecurity=true;";
        Connection con = DriverManager.getConnection(conexionURL);
          //luego cambiar por obtenerConexionSQL
        
        
        Statement sentencia = con.createStatement();
        int lineasAfectados = (sentencia.executeUpdate("INSERT INTO Proveedor (IdProveedor, Nombre, Direccion, Telefono, Email) VALUES (" + id + ",'" + nombre + "','" + direccion + "','" + tel + "','" + email + "')" ));
        
        con.close();
        
        return lineasAfectados;
    }
    
    public ResultSet leerTablaProveedores() throws SQLException{
        Connection con = null;
        Statement sentencia = null;
        ResultSet rs = null;
       // DefaultTableModel modelo = new DefaultTableModel();
        
        try 
        {
            //Obtenemos la conexion a la base de datos
            con = obtenerConexionSQL();
            sentencia = con.createStatement();
        
            rs = sentencia.executeQuery("SELECT * FROM Proveedores");

            // trabajar con rs -> modelo acá o en VerProveedores?
          
            
            sentencia.close();
            con.close();
        }
        
        catch (ClassNotFoundException ex){
            System.out.println("Error en el driver. " + ex.getMessage());
        }
        catch (SQLException ex){
            System.out.println("Error en la consulta. " + ex.getMessage());
        }  
        
        
        return rs;
    }
    
}
