package com.cjimenezro.Electricidad_Chispas.data;

import com.cjimenezro.Electricidad_Chispas.Clientes;

public interface CustomerDataStore {

    void saveCustomer(Clientes cliente);

    void deleteCustomer(Clientes cliente);

    void updateCustomer(Clientes cliente);




}
