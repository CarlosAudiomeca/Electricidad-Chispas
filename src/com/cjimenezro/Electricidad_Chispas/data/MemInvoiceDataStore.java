package com.cjimenezro.Electricidad_Chispas.data;

import com.cjimenezro.Electricidad_Chispas.domain.models.Facturas;
import com.cjimenezro.Electricidad_Chispas.presentation.ImpresionFacturas;
import com.sun.source.tree.Tree;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;

public class MemInvoiceDataStore implements InvoiceDataStore{

    private TreeMap<Integer, Facturas> dataStore = new TreeMap<>();

    @Override
    public void saveInvoice(Facturas invoice) {
        dataStore.put(invoice.getCodigoFactura(),invoice);
    }

    @Override
    public void printInvoice(Facturas invoice) {
        ImpresionFacturas.print(invoice);
    }

    @Override
    public void updateInvoice(Facturas invoice) {
        dataStore.replace(invoice.getCodigoFactura(),invoice);
    }

    @Override
    public List<Facturas> getAllInvoice() {
        return new ArrayList<>(dataStore.values());
    }

    @Override
    public Facturas findById(Integer codInvoice) {
        return dataStore.get(codInvoice);
    }
}
