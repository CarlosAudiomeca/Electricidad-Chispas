package com.cjimenezro.Electricidad_Chispas.domain.usecase;

import com.cjimenezro.Electricidad_Chispas.data.ServiceDataStore;
import com.cjimenezro.Electricidad_Chispas.domain.models.Servicios;

import java.lang.management.OperatingSystemMXBean;

public class UpdateServiceUseCase {

    private ServiceDataStore serviceDataStore;

    public UpdateServiceUseCase(ServiceDataStore serviceDataStore){
        this.serviceDataStore=serviceDataStore;
    }

    public void execute(Servicios service){
        serviceDataStore.updateService(service);
    }
}
