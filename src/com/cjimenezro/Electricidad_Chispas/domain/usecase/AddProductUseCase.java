package com.cjimenezro.Electricidad_Chispas.domain.usecase;

import com.cjimenezro.Electricidad_Chispas.data.CustomerDataStore;
import com.cjimenezro.Electricidad_Chispas.data.ProductDataStore;
import com.cjimenezro.Electricidad_Chispas.domain.models.Clientes;
import com.cjimenezro.Electricidad_Chispas.domain.models.Productos;

public class AddProductUseCase {

    private ProductDataStore productDataStore;

    public AddProductUseCase(ProductDataStore productDataStore){
        this.productDataStore = productDataStore;
    }

    public void execute(Productos product) {
        productDataStore.saveProduct(product);
    }

}
