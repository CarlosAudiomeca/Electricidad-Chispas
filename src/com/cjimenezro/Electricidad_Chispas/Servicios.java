package com.cjimenezro.Electricidad_Chispas;

public class Servicios implements ProductosServicios{
    private int codigo,precio,tipoIva;
    private String nombre;

    //Funciones

    @Override
    public Integer getCodigo() {
        return codigo;
    }

    @Override
    public void setCodigo(Integer codigo) {
        this.codigo=codigo;
    }

    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public void setNombre(String nombre) {
        this.nombre=nombre;
    }

    @Override
    public Integer getPrecio() {
        return precio;
    }

    @Override
    public void setPrecio(Integer precio) {
        this.precio=precio;
    }

    @Override
    public Integer getTipoIva() {
        return tipoIva;
    }

    @Override
    public void setTipoIva(Integer tipoIva) {
        this.tipoIva=tipoIva;
    }
}
