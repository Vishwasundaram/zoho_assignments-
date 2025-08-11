/*Day-4 Assignment Questions:
1. We want to store the information about different vehicles.
 Create a class named Vehicle with two data member named mileage and price.
  Create its two subclasses
---Car with data members to store ownership cost, warranty (by years), seating capacity and fuel type (diesel or petrol).
---Bike with data members to store the number of cylinders, number of gears, cooling type(air,
          liquid or oil), wheel type(alloys or spokes) and fuel tank size(in inches)
Make another two subclasses Audi and Ford of Car, each having a data member to store the model type.
Next, make two subclasses Bajaj and TVS, each having a data member to store the make-type.
Now, store and print the information of an Audi and a Ford car (i.e. model type, ownership cost, warranty, seating capacity,
         fuel type, mileage and price.) Do the same for a Bajaj and a TVS bike. */
public class Vechicle1{
  public static void main(String[] args) {
    Audi obj1=new Audi("Audi",1000000,5,4,"Petrol",20,99999);
    Ford obj2=new Ford("Ford",2000000,3,5,"Diesel",25,255555);
    Bajaj obj3=new Bajaj("Bajaj",2,5,"oil","Alloys",10,45,100000);
    Tvs obj4=new Tvs("TVS",4,4,"liquid","spokes",10,55,90000);
  }
}
class Vechicle{
  int mileage;
  int price;
    
}
class Car extends Vechicle{
    String cartype;
    int cost;
    int warranty;
    int seating;
    String fuelType;
}
class Bike extends Vechicle{
    String biketype;
    int cylinders;
    int gears;
    String collingtype;
    String wheeltype;
    int tanksize;
}

class Audi extends Car{
  
          Audi(String cartype,int cost,int warranty,int seating,String fuelType,int mileage,int price){
          // this.cartype=cartype;
          // this.cost=cost;
          // this.warranty=warranty;
          // this.seating=seating;
          // this.fuelType=fuelType;
          // this.mileage=mileage;
          // this.price=price;
          System.out.println("CarType:"+cartype+"\n"+"Cost:"+cost+"\n"+"Warranty:"+warranty+"years\n"+"Seating:"+seating+"\n"+"FuelType:"+fuelType+"\n"+"Mileage:"+mileage+"\n"+"Price:"+price+"\n");
        }
}
class Ford extends Car{
          Ford(String cartype,int cost,int warranty,int seating,String fuelType,int mileage,int price){
          // this.cartype=cartype;
          // this.cost=cost;
          // this.warranty=warranty;
          // this.seating=seating;
          // this.fuelType=fuelType;
          // this.mileage=mileage;
          // this.price=price;
          System.out.println("CarType:"+cartype+"\n"+"Cost:"+cost+"\n"+"Warranty:"+warranty+"years\n"+"Seating:"+seating+"\n"+"FuelType:"+fuelType+"\n"+"Mileage:"+mileage+"\n"+"Price:"+price+"\n");
        }
}
class Bajaj extends Bike{
         Bajaj(String biketype,int cylinders,int gears,String collingtype,String wheeltype,int tanksize,int mileage,int price){
          // this.biketype=biketype;
          // this.cylinders=cylinders;
          // this.gears=gears;
          // this.collingtype=collingtype;
          // this.wheeltype=wheeltype;
          // this.tanksize=tanksize;
          // this.mileage=mileage;
          // this.price=price;
          System.out.println("Bike Type:"+biketype+'\n'+"Cylinders:"+cylinders+'\n'+"Gears:"+gears+'\n'+"Colling Type:"+collingtype+'\n'+"Wheel Type:"+wheeltype+'\n'+"Tank Size:"+tanksize+'\n'+"Mileage:"+mileage+"\n"+"Price:"+price+"\n");
         }

}
class Tvs extends Bike{
          Tvs(String biketype,int cylinders,int gears,String collingtype,String wheeltype,int tanksize,int mileage,int price){
          // this.biketype=biketype;
          // this.cylinders=cylinders;
          // this.gears=gears;
          // this.collingtype=collingtype;
          // this.wheeltype=wheeltype;
          // this.tanksize=tanksize;
          // this.mileage=mileage;
          // this.price=price;
          System.out.println("Bike Type:"+biketype+'\n'+"Cylinders:"+cylinders+'\n'+"Gears:"+gears+'\n'+"Colling Type:"+collingtype+'\n'+"Wheel Type:"+wheeltype+'\n'+"Tank Size:"+tanksize+'\n'+"Mileage:"+mileage+"\n"+"Price:"+price+"\n");
         }
}
/* OUTPUT:
CarType:Audi
Cost:1000000
Warranty:5years
Seating:4
FuelType:Petrol
Mileage:20
Price:99999

CarType:Ford
Cost:2000000
Warranty:3years
Seating:5
FuelType:Diesel
Mileage:25
Price:255555

Bike Type:Bajaj
Cylinders:2
Gears:5
Colling Type:oil
Wheel Type:Alloys
Tank Size:10
Mileage:45
Price:100000

Bike Type:TVS
Cylinders:4
Gears:4
Colling Type:liquid
Wheel Type:spokes
Tank Size:10
Mileage:55
Price:90000
*/