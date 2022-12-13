package com.cjimenezro.Electricidad_Chispas.data;

import com.cjimenezro.Electricidad_Chispas.domain.models.Productos;

import java.util.List;

public interface ProductDataStore {

    void saveProduct(Productos producto);

    void deleteProduct(Productos producto);

    void updateProduct(Productos producto);

    List<Productos> getAllProducts();
    Productos findById (Integer codProduct);
}