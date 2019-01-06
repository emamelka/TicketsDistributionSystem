package pl.emamelka.ticketsDistributionSystem.repo;

import org.springframework.stereotype.Repository;
import pl.emamelka.ticketsDistributionSystem.model.Customer;

import java.util.HashMap;
import java.util.Map;

@Repository
public class CustomerRepo {

    public Map<Integer, Customer> customers= new HashMap<>();
    private int customerIndex = 0;

    public Customer getCustomer(int id){
        return customers.get(id);
    }

    public Customer createCustomer(Customer customer){
        int currentCustomerIndex = customerIndex++;
        customer.setId(currentCustomerIndex);
        customers.put(currentCustomerIndex, customer);

        return customer;
    }
}
