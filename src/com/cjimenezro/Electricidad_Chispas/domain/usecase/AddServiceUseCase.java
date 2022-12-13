package com.cjimenezro.Electricidad_Chispas.domain.usecase;

import com.cjimenezro.Electricidad_Chispas.data.CustomerDataStore;
import com.cjimenezro.Electricidad_Chispas.data.ServiceDataStore;
import com.cjimenezro.Electricidad_Chispas.domain.models.Servicios;

public class AddServiceUseCase {

    private ServiceDataStore serviceDataStore;

    public AddServiceUseCase(ServiceDataStore serviceDataStore){
        this.serviceDataStore=serviceDataStore;
    }

    public void  execute(Servicios service){
        serviceDataStore.saveService(service);
    }

}
