package com.cjimenezro.Electricidad_Chispas.domain.usecase;

import com.cjimenezro.Electricidad_Chispas.data.CustomerDataStore;
import com.cjimenezro.Electricidad_Chispas.data.MemCustomerDataStore;
import com.cjimenezro.Electricidad_Chispas.domain.models.Clientes;

import java.util.List;

public class GetCustomerUseCase {

    public List<Clientes> execute(){
        CustomerDataStore customerDataStore = new MemCustomerDataStore();
        return customerDataStore.getAllCustomers();
        public List<Clientes>execute() {
            return customerDataStore.getAllCustomers();
        }
    }

}
