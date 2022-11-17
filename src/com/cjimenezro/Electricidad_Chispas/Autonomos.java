package com.cjimenezro.Electricidad_Chispas;

public class Autonomos implements Clientes {

    private Integer codigoCliente,telefono;

    private String nombre,apellidos,dni,direccionPostal,poblacion, provincia,email;

    //Funciones

    @Override
    public Integer getCodigoCliente() {
        return codigoCliente;
    }

    @Override
    public void setCodigoCliente(Integer codigoCliente) {
        this.codigoCliente = codigoCliente;
    }

    @Override
    public String getCorporationName() {
        return nombre;
    }

    @Override
    public void setCorporatioName(String corporatioName) {
        this.nombre = corporatioName;
    }

    public String getApellidos() {
        return apellidos;
    }
    public void setApellidos(String apellidos){
        this.apellidos = apellidos;
    }

    @Override
    public String getCorporationId() {
        return dni;
    }

    @Override
    public void setCorporationId(String corpotarionId) {
        this.dni = corpotarionId;
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
        this.poblacion= poblacion;
    }

    @Override
    public String getProvincia() {
        return provincia;
    }

    @Override
    public void setProvincia(String provincia) {
        this.provincia =provincia;
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
