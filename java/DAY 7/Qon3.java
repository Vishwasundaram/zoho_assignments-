
import java.util.Scanner;

/*3. Create a Java application to manage employees in a company. Define an abstract class Employee with a method
calculateSalary(). Then create two subclasses FullTimeEmployee and PartTimeEmployee that override calculateSalary()
method based on their working type. Demonstrate runtime polymorphism by calling calculateSalary() on different types
of employees using the Employee reference.*/
 abstract class Employee{

    int onedaysalary;
    
    public abstract void calculateSalary(int onedaysalary);
   
 }
class FullTimeEmployee extends Employee{
    
    
    public void calculateSalary(int onedaysalary){
       
        
        Scanner scan1=new Scanner(System.in);
        System.out.println("FullTime Employee:");
        System.out.println("-------------------------");
        System.out.println("How many days leave from the office:");
        int leave=scan1.nextInt();
        
        int checkday=30-leave;
        int total=checkday*onedaysalary;

        System.out.println("Full Time Employee salary:"+total);
    }


}
class PartTimeEmployee extends Employee{
  
    
    public void calculateSalary(int onedaysalary){
    
        Scanner scan=new Scanner(System.in);
        System.out.println("PartTime Employee:");
        System.out.println("-------------------------");
        System.out.println("How many days comming from the office:");
        int comming=scan.nextInt();
        
        int total=comming*onedaysalary;
        System.out.println("Part Time Employee salary:"+total);
        scan.close();
    }
}

 public class Qon3{
    public static void main(String[] args) {
        FullTimeEmployee obj1=new FullTimeEmployee();
        PartTimeEmployee obj2=new PartTimeEmployee();
       
        obj1.calculateSalary(300);
        System.out.println("--------------------------------");
        obj2.calculateSalary(300);
        System.out.println("--------------------------------");
        
        
    }
 }
 /*OUTPUT:
 FullTime Employee:
-------------------------
How many days leave from the office:
3
Full Time Employee salary:8100
--------------------------------
PartTime Employee:
-------------------------
How many days comming from the office:
10
Part Time Employee salary:3000
--------------------------------
*/