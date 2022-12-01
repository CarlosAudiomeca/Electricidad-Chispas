package com.cjimenezro.Electricidad_Chispas.domain.usecase;

import com.cjimenezro.Electricidad_Chispas.data.CustomerDataStore;
import com.cjimenezro.Electricidad_Chispas.data.MemCustomerDataStore;
import com.cjimenezro.Electricidad_Chispas.domain.models.Clientes;

import java.util.List;

public class GetCustomerUseCase {
    private CustomerDataStore customerDataStore;

    public GetCustomerUseCase(CustomerDataStore customerDataStore){
        this.customerDataStore=customerDataStore;
    }

   public List<Clientes> execute(){
        return customerDataStore.getAllCustomers();
   }

}
