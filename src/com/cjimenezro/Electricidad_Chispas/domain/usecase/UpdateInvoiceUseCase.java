package com.cjimenezro.Electricidad_Chispas.domain.usecase;

import com.cjimenezro.Electricidad_Chispas.data.InvoiceDataStore;
import com.cjimenezro.Electricidad_Chispas.domain.models.Facturas;

public class UpdateInvoiceUseCase {

    private InvoiceDataStore invoiceDataStore;

    public UpdateInvoiceUseCase(InvoiceDataStore invoiceDataStore){
        this.invoiceDataStore=invoiceDataStore;
    }

    public void execute(Facturas invoice){
        invoiceDataStore.updateInvoice(invoice);
    }

}
