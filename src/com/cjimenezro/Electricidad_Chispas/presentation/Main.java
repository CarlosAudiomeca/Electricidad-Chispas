package com.cjimenezro.Electricidad_Chispas.presentation;

import com.cjimenezro.Electricidad_Chispas.data.CustomerDataStore;
import com.cjimenezro.Electricidad_Chispas.data.MemCustomerDataStore;
import com.cjimenezro.Electricidad_Chispas.domain.models.*;
import com.cjimenezro.Electricidad_Chispas.domain.usecase.AddCustomerUseCase;
import com.cjimenezro.Electricidad_Chispas.domain.usecase.DeleteCustomerUseCase;
import com.cjimenezro.Electricidad_Chispas.domain.usecase.GetCustomerUseCase;
import com.cjimenezro.Electricidad_Chispas.domain.usecase.UpdateCustomerUseCase;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        Autonomos autonomo = new Autonomos();
        System.out.println("AUTONOMO");
        System.out.println("Codigo del cliente:");
        autonomo.setCodigoCliente(entrada.nextInt());
        System.out.println("Nombre del cliente:");
        autonomo.setCorporatioName(entrada.next());
        System.out.println("Apellido del cliente:");
        autonomo.setApellidos(entrada.next());
        System.out.println("DNI del cliente:");
        autonomo.setCorporationId(entrada.next());
        System.out.println("Email del cliente:");
        autonomo.setEmail(entrada.next());
        System.out.println("Poblacion del cliente:");
        autonomo.setPoblacion(entrada.next());
        System.out.println("Provincia del cliente:");
        autonomo.setProvincia(entrada.next());
        System.out.println("Telefono del cliente:");
        autonomo.setTelefono(entrada.nextInt());
        System.out.println("Direccion postal del cliente:");
        autonomo.setDireccionPostal(entrada.next());


        Sociedades sociedad = new Sociedades();
        System.out.println("SOCIEDAD");
        System.out.println("Codigo del cliente:");
        sociedad.setCodigoCliente(entrada.nextInt());
        System.out.println("Nombre de la sociedad:");
        sociedad.setCorporatioName(entrada.next());
        System.out.println("CIF de la sociedad:");
        sociedad.setCorporationId(entrada.next());
        System.out.println("Email de la sociedad:");
        sociedad.setEmail(entrada.next());
        System.out.println("Poblacion de la sociedad:");
        sociedad.setPoblacion(entrada.next());
        System.out.println("Provincia de la sociedad:");
        sociedad.setProvincia(entrada.next());
        System.out.println("Direccion postal de la sociedad:");
        sociedad.setDireccionPostal(entrada.next());
        System.out.println("Telefono de la sociedad:");
        sociedad.setTelefono(entrada.nextInt());


        Productos productos = new Productos();
        System.out.println("PRODUCTO");
        System.out.println("Codigo del producto:");
        productos.setCodigo(entrada.nextInt());
        System.out.println("Marca del producto:");
        productos.setMarca(entrada.next());
        System.out.println("Modelo del producto:");
        productos.setModelo(entrada.next());
        System.out.println("Precio del producto:");
        productos.setPrecio(entrada.nextInt());
        System.out.println("Tipo de IVA del producto:");
        productos.setTipoIva(entrada.nextInt());

        Productos producto2 = new Productos();
        System.out.println("PRODUCTO");
        System.out.println("Codigo del producto:");
        producto2.setCodigo(entrada.nextInt());
        System.out.println("Marca del producto:");
        producto2.setMarca(entrada.next());
        System.out.println("Modelo del producto:");
        producto2.setModelo(entrada.next());
        System.out.println("Precio del producto:");
        producto2.setPrecio(entrada.nextInt());
        System.out.println("Tipo de IVA del producto:");
        producto2.setTipoIva(entrada.nextInt());


        Servicios servicios = new Servicios();
        System.out.println("SERVICIO");
        System.out.println("Codigo del servicio:");
        servicios.setCodigo(entrada.nextInt());
        System.out.println("Nombre del servicio:");
        servicios.setNombre(entrada.next());
        System.out.println("Precio del servicio:");
        servicios.setPrecio(entrada.nextInt());
        System.out.println("Tipo de IVA del servicio:");
        servicios.setTipoIva(entrada.nextInt());

        Servicios servicio2 = new Servicios();
        System.out.println("SERVICIO");
        System.out.println("Codigo del servicio:");
        servicio2.setCodigo(entrada.nextInt());
        System.out.println("Nombre del servicio:");
        servicio2.setNombre(entrada.next());
        System.out.println("Precio del servicio:");
        servicio2.setPrecio(entrada.nextInt());
        System.out.println("Tipo de IVA del servicio:");
        servicio2.setTipoIva(entrada.nextInt());


        Facturas factura = new Facturas();
        System.out.println("FACTURA");
        System.out.println("Codigo de la factura:");
        factura.setCodigoFactura(entrada.nextInt());
        System.out.println("Fecha de la factura:");
        factura.setFechaFactura(entrada.next());
        System.out.println("Codido del cliente: \r\n"+autonomo.getCodigoCliente());
        factura.setCodigoCliente(autonomo);
        System.out.println("Codigo del producto: \r\n"+productos.getCodigo());
        factura.setCodigoProducto(productos);
        System.out.println("Codigo del servicio: \r\n"+servicios.getCodigo());
        factura.setGetCodigoServicio(servicios);
        System.out.println("Base imponible:");
        factura.setBaseImponible(entrada.nextInt());
        System.out.println("Total:");
        factura.setTotal(entrada.nextInt());

        Facturas factura2 = new Facturas();
        System.out.println("FACTURA");
        System.out.println("Codigo de la factura:");
        factura2.setCodigoFactura(entrada.nextInt());
        System.out.println("Fecha de la factura:");
        factura2.setFechaFactura(entrada.next());
        System.out.println("Codido del cliente: \r\n"+sociedad.getCodigoCliente());
        factura2.setCodigoCliente(sociedad);
        System.out.println("Codigo del producto: \r\n"+producto2.getCodigo());
        factura2.setCodigoProducto(producto2);
        System.out.println("Codigo del servicio: \r\n"+servicio2.getCodigo());
        factura2.setGetCodigoServicio(servicio2);
        System.out.println("Base imponible:");
        factura2.setBaseImponible(entrada.nextInt());
        System.out.println("Total:");
        factura2.setTotal(entrada.nextInt());

        ImpresionFacturas.print(factura);
        ImpresionFacturas.print(factura2);

        CustomerDataStore customerDataStore = new MemCustomerDataStore();

        AddCustomerUseCase addCustomerUseCase = new AddCustomerUseCase(customerDataStore);
        addCustomerUseCase.execute(autonomo);
        addCustomerUseCase.execute(sociedad);

        GetCustomerUseCase getCustomerUseCase = new GetCustomerUseCase(customerDataStore);
        List<Clientes> customers = getCustomerUseCase.execute();
        for (int i =0;i<customers.size();i++){
            printCliente(customers.get(i));
        }

        DeleteCustomerUseCase deleteCustomerUseCase = new DeleteCustomerUseCase(customerDataStore);
        deleteCustomerUseCase.execute(autonomo);
        List<Clientes> customers2 = getCustomerUseCase.execute();
        for (int i = 0; i < customers2.size(); i++) {
            printCliente(customers2.get(i));
        }

        sociedad.setEmail("0000000000");
        UpdateCustomerUseCase updateCustomerUseCase = new UpdateCustomerUseCase(customerDataStore);
        updateCustomerUseCase.execute(sociedad);
        List<Clientes> customers3 = getCustomerUseCase.execute();
        for (int i = 0; i < customers3.size(); i++) {
            printCliente(customers3.get(i));
        }



        public static void printCliente(Clientes cliente) {
            System.out.println("Cod: " + cliente.getCodCliente() + " Nombre: " + cliente.getNombre() + " Email: " + cliente.getEmail());
        }
    }

}