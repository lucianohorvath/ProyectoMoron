package CapaDeDatos;
import ReglasDeNegocio.Proveedor;
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
    
    
    private static Connection obtenerConexionSQLWindows() throws ClassNotFoundException, SQLException{
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
    }       //version de mierda
    
    //Estos podría hacerlos todos estáticos.
    public int altaProveedor(Proveedor p) throws SQLException, ClassNotFoundException{
        Connection con = obtenerConexionSQLWindows();
               
        Statement sentencia = con.createStatement();
        int lineasAfectadas = sentencia.executeUpdate("INSERT INTO Proveedor (IdProveedor, Nombre, Direccion, Telefono, Email) VALUES (" + p.getIdProveedor()+ ",'" + p.getNombre() + "','" + p.getDireccion() + "','" + p.getTelefono() + "','" + p.getEmail() + "')" );
        con.close();
        
        return lineasAfectadas;
    }
    
    public int bajaProveedor(int idProv) throws ClassNotFoundException, SQLException{
        Connection con = obtenerConexionSQLWindows();
        
        Statement sentencia = con.createStatement();
        int lineasAfectadas = sentencia.executeUpdate("DELETE FROM Proveedor WHERE IdProveedor = " + idProv);
        con.close();
        
        return lineasAfectadas;
    }
    
    public int modificarProveedor(Proveedor p) throws ClassNotFoundException, SQLException{
        Connection con = obtenerConexionSQLWindows();
        
        Statement sentencia = con.createStatement();
        int lineasAfectadas = sentencia.executeUpdate("UPDATE Proveedor SET Nombre = '" + p.getNombre() + "', Direccion = '" + p.getDireccion() + "', Telefono = '" + p.getTelefono() + "', Email = '" + p.getEmail() + "' WHERE IdProveedor = " + p.getIdProveedor());
        con.close();
        
        return lineasAfectadas;
    }
    
    public static Proveedor traerProveedor (int id){
        Proveedor p = null;
        Connection con;
        Statement st;
        
        try 
        {
            //Obtenemos la conexion a la base de datos
            con = obtenerConexionSQLWindows();
            st = con.createStatement();
 
            ResultSet rs = st.executeQuery("SELECT * FROM Proveedor WHERE IdProveedor = " + id);
            
            if (rs.next()){
                p = new Proveedor();
                
                p.setIdProveedor(id);
                p.setNombre(rs.getNString("Nombre"));
                p.setDireccion(rs.getNString("Direccion"));
                p.setTelefono(rs.getNString("Telefono"));
                p.setEmail(rs.getNString("Email"));
            }
    
            st.close();
            con.close();
        }
        catch (ClassNotFoundException e){
            System.out.println("Error en el driver. " + e.getMessage());
        }
        catch (SQLException e){
            System.out.println("Error en la consulta. " + e.getMessage());
        }
        
        return p;
    }
    
    
    public static DefaultTableModel leerTablaProveedorYDevolverModelo(DefaultTableModel modelo){
        Connection con;
        Statement sentencia;
        ResultSet rs;
        DefaultTableModel modeloInterno = new DefaultTableModel();
        
        modeloInterno.addColumn("IdProv");
        modeloInterno.addColumn("Nom");
        modeloInterno.addColumn("Dir");
        modeloInterno.addColumn("Tel");
        modeloInterno.addColumn("Email");
        
        try 
        {
            //Obtenemos la conexion a la base de datos
            con = obtenerConexionSQLWindows();
            sentencia = con.createStatement();
            
            rs = sentencia.executeQuery("SELECT * FROM Proveedor");
          
            
             while(rs.next()){                
                Object [] fila = new Object[5];
                
                fila[0] = rs.getInt("IdProveedor");
                fila[1] = rs.getObject("Nombre");
                fila[2] = rs.getObject("Direccion");
                fila[3] = rs.getObject("Telefono");    
                fila[4] = rs.getObject("Email");       
                                
                modelo.addRow(fila);
                modeloInterno.addRow(fila); 
            }
                        
            rs.close();
            sentencia.close();
            con.close();         
        }
        
        catch (ClassNotFoundException ex){
            System.out.println("Error en el driver. " + ex.getMessage());
        }
        catch (SQLException ex){
            System.out.println("Error en la consulta. " + ex.getMessage());
        }  
        
        
        return modelo;
    }
    
}
