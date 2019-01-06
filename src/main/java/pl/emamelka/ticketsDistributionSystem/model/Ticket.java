package pl.emamelka.ticketsDistributionSystem.model;

import pl.emamelka.ticketsDistributionSystem.utils.Direction;

import java.util.Objects;

public class Ticket {

    private int id;
    private Direction direction;
    private int price;

    public Ticket() {
    }

    public Ticket(Direction direction, int price) {
        this.direction = direction;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public Direction getDirection() {
        return direction;
    }

    public int getPrice() {
        return price;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setDirection(Direction direction) {
        this.direction = direction;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ticket ticket = (Ticket) o;
        return id == ticket.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "Ticket{" +
                "id=" + id +
                '}';
    }
}
