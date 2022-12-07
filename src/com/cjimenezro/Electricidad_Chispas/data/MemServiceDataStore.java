package com.cjimenezro.Electricidad_Chispas.data;

import com.cjimenezro.Electricidad_Chispas.domain.models.Productos;
import com.cjimenezro.Electricidad_Chispas.domain.models.Servicios;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;

public class MemServiceDataStore implements ServiceDataStore{

    private TreeMap<Integer, Servicios> dataStore = new TreeMap<>();

    @Override
    public void saveService(Servicios service) {
        dataStore.put(service.getCodigo(),service);
    }

    @Override
    public void deleteService(Servicios service) {
        dataStore.remove(service.getCodigo());
    }

    @Override
    public void updateService(Servicios service) {
        dataStore.replace(service.getCodigo(),service);
    }

    @Override
    public List<Servicios> getAllServices() {
        return new ArrayList<>(dataStore.values());
    }

    @Override
    public Servicios findById(Integer codService) {
        return dataStore.get(codService);
    }
}
