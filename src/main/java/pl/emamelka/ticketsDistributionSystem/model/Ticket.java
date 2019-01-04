package pl.emamelka.ticketsDistributionSystem.model;

public class Ticket{

    private String direction;
    private int price;

    public Ticket(){

    }

    public Ticket(String direction, int price){
        this.direction = direction;
        this.price = price;
    }

    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
