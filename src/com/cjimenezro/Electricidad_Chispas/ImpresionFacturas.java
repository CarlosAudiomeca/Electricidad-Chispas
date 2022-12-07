package com.cjimenezro.Electricidad_Chispas;

import com.cjimenezro.Electricidad_Chispas.Facturas;

public class ImpresionFacturas {



    public static void print(Facturas factura){
        System.out.println("RESUMEN FACTURA");
        System.out.println("Codigo de la factura:");
        System.out.println(factura.getCodigoFactura());
        System.out.println("Fecha de la factura:");
        System.out.println(factura.getFechaFactura());
        System.out.println("Codido del cliente:");
        System.out.println(factura.getCodigoCliente());
        System.out.println("Codido del producto:");
        System.out.println(factura.getCodigoProducto());
        System.out.println("Codido del servicio:");
        System.out.println(factura.getCodigoServicio());
        System.out.println(factura.getBaseImponible());
        System.out.println(factura.getTotal());
    }

    public static void print2(Facturas factura2){
        System.out.println("RESUMEN FACTURA");
        System.out.println("Codigo de la factura:");
        System.out.println(factura2.getCodigoFactura());
        System.out.println("Fecha de la factura:");
        System.out.println(factura2.getFechaFactura());
        System.out.println("Codigo del cliente:");
        System.out.println(factura2.getCodigoFactura());
        System.out.println("Codigo del producto:");
        System.out.println(factura2.getCodigoProducto());
        System.out.println("Codigo del servicio:");
        System.out.println(factura2.getCodigoServicio());
        System.out.println("Base imponible:");
        System.out.println(factura2.getBaseImponible());
        System.out.println("Total:");
        System.out.println(factura2.getTotal());
    }



}
