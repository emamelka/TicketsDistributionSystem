package pl.emamelka.ticketsDistributionSystem.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.emamelka.ticketsDistributionSystem.model.Customer;
import pl.emamelka.ticketsDistributionSystem.repo.CustomerRepo;

@Service
public class CustomerService {


    @Autowired
    private CustomerRepo customerRepo;

    public Customer createCustomer(){
        return customerRepo.createCustomer(new Customer("customer"));
    }
}
