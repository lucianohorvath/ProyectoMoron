package CapaDeDatos;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Conexion {
   
    private static String usuario;
    private static String password;
    private static String url;
    private static String database;
    private static String driver;
    public static final String DBUSER = "DBUSER";
    public static final String DBPASSWORD = "DBPASSWORD";
    public static final String URL = "URL";
    public static final String DATABASE = "DATABASE";
    public static final String DRIVER = "DRIVER";
    
    static{
        Properties ps = new Properties();
        FileInputStream f = null;
        
        try {
            f = new FileInputStream("./config/db.properties");
            ps.load(f);
            usuario = ps.getProperty(DBUSER);
            password = ps.getProperty(DBPASSWORD);
            url = ps.getProperty(URL);
            database = ps.getProperty(DATABASE);
            driver = ps.getProperty(DRIVER);
            
            Class.forName(driver);
                        
        } catch (ClassNotFoundException ex) {
            System.out.println("Error en el driver de bdd.");            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }               
    }
            
    static Connection obtenerConexion() throws ClassNotFoundException, SQLException{
        //Cargamos el driver JDBC en memoria
        
        Connection con = DriverManager.getConnection(url+database, usuario, password);
        System.out.println("Conectado con éxito a la base de datos.");     
        
        return con;
    }
        
}
