/*4. Design a travel booking system using two packages:``travel.booking – includes a class``Ticket with ticket ID,
destination, and fare.``travel.user – includes a class``User with user details and a method to book a ticket.
Illustrate accessing ticket data from within the user class. */
 
package travel;
import booking.Booking;
import java.util.Scanner;
public class TravelUser{
    private String name;
    private int age;
    private String Genter;

    public void setName(String name){
        this.name=name;
    }
    public void setAge(int age){
        this.age=age;
    }
    public void setGen(String Genter){
        this.Genter=Genter;
    }
    public String getName(){
        return name;
    }
     public int getAge(){
        return age;
    }
     public String getGen(){
        return Genter;
    }
 //------------------------------------------------
    public static void print(){
        Scanner scan=new Scanner(System.in);
        Booking obj=new Booking();
        TravelUser obj1=new TravelUser();

        System.out.println("Full the Form:");
        System.out.println("Enter the Name:");
        String name=scan.nextLine();
        System.out.println("Enter the Age:");
        int age=scan.nextInt();scan.nextLine();
        System.out.println("Enter the Gender:");
        String gen=scan.nextLine();
        System.out.println("Enter the Destination Name:");
        String place=scan.nextLine();

        obj.setId(1);
        obj.setFare(600);
        obj.setDestination(place);
        obj1.setName(name);
        obj1.setAge(age);
        obj1.setGen(gen);

        System.out.println("BOOKING APPLICATION.");
        System.out.println("---------------------");
        System.out.println("Name:       "+(obj1.getName()));
        System.out.println("Age:        "+(obj1.getAge()));
        System.out.println("Genter:     "+(obj1.getGen()));
        System.out.println("Ticket ID:  "+(obj.getId()));
        System.out.println("Destination:"+(obj.getDestination()));
        System.out.println("Fare:       "+(obj.getFare()));

    }

}