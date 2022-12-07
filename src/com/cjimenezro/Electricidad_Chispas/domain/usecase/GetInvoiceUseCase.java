package com.cjimenezro.Electricidad_Chispas.domain.usecase;

import com.cjimenezro.Electricidad_Chispas.data.InvoiceDataStore;
import com.cjimenezro.Electricidad_Chispas.domain.models.Facturas;

import java.util.List;

public class GetInvoiceUseCase {

    private InvoiceDataStore invoiceDataStore;

    public GetInvoiceUseCase(InvoiceDataStore invoiceDataStore){
        this.invoiceDataStore=invoiceDataStore;
    }

    public List<Facturas> execute(){
        return invoiceDataStore.getAllInvoice();
    }

}
