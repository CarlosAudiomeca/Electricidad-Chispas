package com.cjimenezro.Electricidad_Chispas.data;

import com.cjimenezro.Electricidad_Chispas.domain.models.Clientes;
import com.cjimenezro.Electricidad_Chispas.domain.models.Productos;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;

public class MemProductDataStore implements ProductDataStore{

    private TreeMap<Integer, Productos> dataStore = new TreeMap<>();

    @Override
    public void saveProduct(Productos producto) {
        dataStore.put(producto.getCodigo(),producto);
    }

    @Override
    public void deleteProduct(Productos producto) {
        dataStore.remove(producto.getCodigo());
    }

    @Override
    public void updateProduct(Productos producto) {
        dataStore.replace(producto.getCodigo(),producto);
    }

    @Override
    public List<Productos> getAllProducts() {
        return new ArrayList<>(dataStore.values());
    }

    @Override
    public Productos findById(Integer codProduct) {
        return dataStore.get(codProduct);
    }
}