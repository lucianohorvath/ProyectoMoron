/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CapaDeDatos;

import ReglasDeNegocio.InformeRecepcion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Luciano
 */
public class InformeRecepcionDAO {
    
    public static int registrarInforme(InformeRecepcion inf) {
        int lineasAfectadas = 0;
                
        try {
            Connection con = Conexion.obtenerConexionSQLWindows();

            PreparedStatement ps = con.prepareStatement("INSERT INTO InformeRecepcion "
                    + "(IdMpp, NroLoteProveedor, NroRemitoProveedor) VALUES (?,?,?)");

            ps.setInt(1, obtenerIdMpp(inf.getIdProveedor(), inf.getIdMp()));
            ps.setInt(2, inf.getNroLoteProveedor());
            ps.setInt(3, inf.getNroRemitoProveedor());

            lineasAfectadas = ps.executeUpdate();
            con.close();
        }
        
        catch(SQLException ex){
            System.out.println("Error en la consulta. " + ex.getMessage());
        }
        catch (ClassNotFoundException ex) {
            System.out.println("Error en el driver. " + ex.getMessage());
        }
        
        return lineasAfectadas;
    }

    private static int obtenerIdMpp(int idProv, int idMp){
        ResultSet rs = null;
        int idMpp = 0;
        
        try {
            Connection con = Conexion.obtenerConexionSQLWindows();
            
            PreparedStatement ps = con.prepareStatement("SELECT Id FROM MateriaPrima_Proveedor"
                    + "WHERE IdMateriaPrima = ? AND IdProveedor = ?");
            
            ps.setInt(1, idMp);
            ps.setInt(2, idProv);
            rs = ps.executeQuery();
            
            if (rs.next()) {
                idMpp = rs.getInt(1);
            }
            
            con.close();
        }    
        catch(SQLException ex){
            System.out.println("Error en la consulta. " + ex.getMessage());
        }
        catch (ClassNotFoundException ex) {
            System.out.println("Error en el driver. " + ex.getMessage());
        }
        
        return idMpp;
    }
    
    
}
