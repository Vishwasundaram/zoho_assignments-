
import java.util.Scanner;

/*4. Create a Java application to manage employees in a company. Define an Interface Employee with a method
calculateSalary(). Then create two subclasses FullTimeEmployee and PartTimeEmployee that override calculateSalary()
method based on their working type. Demonstrate runtime polymorphism by calling calculateSalary() on different types
of employees using the Employee reference.*/
interface Employee{

    public abstract void calculateSalary(int onedaysalary);
   
 }
class FullTimeEmployee implements  Employee{
    
    
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
class PartTimeEmployee implements  Employee{
  
    
    public void calculateSalary(int onedaysalary){
    
        Scanner scan=new Scanner(System.in);
        System.out.println("PartTime Employee:");
        System.out.println("-------------------------");
        System.out.println("How many days comming from the office:");
        int comming=scan.nextInt();
        
        int total=comming*onedaysalary;
        System.out.println("Part Time Employee salary:"+total);
        
    }
}

 public class Qon4{
    public static void main(String[] args) {
        Scanner scan2=new Scanner(System.in);
        FullTimeEmployee obj1=new FullTimeEmployee();
        PartTimeEmployee obj2=new PartTimeEmployee();
        int count=0;
       while(true){
           
           System.out.println("PRESS 1: Full Time Employee.");
           System.out.println("PRESS 2: Part Time Employee.");
           System.out.println("PRESS 3: View The Employee.");
           System.out.println("PRESS 4: EXIT.");
           int user=scan2.nextInt();
           switch (user) {
               
               case 1:
                   obj1.calculateSalary(300);
                   count++;
                   break;
                case 2:
                
                   obj2.calculateSalary(300);
                   count++;
                   break;
                case 3:
                   System.out.println("No of Employee:"+count);
                    
                 case 4:
                       return ;
               default:
                   System.out.println("Invalid Choice.");
           }
       }
    }
 }
 /*OUTPUT:
 PRESS 1: Full Time Employee.
PRESS 2: Part Time Employee.
PRESS 3: View The Employee.
PRESS 4: EXIT.
1
FullTime Employee:
-------------------------
How many days leave from the office:
5
Full Time Employee salary:7500
PRESS 1: Full Time Employee.
PRESS 2: Part Time Employee.
PRESS 3: View The Employee.
PRESS 4: EXIT.
2
PartTime Employee:
-------------------------
How many days comming from the office:
12
Part Time Employee salary:3600
PRESS 1: Full Time Employee.
PRESS 2: Part Time Employee.
PRESS 3: View The Employee.
PRESS 4: EXIT.
3
No of Employee:2
*/