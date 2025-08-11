/*4. Design the Vehicle class that stores information about a vehicle such as its vehicle ID, brand name, and price, such that it can internally keep track of how many vehicles have been created so far, without requiring manual counting from outside the class.*/
public class Vehicle{
        public static void main(String[] args) {
        VehicleData value1=new VehicleData(1,"ROllRAYALS",2000000.00);
        value1.dis();
        VehicleData value2=new VehicleData(1,"BOLIRO",2000000.00);
        value2.dis();
    }
}
class VehicleData{
     int ID;
    String name;
    double price;
    static int count;
    VehicleData(int ID,String name,double price){
        this.ID=ID;
        this.name=name;
        this.price=price;
        count++;
    }
    void dis(){
        System.out.println("VEHICLE_ID:"+ID+"\n"+"VEHICLE_NAME:"+name+"\n"+"PRICE:"+price);
        System.out.println(count);
    }

}
/*  OUTPUT:
VEHICLE_ID:1
VEHICLE_NAME:ROllRAYALS
PRICE:2000000.0
1
VEHICLE_ID:1
VEHICLE_NAME:BOLIRO
PRICE:2000000.0
2
*/
