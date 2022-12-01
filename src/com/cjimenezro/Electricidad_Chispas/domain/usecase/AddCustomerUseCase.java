package com.cjimenezro.Electricidad_Chispas.domain.usecase;

import com.cjimenezro.Electricidad_Chispas.data.CustomerDataStore;
import com.cjimenezro.Electricidad_Chispas.data.MemCustomerDataStore;
import com.cjimenezro.Electricidad_Chispas.domain.models.Clientes;

public class AddCustomerUseCase {

    private CustomerDataStore customerDataStore;

    public AddCustomerUseCase(CustomerDataStore customerDataStore){
        this.customerDataStore = customerDataStore;
    }

    public void execute(Clientes customer) {
        customerDataStore.saveCustomer(customer);
    }

}
