/*1. Create a class named 'Student' with a string variable 'name' and an integer variable 'roll_no'. Assign the value of roll_no as '2' and that of name as "John" by creating an object of the class Student.*/
public class Student1{
    String name;                                //John
    int roll_no;                                //2
    Student1(String name,int roll_no) {
        this.name=name;                            
        this.roll_no=roll_no;
        // System.err.println(name+" "+roll_no);
    }
    public static void main(String[] args) {
        Student1 value=new Student1("John",2);
       // System.out.println(value.name+value.roll_no);
    }
}
