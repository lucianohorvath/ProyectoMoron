package CapaDeDatos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class Conexion {
   
    static Connection obtenerConexionSQL() throws ClassNotFoundException, SQLException{
        //Cargamos el driver JDBC en memoria
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        
        String url = ("jdbc:sqlserver://localhost\\conexionSQL:1433;databaseName=ProyectoMoron");
        Connection con = DriverManager.getConnection(url, "lucho", "lala");
        System.out.println("Conectado con éxito a la base de datos.");     
        
        return con;
    }
    
    
    static Connection obtenerConexionSQLWindows() throws ClassNotFoundException, SQLException{
        //Cargamos el driver JDBC en memoria
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        
        String url = ("jdbc:sqlserver://localhost;databaseName=ProyectoMoron;integratedSecurity=true;");
        Connection con = DriverManager.getConnection(url);
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
    }       //version mala
    
}
