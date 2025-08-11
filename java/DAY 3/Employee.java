/*3. Write a Java program where you define a class named Employee. Inside the class, define fields to hold an employee’s name, employee ID, designation, and salary.
a. First, create a no-argument constructor that prints a message saying the object has been created, and sets default values for all the fields.
b. Write a parametrized constructor that allows you to set values for all the fields when an object is created.
c. Add another constructor — a copy constructor — that takes an existing employee object and creates a new one with the same values.
In the main method, create:
a. One object using the no-argument constructor,
b. One object using the parametrized constructor,
c. And a third object using the copy constructor.
Finally, display the details of all three employees.*/
public class Employee{
    String name;
    int employee_ID;
    String designation;
    int salary;

    Employee() {
    }
    Employee(String name, int employee_ID, String designation, int salary) {
       this.name=name;
       this.employee_ID=employee_ID;
       this.designation=designation;
       this.salary=salary;
    }
    Employee(Employee copyconstractor) {
      copyconstractor.dis();
    }
    void dis(){
       System.out.println("NAME:"+name+"\n"+"ID:"+employee_ID+"\n"+"DESIGNATION:"+designation+"\n"+"SALAY:"+salary);
    }
    
    public static void main(String[] args) {
        Employee value=new Employee();
        Employee value1=new Employee("TAMIL",10,"DEVELOPER",200000);
        System.out.println("1,Object has been created, and sets default values for all the fields.");
        value.dis();
        System.out.println("------------------------------------------------");
        System.out.println("2,Parametrized constructor.");
        value1.dis();
        System.out.println("------------------------------------------------");
        System.out.println("3,Copy constructor.");
        Employee value2=new Employee(value1);
        System.out.println("------------------------------------------------");
    }
}
/*   OUTPUT:
1,Object has been created, and sets default values for all the fields.
NAME:null
ID:0
DESIGNATION:null
SALAY:0
------------------------------------------------
2,Parametrized constructor.
NAME:TAMIL
ID:10
DESIGNATION:DEVELOPER
SALAY:200000
------------------------------------------------
3,Copy constructor.
NAME:TAMIL
ID:10
DESIGNATION:DEVELOPER
SALAY:200000
------------------------------------------------
*/
