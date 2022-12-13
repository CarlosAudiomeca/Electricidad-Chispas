package com.cjimenezro.Electricidad_Chispas.domain.models;

public interface Clientes {

    public Integer getCodigoCliente ();
    public void setCodigoCliente(Integer codigoCliente);

    public String getCorporationName();
    public void setCorporatioName(String corporatioName);

    public String getCorporationId();
    public void setCorporationId(String corpotarionId);

    public String getDireccionPostal();
    public void setDireccionPostal(String direccionPostal);

    public String getPoblacion();
    public void setPoblacion(String poblacion);

    public String getProvincia();
    public void setProvincia(String provincia);

    public String getEmail();
    public void setEmail(String email);

    public Integer getTelefono();
    public void setTelefono(Integer telefono);
}
