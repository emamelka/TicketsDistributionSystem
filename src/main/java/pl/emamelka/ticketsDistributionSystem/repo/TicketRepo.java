package pl.emamelka.ticketsDistributionSystem.repo;

import org.springframework.stereotype.Repository;
import pl.emamelka.ticketsDistributionSystem.model.Ticket;

import java.util.*;

@Repository
public class TicketRepo {

    private Map<Integer, Ticket> tickets = new HashMap<>();
    private int ticketIndex =0;

    public Ticket getTicket(int id){
        return tickets.get(id);
    }

    public Ticket createTicket(Ticket ticket){
        int currentTicketIndex = ticketIndex++;
        ticket.setId(currentTicketIndex);
        tickets.put(currentTicketIndex, ticket);

        return ticket;
    }


}
