package com.cjimenezro.Electricidad_Chispas.domain.usecase;

import com.cjimenezro.Electricidad_Chispas.data.CustomerDataStore;
import com.cjimenezro.Electricidad_Chispas.data.ProductDataStore;
import com.cjimenezro.Electricidad_Chispas.domain.models.Productos;

public class DeleteProductUseCase {

    private ProductDataStore productDataStore;

    public DeleteProductUseCase (ProductDataStore productDataStore){
        this.productDataStore = productDataStore;
    }

    public void execute (Productos product){
        productDataStore.deleteProduct(product);
    }

}
