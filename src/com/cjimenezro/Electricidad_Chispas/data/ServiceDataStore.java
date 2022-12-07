package com.cjimenezro.Electricidad_Chispas.data;

import com.cjimenezro.Electricidad_Chispas.domain.models.Servicios;

import java.util.List;

public interface ServiceDataStore {

    void saveService(Servicios service);

    void deleteService(Servicios service);

    void updateService(Servicios service);

    List<Servicios> getAllServices();
    Servicios findById (Integer codService);
}