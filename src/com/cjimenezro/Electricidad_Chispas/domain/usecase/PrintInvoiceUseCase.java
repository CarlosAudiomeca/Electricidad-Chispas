package com.cjimenezro.Electricidad_Chispas.domain.usecase;

import com.cjimenezro.Electricidad_Chispas.data.InvoiceDataStore;
import com.cjimenezro.Electricidad_Chispas.domain.models.Facturas;
import com.cjimenezro.Electricidad_Chispas.presentation.ImpresionFacturas;

public class PrintInvoiceUseCase {

    private InvoiceDataStore invoiceDataStore;

    public PrintInvoiceUseCase(InvoiceDataStore invoiceDataStore){
        this.invoiceDataStore=invoiceDataStore;
    }

    public void execute(Facturas invoice){
        invoiceDataStore.printInvoice(invoice);
    }

}
