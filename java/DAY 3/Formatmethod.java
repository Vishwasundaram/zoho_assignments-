/*6. Write a program that would print the information (name, year of joining, salary, address) of three employees by creating a class named 'Employee'. The output should be as follows:
Name Year of joining Address
Robert 1994 64C- WallsStreat
Sam 2000 68D- WallsStreat
John 1999 26B- WallsStreat
Can use format method to format the above said output.*/
public class Formatmethod{
    String name;
    int year;
    int salary;
    String address;
    void details(String name,int year,int salary,String address){
        this.name=name;
        this.year=year;
        this.salary=salary;
        this.address=address;
    }
    void printvalue(){
        System.out.printf("%-10s %-10d %-10d %-10s%n",name,year,salary,address);
    }
    public static void main(String[] args) {
        Formatmethod valueset=new Formatmethod();
        System.out.printf("%-10s %-10s %-10s %-10s%n","Name","Year","Salary","Address");
        valueset.details("Robert", 1994, 64, "WallStreet");
        valueset.printvalue();
        valueset.details("Sam", 2004, 68, "WallStreet");
        valueset.printvalue();
        valueset.details("John", 1999, 26, "WallStreet");
        valueset.printvalue();
    }
}
/* OUTPUT:
Name       Year       Salary     Address   
Robert     1994       64         WallStreet
Sam        2004       68         WallStreet
John       1999       26         WallStreet
*/
