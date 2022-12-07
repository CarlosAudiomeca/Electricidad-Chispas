package com.cjimenezro.Electricidad_Chispas.domain.usecase;

import com.cjimenezro.Electricidad_Chispas.data.InvoiceDataStore;
import com.cjimenezro.Electricidad_Chispas.domain.models.Facturas;

public class AddInvoiceUseCase {

    private InvoiceDataStore invoiceDataStore;

    public AddInvoiceUseCase(InvoiceDataStore invoiceDataStore){
        this.invoiceDataStore=invoiceDataStore;
    }

    public void execute(Facturas invoice){
        invoiceDataStore.saveInvoice(invoice);
    }
}
