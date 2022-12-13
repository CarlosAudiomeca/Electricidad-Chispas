package com.cjimenezro.Electricidad_Chispas.domain.models;

public class Productos implements ProductosServicios{

    private Integer codigo,precio,tipoIva;

    private String nombre,marca,modelo;

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

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
}
