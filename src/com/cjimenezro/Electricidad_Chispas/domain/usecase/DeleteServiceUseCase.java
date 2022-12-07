package com.cjimenezro.Electricidad_Chispas.domain.usecase;

import com.cjimenezro.Electricidad_Chispas.data.ServiceDataStore;
import com.cjimenezro.Electricidad_Chispas.domain.models.Servicios;

public class DeleteServiceUseCase {

    private ServiceDataStore serviceDataStore;

    public DeleteServiceUseCase(ServiceDataStore serviceDataStore){
        this.serviceDataStore=serviceDataStore;
    }

    public void execute (Servicios service){
        serviceDataStore.deleteService(service);
    }

}
