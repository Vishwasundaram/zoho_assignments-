/*4. Design a Java Ticket Booking System using polymorphism where Bus, Train, 
and Flight tickets share a common method but implement booking differently.
*/
class Ticket{
  String name;
  String genter;
  int ticketprice;
  int seat;
  int total;
  
  public void same(String name,String genter,int ticketprice,int seat){
    this.name=name;
    this.genter=genter;
    this.ticketprice=ticketprice;
    this.seat=seat;
    total=seat*ticketprice;
  }
}

class Bus extends Ticket{
    
     public void same(String name,String genter,int ticketprice,int seat){
    super.same(name,genter, ticketprice, seat);
    System.out.println("TRAVEL ~BUS"+"\n"+"-------------------"+"\n"+"NAME: "+name+"\n"+"TICKET PRICE:"+ticketprice+"\n"+"GENTER:"+genter+"\n"+"BOOK YOUR SEAT:"+seat+"\n"+"Total AMOUNT:"+total);

  }

    
}
class Train extends Ticket{
     public void same(String name,String genter,int ticketprice,int seat){
    super.same(name,genter, ticketprice, seat);
     System.out.println("TRAVEL ~TRAIN"+"\n"+"-------------------"+"\n"+"NAME: "+name+"\n"+"TICKET PRICE:"+ticketprice+"\n"+"GENTER:"+genter+"\n"+"BOOK YOUR SEAT:"+seat+"\n"+"Total AMOUNT:"+total);
  }


}
class Flight extends Ticket{
     public void same(String name,String genter,int ticketprice,int seat){
    super.same(name,genter, ticketprice, seat);
     System.out.println("TRAVEL ~FLIGHT"+"\n"+"-------------------"+"\n"+"NAME: "+name+"\n"+"TICKET PRICE:"+ticketprice+"\n"+"GENTER:"+genter+"\n"+"BOOK YOUR SEAT:"+seat+"\n"+"Total AMOUNT:"+total);
  }


}
public class On4{
    public static void main(String[] args) {
        Bus obj1=new Bus();
        Train obj2=new Train();
        Flight obj3=new Flight();
        obj1.same("Vicky", "Male", 100, 4);
        System.out.println("-------------------------------------------");
        obj1.same("Vinoth", "Male", 100, 8);
        System.out.println("-------------------------------------------");
        obj2.same("Selvam", "Male", 300, 1);
        System.out.println("-------------------------------------------");
        obj2.same("Sanjay", "Male", 500, 2);
        System.out.println("-------------------------------------------");
        obj3.same("Sundaram", "Male", 2000, 4);
        System.out.println("-------------------------------------------");
        obj3.same("Muthu Selvam", "Male", 10000, 3);
        System.out.println("-------------------------------------------");

        
        
    }
}
/*OUTPUT:
TRAVEL ~BUS
-------------------
NAME: Vicky
TICKET PRICE:100
GENTER:Male
BOOK YOUR SEAT:4
Total AMOUNT:400
-------------------------------------------
TRAVEL ~BUS
-------------------
NAME: Vinoth
TICKET PRICE:100
GENTER:Male
BOOK YOUR SEAT:8
Total AMOUNT:800
-------------------------------------------
TRAVEL ~TRAIN
-------------------
NAME: Selvam
TICKET PRICE:300
GENTER:Male
BOOK YOUR SEAT:1
Total AMOUNT:300
-------------------------------------------
TRAVEL ~TRAIN
-------------------
NAME: Sanjay
TICKET PRICE:500
GENTER:Male
BOOK YOUR SEAT:2
Total AMOUNT:1000
-------------------------------------------
TRAVEL ~FLIGHT
-------------------
NAME: Sundaram
TICKET PRICE:2000
GENTER:Male
BOOK YOUR SEAT:4
Total AMOUNT:8000
-------------------------------------------
TRAVEL ~FLIGHT
-------------------
NAME: Muthu Selvam
TICKET PRICE:10000
GENTER:Male
BOOK YOUR SEAT:3
Total AMOUNT:30000
-------------------------------------------
*/