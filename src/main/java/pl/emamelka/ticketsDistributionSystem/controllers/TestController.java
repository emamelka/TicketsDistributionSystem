package pl.emamelka.ticketsDistributionSystem.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import pl.emamelka.ticketsDistributionSystem.model.Customer;
import pl.emamelka.ticketsDistributionSystem.model.Ticket;
import pl.emamelka.ticketsDistributionSystem.services.CustomerService;
import pl.emamelka.ticketsDistributionSystem.services.TicketService;

@RestController
@RequestMapping("/api")
@ResponseBody
public class TestController {

    @Autowired
    private TicketService ticketService;

    @Autowired
    private CustomerService customerService;

    @GetMapping
    public String getDefaultMethod(){
        return "Witaj";
    }

    @PostMapping (value = "/ticket", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public Ticket createTicket(){
        return ticketService.createTicket();
    }

    @PostMapping(value = "/customer", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public Customer createCustomer(){
        return customerService.createCustomer();
    }

}
