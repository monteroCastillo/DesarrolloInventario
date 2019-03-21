/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;
   
public class Productos {
    
    
     /**
     * Atributos de la clase Producto
     */
    private String nombreProducto, codigoProducto, proveedor, descripcion;    
    private int cantidad,valorCompraProd,valorVentaProd;
    
    /**
     * Constructor de la clase trabajador
     * @param nombreProducto
     * @param codigoProducto
     * @param proveedor
     * @param descripcion
     * @param cantidad 
     * @param valorCompraProd
     * @param valorVentaProd
     */

    public Productos(String nombreProducto, String codigoProducto,
                     int cantidad,  int valorComprado, int valorVenta,String proveedor,String descripcion) {
        this.nombreProducto = nombreProducto;
        this.codigoProducto = codigoProducto;        
        this.codigoProducto = codigoProducto;
        this.cantidad = cantidad;
        this.valorCompraProd = valorComprado;
        this.valorVentaProd = valorVenta;
        this.descripcion = descripcion;
    }
    
    public String getNombreProducto() {
        return nombreProducto;
    }

    public String getCodigoProducto() {
        return codigoProducto;
    }

    public String getProveedor() {
        return proveedor;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public int getCantidad() {
        return cantidad;
    }

    public int getValorCompraProd() {
        return valorCompraProd;
    }

    public int getValorVentaProd() {
        return valorVentaProd;
    }
    
     public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public void setCodigoProducto(String codigoProducto) {
        this.codigoProducto = codigoProducto;
    }

    public void setProveedor(String proveedor) {
        this.proveedor = proveedor;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public void setValorCompraProd(int valorCompraProd) {
        this.valorCompraProd = valorCompraProd;
    }

    public void setValorVentaProd(int valorVentaProd) {
        this.valorVentaProd = valorVentaProd;
    }
    
    public String getDatosTrabajador()
    {
        return nombreProducto+"\t"+codigoProducto+"\t"+cantidad+"\t"+valorCompraProd+"\t"+valorVentaProd+"\t"+descripcion;        
    }

   

    
    
}
