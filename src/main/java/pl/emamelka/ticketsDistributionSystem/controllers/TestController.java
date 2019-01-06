package pl.emamelka.ticketsDistributionSystem.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import pl.emamelka.ticketsDistributionSystem.model.Ticket;
import pl.emamelka.ticketsDistributionSystem.services.TicketService;

@RestController
@RequestMapping("/api")
@ResponseBody
public class TestController {

    @Autowired
    private TicketService ticketService;

    @GetMapping
    public String getDefaultMethod(){
        return "Witaj";
    }

    @GetMapping("/ticket")
    public Ticket getTicket(){
        return ticketService.getTicket();
    }

}
