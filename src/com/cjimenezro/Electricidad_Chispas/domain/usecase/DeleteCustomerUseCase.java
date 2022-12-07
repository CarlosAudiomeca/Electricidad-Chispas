package com.cjimenezro.Electricidad_Chispas.domain.usecase;

import com.cjimenezro.Electricidad_Chispas.data.CustomerDataStore;
import com.cjimenezro.Electricidad_Chispas.domain.models.Clientes;

public class DeleteCustomerUseCase {
    private CustomerDataStore customerDataStore;

    public DeleteCustomerUseCase (CustomerDataStore customerDataStore){
        this.customerDataStore=customerDataStore;
    }

    public void execute (Clientes customer){
        customerDataStore.deleteCustomer(customer);
    }

}
