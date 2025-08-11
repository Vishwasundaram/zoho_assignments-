
import java.util.ArrayList;
import java.util.Scanner;
/*5. Develop a Java application for a Ticket Booking System that allows users to book tickets for different types of
transportation modes such as Bus, Train, and Flight.
 Define a common interface or abstract class Ticket with a method bookTicket() that each transportation mode
must implement differently.
 Create classes BusTicket, TrainTicket, and FlightTicket that extend the abstract class or implement the
interface.
 Demonstrate runtime polymorphism by calling the bookTicket() method using a reference of the base
class/interface. */
interface Ticket{
    public void bookTicket(Scanner scan);
}
class BusTicket implements Ticket{
    String name;
    int age;
    String gen;
    int seat;
    int price=100;
    int total;

    public void bookTicket(Scanner scan){
        System.out.println("Enter the Name:");
        String name=scan.nextLine();
        this.name=name;
        System.out.println("Enter the Age:");
        int age=scan.nextInt();scan.nextLine();
        this.age=age;
        System.out.println("Enter the Gender:");
        String gen=scan.nextLine();
        this.gen=gen; 
        System.out.println("How many Seat want to be Book.");
        int seat=scan.nextInt();
        this.seat=seat;
        total=seat*price;
    }
    public String toString(){
        return "Name:"+name+"\n"+"Age:"+age+"\n"+"Gender:"+gen+"\n"+"Seat:"+seat+"\n"+"Ticket Price:"+price+"\n"+"Total:"+total+"\n"+"Successfully Booked.";
    }
}
class TrainTicket implements Ticket{
    String name;
    int age;
    String gen;
    int seat;
    int price=200;
    int total;

    public void bookTicket(Scanner scan){
        System.out.println("Enter the Name:");
        String name=scan.nextLine();
        this.name=name;
        System.out.println("Enter the Age:");
        int age=scan.nextInt();scan.nextLine();
        this.age=age;
        System.out.println("Enter the Gender:");
        String gen=scan.nextLine();
        this.gen=gen; 
        System.out.println("How many Seat want to be Book.");
        int seat=scan.nextInt();
        this.seat=seat;
        total=seat*price;
    }
     public String toString(){
        return "Name:"+name+"\n"+"Age:"+age+"\n"+"Gender:"+gen+"\n"+"Seat:"+seat+"\n"+"Ticket Price:"+price+"\n"+"Total:"+total+"\n"+"Successfully Booked.";
    }
}
class FlightTicket implements Ticket{
    String name;
    int age;
    String gen;
    int seat;
    int price=1000;
    int total;

    public void bookTicket(Scanner scan){
        System.out.println("Enter the Name:");
        String name=scan.nextLine();
        this.name=name;
        System.out.println("Enter the Age:");
        int age=scan.nextInt();scan.nextLine();
        this.age=age;
        System.out.println("Enter the Gender:");
        String gen=scan.nextLine();
        this.gen=gen; 
        System.out.println("How many Seat want to be Book.");
        int seat=scan.nextInt();scan.nextLine();
        this.seat=seat;
        total=seat*price;
    }
     public String toString(){
        return "Name:"+name+"\n"+"Age:"+age+"\n"+"Gender:"+gen+"\n"+"Seat:"+seat+"\n"+"Ticket Price:"+price+"\n"+"Total:"+total+"\n"+"Successfully Booked.";
    }
}

public class Qon5{
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        ArrayList<BusTicket> bus=new ArrayList<>();
        ArrayList<TrainTicket> train=new ArrayList<>();
        ArrayList<FlightTicket> flight=new ArrayList<>();

        Qon5 ob=new Qon5();

        BusTicket ob1=new BusTicket();
        TrainTicket ob2=new TrainTicket();
        FlightTicket ob3=new FlightTicket();
        
