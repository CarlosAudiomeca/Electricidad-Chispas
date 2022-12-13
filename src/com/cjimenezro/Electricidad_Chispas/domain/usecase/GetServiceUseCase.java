package com.cjimenezro.Electricidad_Chispas.domain.usecase;

import com.cjimenezro.Electricidad_Chispas.data.ServiceDataStore;
import com.cjimenezro.Electricidad_Chispas.domain.models.Servicios;

import java.util.List;

public class GetServiceUseCase {

    private ServiceDataStore serviceDataStore;

    public GetServiceUseCase(ServiceDataStore serviceDataStore){
        this.serviceDataStore=serviceDataStore;
    }

    public List<Servicios> execute(){
        return serviceDataStore.getAllServices();
    }

}
