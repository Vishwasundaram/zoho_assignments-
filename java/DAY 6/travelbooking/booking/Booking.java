package booking;

public class Booking{
    private int TicketId;
    private String destination;
    private int fare;

    public void setId(int id){
        TicketId=id;
    }
    public void setDestination(String destination){
        this.destination=destination;
    }
    public void setFare(int fare){
        this.fare=fare;
    }

    public int getId(){
        return TicketId;
    }
    public String getDestination(){
        return destination;
    }
    public int getFare(){
        return fare;
    }

}