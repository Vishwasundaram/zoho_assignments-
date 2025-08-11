/*3. Create a Java application to manage employees in a company. 
Define a base class Employee with a method calculateSalary().
Then create two subclasses FullTimeEmployee and PartTimeEmployee that override calculateSalary()
 method based on their working type.*/
 class Employee{
    int day;
    int onedaysalary;
    int total;
    public void calculateSalary(int onedaysalary,int day){
       this.onedaysalary=onedaysalary;
        this.day=day;
       
        total=day*onedaysalary;
    }
   
 }
class FullTimeEmployee extends Employee{
    
    
    public void calculateSalary(int onedaysalary,int day){
        super.calculateSalary(onedaysalary, day);
        System.out.println("Full Time Employee salary:"+total);
    }


}
class PartTimeEmployee extends Employee{
  
    
    public void calculateSalary(int onedaysalary,int day){
        super.calculateSalary(onedaysalary, day);
        System.out.println("Part Time Employee salary:"+total);
    }
}

 public class On3{
    public static void main(String[] args) {
        FullTimeEmployee obj1=new FullTimeEmployee();
        PartTimeEmployee obj2=new PartTimeEmployee();
        obj1.calculateSalary(300, 30);
        System.out.println("--------------------------------");
        obj2.calculateSalary(300, 10);
        System.out.println("--------------------------------");
        
        
    }
 }
 /* OUTPUT:
 Full Time Employee salary:9000
--------------------------------
Part Time Employee salary:3000
--------------------------------
*/