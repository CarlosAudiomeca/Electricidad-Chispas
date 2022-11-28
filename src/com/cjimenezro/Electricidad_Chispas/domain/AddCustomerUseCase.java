package com.cjimenezro.Electricidad_Chispas.domain;

import com.cjimenezro.Electricidad_Chispas.Clientes;
import com.cjimenezro.Electricidad_Chispas.data.CustomerDataStore;

public class AddCustomerUseCase {

    public void execure(Clientes customer){
        CustomerDataStore customerDataStore = new CustomerDataStore() {
            @Override
            public void saveCustomer(Clientes cliente) {

            }

            @Override
            public void deleteCustomer(Clientes cliente) {

            }

            @Override
            public void updateCustomer(Clientes cliente) {

            }
        }
    }

}
