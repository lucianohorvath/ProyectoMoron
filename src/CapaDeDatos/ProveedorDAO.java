/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CapaDeDatos;

import ReglasDeNegocio.Proveedor;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Luciano
 */
public class ProveedorDAO {

    public static int bajaProveedor(int idProv) throws ClassNotFoundException, SQLException {
        Connection con = Conexion.obtenerConexionSQLWindows();
        Statement sentencia = con.createStatement();
        
        int lineasAfectadas = sentencia.executeUpdate("DELETE FROM Proveedor WHERE IdProveedor = " + idProv);
        con.close();
        
        return lineasAfectadas;
    }

    //Estos podría hacerlos todos estáticos.
    public static int altaProveedor(Proveedor p) throws SQLException, ClassNotFoundException {
        Connection con = Conexion.obtenerConexionSQLWindows();
        Statement sentencia = con.createStatement();
        
        System.out.println("INSERT INTO Proveedor (RazonSocial, CUIT, Direccion, Telefono, Email) VALUES ('" + p.getRazonSocial() + "'," + p.getCuit() + ",'" + p.getDireccion() + "','" + p.getTelefono() + "','" + p.getEmail() + "')");
        
        int lineasAfectadas = sentencia.executeUpdate("INSERT INTO Proveedor (RazonSocial, CUIT, Direccion, Telefono, Email) VALUES ('" + p.getRazonSocial() + "'," + p.getCuit() + ",'" + p.getDireccion() + "','" + p.getTelefono() + "','" + p.getEmail() + "')");
        con.close();
        
        return lineasAfectadas;
    }

    public static Proveedor traerProveedor(int id) {
        Proveedor p = null;
        Connection con;
        Statement st;
        try {
            //Obtenemos la conexion a la base de datos
            con = Conexion.obtenerConexionSQLWindows();
            st = con.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM Proveedor WHERE IdProveedor = " + id);
            
            if (rs.next()) {
                p = new Proveedor();
                
                p.setIdProveedor(id);
                p.setRazonSocial(rs.getNString("RazonSocial"));
                p.setCuit(rs.getLong("CUIT"));
                p.setDireccion(rs.getNString("Direccion"));
                p.setTelefono(rs.getNString("Telefono"));
                p.setEmail(rs.getNString("Email"));
            }
            st.close();
            con.close();
            
        } catch (ClassNotFoundException e) {
            System.out.println("Error en el driver. " + e.getMessage());
        } catch (SQLException e) {
            System.out.println("Error en la consulta. " + e.getMessage());
        }
        return p;
    }

    public static int modificarProveedor(Proveedor p) throws ClassNotFoundException, SQLException {
        Connection con = Conexion.obtenerConexionSQLWindows();
        Statement sentencia = con.createStatement();
        int lineasAfectadas = sentencia.executeUpdate("UPDATE Proveedor SET RazonSocial = '" + p.getRazonSocial() + "', CUIT = " + p.getCuit() + "', Direccion = '" + p.getDireccion() + "', Telefono = '" + p.getTelefono() + "', Email = '" + p.getEmail() + "' WHERE IdProveedor = " + p.getIdProveedor());
        con.close();
        return lineasAfectadas;
    }

    public static DefaultTableModel leerTablaProveedorYDevolverModelo(DefaultTableModel modelo) {
        Connection con;
        Statement sentencia;
        ResultSet rs;
        try {
            //Obtenemos la conexion a la base de datos
            con = Conexion.obtenerConexionSQLWindows();
            sentencia = con.createStatement();
            rs = sentencia.executeQuery("SELECT * FROM Proveedor");
            while (rs.next()) {
                Object[] fila = new Object[6];
                fila[0] = rs.getInt("IdProveedor");
                fila[1] = rs.getObject("RazonSocial");
                fila[2] = rs.getObject("CUIT");
                fila[3] = rs.getObject("Direccion");
                fila[4] = rs.getObject("Telefono");
                fila[5] = rs.getObject("Email");
                modelo.addRow(fila);
            }
            rs.close();
            sentencia.close();
            con.close();
        } catch (ClassNotFoundException ex) {
            System.out.println("Error en el driver. " + ex.getMessage());
        } catch (SQLException ex) {
            System.out.println("Error en la consulta. " + ex.getMessage());
        }
        return modelo;
    }
    
}
