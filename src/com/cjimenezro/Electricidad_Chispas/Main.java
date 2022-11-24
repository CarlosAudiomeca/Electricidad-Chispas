package com.cjimenezro.Electricidad_Chispas;

public class Main {
    public static void main(String[] args) {

        Autonomos autonomo = new Autonomos();
        autonomo.getCodigoCliente();
        autonomo.getCorporationName();
        autonomo.getApellidos();
        autonomo.getCorporationId();
        autonomo.getEmail();
        autonomo.getPoblacion();
        autonomo.getProvincia();
        autonomo.getTelefono();
        autonomo.getDireccionPostal();


        Sociedades sociedad = new Sociedades();
        sociedad.getCodigoCliente();
        sociedad.getCorporationName();
        sociedad.getEmail();
        sociedad.getPoblacion();
        sociedad.getProvincia();
        sociedad.getDireccionPostal();
        sociedad.getTelefono();
        sociedad.getCorporationId();

    }
}