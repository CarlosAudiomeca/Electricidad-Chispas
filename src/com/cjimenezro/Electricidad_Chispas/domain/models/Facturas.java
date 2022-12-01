package com.cjimenezro.Electricidad_Chispas.domain.models;

public class Facturas {
    private int codigoFactura,baseImponible,total;
    private Clientes codigoCliente;
    private Productos codigoProducto;
    private Servicios codigoServicio;
    private String fechaFactura;

    //Funciones


    public int getCodigoFactura() {
        return codigoFactura;
    }

    public void setCodigoFactura(int codigoFactura) {
        this.codigoFactura = codigoFactura;
    }

    public Clientes getCodigoCliente() {
        return codigoCliente;
    }

    public void setCodigoCliente(Clientes codigoCliente) {
        this.codigoCliente = codigoCliente;
    }

    public Productos getCodigoProducto(){
        return codigoProducto;
    }

    public void setCodigoProducto(Productos codigoProducto){
        this.codigoProducto=codigoProducto;
    }

    public Servicios getCodigoServicio(){
        return codigoServicio;
    }

    public void setGetCodigoServicio(Servicios codigoServicio){
        this.codigoServicio=codigoServicio;
    }

    public int getBaseImponible() {
        return baseImponible;
    }

    public void setBaseImponible(int baseImponible) {
        this.baseImponible = baseImponible;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public String getFechaFactura() {
        return fechaFactura;
    }

    public void setFechaFactura(String fechaFactura) {
        this.fechaFactura = fechaFactura;
    }
}
