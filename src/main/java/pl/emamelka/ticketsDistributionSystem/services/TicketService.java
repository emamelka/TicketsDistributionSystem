package pl.emamelka.ticketsDistributionSystem.services;

import org.springframework.stereotype.Service;
import pl.emamelka.ticketsDistributionSystem.model.Ticket;

@Service
public class TicketService {

    private int ticketInitPrice = 1;

    public Ticket getTicket(){
        return new Ticket("up", ticketInitPrice++ );
    }
}
