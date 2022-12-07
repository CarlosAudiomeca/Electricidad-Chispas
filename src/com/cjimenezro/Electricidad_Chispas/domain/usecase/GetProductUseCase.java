package com.cjimenezro.Electricidad_Chispas.domain.usecase;

import com.cjimenezro.Electricidad_Chispas.data.ProductDataStore;
import com.cjimenezro.Electricidad_Chispas.domain.models.Productos;

import java.util.List;

public class GetProductUseCase {

    private ProductDataStore productDataStore;

    public GetProductUseCase (ProductDataStore productDataStore){
        this.productDataStore=productDataStore;
    }

    public List<Productos> execute(){
        return productDataStore.getAllProducts();
    }

}
