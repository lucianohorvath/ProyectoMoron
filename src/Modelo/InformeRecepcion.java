/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.Date;

/**
 *
 * @author Luciano
 */
public class InformeRecepcion {
    private int nroLoteInterno;
    private int nroLoteProveedor;
    private long nroRemitoProveedor;
    private Date fecha;
    private int idProveedor;
    private int idMp;
    private String razonSocialProv;
    private String descripcionMp;
    
    public int getNroLoteInterno() {
        return nroLoteInterno;
    }

    public void setNroLoteInterno(int nroLoteInterno) {
        this.nroLoteInterno = nroLoteInterno;
    }

    public int getNroLoteProveedor() {
        return nroLoteProveedor;
    }

    public void setNroLoteProveedor(int nroLoteProveedor) {
        this.nroLoteProveedor = nroLoteProveedor;
    }

    public long getNroRemitoProveedor() {
        return nroRemitoProveedor;
    }

    public void setNroRemitoProveedor(long nroRemitoProveedor) {
        this.nroRemitoProveedor = nroRemitoProveedor;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
    
    public int getIdProveedor() {
        return idProveedor;
    }

    public void setIdProveedor(int idProveedor) {
        this.idProveedor = idProveedor;
    }

    public int getIdMp() {
        return idMp;
    }

    public void setIdMp(int idMp) {
        this.idMp = idMp;
    }

    public String getRazonSocialProv() {
        return razonSocialProv;
    }

    public void setRazonSocialProv(String razonSocialProv) {
        this.razonSocialProv = razonSocialProv;
    }

    public String getDescripcionMp() {
        return descripcionMp;
    }

    public void setDescripcionMp(String descripcionMp) {
        this.descripcionMp = descripcionMp;
    }
    
    
    
    public String toString(){
        return ("El informe de recepción corresponde al lote interno número " + nroLoteInterno +
                ". El lote del proveedor es " + nroLoteProveedor + ", el remito del proveedor es "
                + nroRemitoProveedor + ", y la fecha de recepción es " + fecha +
                ".\nDatos del proveedor: ID " + idProveedor + " " + razonSocialProv +
                ".\nDatos de la materia prima: ID " + idMp + " " + descripcionMp + ".");
    }
    
    
}
