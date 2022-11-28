package com.cjimenezro.Electricidad_Chispas.data;

import com.cjimenezro.Electricidad_Chispas.Clientes;

public class MemCustomerDataStore implements CustomerDataStore{

    private

    @Override
    public void saveCustomer(Clientes cliente) {
        dataStore.put(cliente.getCodigoCliente(), cliente);
    }

    @Override
    public void deleteCustomer(Clientes cliente) {
        dataStore.remove(cliente);
    }

    @Override
    public void updateCustomer(Clientes cliente) {
        dataStore.replace(cliente.getCodigoCliente(),cliente);
    }
}
