package pl.emamelka.ticketsDistributionSystem.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.emamelka.ticketsDistributionSystem.model.Ticket;
import pl.emamelka.ticketsDistributionSystem.repo.TicketRepo;
import pl.emamelka.ticketsDistributionSystem.utils.Direction;

@Service
public class TicketService {


    @Autowired
    private TicketRepo ticketRepo;

    public Ticket createTicket(){
        return ticketRepo.createTicket(new Ticket(Direction.UP, 10));
    }
}
