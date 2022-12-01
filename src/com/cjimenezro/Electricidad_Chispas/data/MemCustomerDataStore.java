package com.cjimenezro.Electricidad_Chispas.data;

import com.cjimenezro.Electricidad_Chispas.domain.models.Clientes;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;

public class MemCustomerDataStore implements CustomerDataStore{

    private TreeMap<Integer, Clientes> dataStore = new TreeMap<>();

    @Override
    public void saveCustomer(Clientes cliente) {
        dataStore.put(cliente.getCodigoCliente(), cliente);
    }

    @Override
    public void deleteCustomer(Clientes cliente) {
        dataStore.remove(cliente.getCodigoCliente());
    }

    @Override
    public void updateCustomer(Clientes cliente) {
        dataStore.replace(cliente.getCodigoCliente(),cliente);
    }

    @Override
    public List<Clientes> getAllCustomers() {
        return new ArrayList<>(dataStore.values());
    }

    @Override
    public Clientes findById(Integer codCliente) {
        return dataStore.get(codCliente);
    }
}
