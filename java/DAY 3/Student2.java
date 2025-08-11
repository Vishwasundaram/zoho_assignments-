/*2. Create a class named Student that has the following attributes:
name (String)
roll_no (int)
phone_no (int)
address (String)
Create a constructor Student(String name, int roll_no, int phone_no, String address) and store and display the details for two students having names "Sam" and "John" respectively.*/
public class Student2{
    Student2(String name,int roll_no,int phone_no,String address){
        System.out.println("Name:"+name);
        System.out.println("Roll_No:"+roll_no);
        System.out.println("Phone_No:"+phone_no);
        System.out.println("Address:"+address);
    }   
    public static void main(String[] args) {
        Student2 value=new Student2("Sam",1,100,"Surandai");
        System.out.println("-------------------");
        Student2 value2=new Student2("John",2,200,"Surandai");
        System.out.println("-------------------");
    }
}
/*   OUTPUT:
Name:Sam
Roll_No:1
Phone_No:100
Address:Surandai
-------------------
Name:John
Roll_No:2
Phone_No:200
Address:Surandai
-------------------
*/
