package com.cjimenezro.Electricidad_Chispas.domain.usecase;

import com.cjimenezro.Electricidad_Chispas.data.ProductDataStore;
import com.cjimenezro.Electricidad_Chispas.domain.models.Productos;

public class UpdateProductUseCase {

    private ProductDataStore productDataStore;

    public UpdateProductUseCase(ProductDataStore productDataStore){
        this.productDataStore=productDataStore;
    }

    public void execute (Productos product){
        productDataStore.updateProduct(product);
    }

}
