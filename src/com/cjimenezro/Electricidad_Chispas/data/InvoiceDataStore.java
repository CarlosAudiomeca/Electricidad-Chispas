package com.cjimenezro.Electricidad_Chispas.data;

import com.cjimenezro.Electricidad_Chispas.domain.models.Facturas;

import java.util.List;

public interface InvoiceDataStore {

    void saveInvoice(Facturas invoice);

    void printInvoice(Facturas invoice);

    void updateInvoice(Facturas invoice);

    List<Facturas> getAllInvoice();

    Facturas findById (Integer codInvoice);


}
