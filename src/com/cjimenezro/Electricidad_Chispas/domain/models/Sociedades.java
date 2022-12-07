package com.cjimenezro.Electricidad_Chispas.domain.models;

public class Sociedades implements Clientes{

    private Integer codigoCliente,telefono;

    private String razonSocial,cif,direccionPostal,poblacion,provincia,email;

    //Funciones

    @Override
    public Integer getCodigoCliente() {
        return codigoCliente;
    }

    @Override
    public void setCodigoCliente(Integer codigoCliente) {
        this.codigoCliente=codigoCliente;
    }

    @Override
    public String getCorporationName() {
        return razonSocial;
    }

    @Override
    public void setCorporatioName(String corporatioName) {
        this.razonSocial = corporatioName;
    }

    @Override
    public String getCorporationId() {
        return cif;
    }

    @Override
    public void setCorporationId(String corpotarionId) {
        this.cif=corpotarionId;
    }

    @Override
    public String getDireccionPostal() {
        return direccionPostal;
    }

    @Override
    public void setDireccionPostal(String direccionPostal) {
        this.direccionPostal=direccionPostal;
    }

    @Override
    public String getPoblacion() {
        return poblacion;
    }

    @Override
    public void setPoblacion(String poblacion) {
        this.poblacion=poblacion;
    }

    @Override
    public String getProvincia() {
        return provincia;
    }

    @Override
    public void setProvincia(String provincia) {
        this.provincia=provincia;
    }

    @Override
    public String getEmail() {
        return email;
    }

    @Override
    public void setEmail(String email) {
        this.email=email;
    }

    @Override
    public Integer getTelefono() {
        return telefono;
    }

    @Override
    public void setTelefono(Integer telefono) {
        this.telefono=telefono;
    }
}