        while (true) { 
            System.out.println("PRESS 1:Booking for Bus.");
            System.out.println("PRESS 2:Booking for Train.");
            System.out.println("PRESS 3:Booking for Flight.");
            System.out.println("PRESS 4:View the Bus Ticket.");
            System.out.println("PRESS 5:View the Train Ticket.");
            System.out.println("PRESS 6:View the Flight Ticket.");
            System.out.println("PRESS 7:Exit.");
            int user=scan.nextInt();scan.nextLine();
            switch (user) {
                
                case 1:
                   ob1.bookTicket(scan);
                   bus.add(ob1);
                   System.out.println("----------------------");
                    break;
                
                case 2:
                    ob2.bookTicket(scan);
                    train.add(ob2);
                    System.out.println("----------------------");
                    break;
                
                case 3:
                    ob3.bookTicket(scan);
                    flight.add(ob3);
                    System.out.println("----------------------");
                    break;

                case 4:
                    for(BusTicket b:bus){
                        System.out.println(b);
                    }
                    System.out.println("----------------------");
                    break;

                case 5:
                    for(TrainTicket c:train){
                        System.out.println(c);
                    }
                    System.out.println("----------------------");
                    break;

                case 6:
                    for(FlightTicket d:flight){
                        System.out.println(d);
                    }
                    System.out.println("----------------------");
                    break;

                case 7:
                    scan.close();
                 return;

                default:
                    System.out.println("Invalid Choice.");

                    
            }

        }
        
    }
}
/* OUTPUT:
PRESS 1:Booking for Bus.
PRESS 2:Booking for Train.
PRESS 3:Booking for Flight.
PRESS 4:View the Bus Ticket.
PRESS 5:View the Train Ticket.
PRESS 6:View the Flight Ticket.
PRESS 7:Exit.
1
Enter the Name:
vishwa
Enter the Age:
20
Enter the Gender:
male
How many Seat want to be Book.
4
----------------------
PRESS 1:Booking for Bus.
PRESS 2:Booking for Train.
PRESS 3:Booking for Flight.
PRESS 4:View the Bus Ticket.
PRESS 5:View the Train Ticket.
PRESS 6:View the Flight Ticket.
PRESS 7:Exit.
2
Enter the Name:
esakki
Enter the Age:
21
Enter the Gender:
male
How many Seat want to be Book.
2
----------------------
PRESS 1:Booking for Bus.
PRESS 2:Booking for Train.
PRESS 3:Booking for Flight.
PRESS 4:View the Bus Ticket.
PRESS 5:View the Train Ticket.
PRESS 6:View the Flight Ticket.
PRESS 7:Exit.
3
Enter the Name:
kalai
Enter the Age:
30
Enter the Gender:
male
How many Seat want to be Book.
4
----------------------
PRESS 1:Booking for Bus.
PRESS 2:Booking for Train.
PRESS 3:Booking for Flight.
PRESS 4:View the Bus Ticket.
PRESS 5:View the Train Ticket.
PRESS 6:View the Flight Ticket.
PRESS 7:Exit.
1
Enter the Name:
tamil
Enter the Age:
23
Enter the Gender:
male
How many Seat want to be Book.
5
----------------------
PRESS 1:Booking for Bus.
PRESS 2:Booking for Train.
PRESS 3:Booking for Flight.
PRESS 4:View the Bus Ticket.
PRESS 5:View the Train Ticket.
PRESS 6:View the Flight Ticket.
PRESS 7:Exit.
4
Name:tamil
Age:23
Gender:male
Seat:5
Ticket Price:100
Total:500
Successfully Booked.
Name:tamil
Age:23
Gender:male
Seat:5
Ticket Price:100
Total:500
Successfully Booked.
----------------------
PRESS 1:Booking for Bus.
PRESS 2:Booking for Train.
PRESS 3:Booking for Flight.
PRESS 4:View the Bus Ticket.
PRESS 5:View the Train Ticket.
PRESS 6:View the Flight Ticket.
PRESS 7:Exit.
5
Name:esakki
Age:21
Gender:male
Seat:2
Ticket Price:200
Total:400
Successfully Booked.
----------------------
PRESS 1:Booking for Bus.
PRESS 2:Booking for Train.
PRESS 3:Booking for Flight.
PRESS 4:View the Bus Ticket.
PRESS 5:View the Train Ticket.
PRESS 6:View the Flight Ticket.
PRESS 7:Exit.
6
Name:kalai
Age:30
Gender:male
Seat:4
Ticket Price:1000
Total:4000
Successfully Booked.
----------------------
PRESS 1:Booking for Bus.
PRESS 2:Booking for Train.
PRESS 3:Booking for Flight.
PRESS 4:View the Bus Ticket.
PRESS 5:View the Train Ticket.
PRESS 6:View the Flight Ticket.
PRESS 7:Exit.
7
*/