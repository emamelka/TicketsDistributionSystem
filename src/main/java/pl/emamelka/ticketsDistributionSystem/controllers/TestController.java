package pl.emamelka.ticketsDistributionSystem.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import pl.emamelka.ticketsDistributionSystem.model.Ticket;

@RestController
@RequestMapping("/api")
@ResponseBody
public class TestController {

    @GetMapping
    public String getDefaultMethod(){
        return "Witaj";
    }

    @GetMapping("/ticket")
    public Ticket getTicket(){
        return new Ticket("up",10 );
    }

}
