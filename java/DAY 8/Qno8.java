/*8. Write a Java program to demonstrate the concept of object cloning using the clone() method.
--->Create a class Student with fields like name, rollNo, and department.
--->Attempt to clone an object of this class using the clone() method.
--->Catch and handle the CloneNotSupportedException if thrown.
***Also find out and explain why the class must implement the Cloneable interface to avoid CloneNotSupportedException.
-->Your program should clearly illustrate:
a. What happens if Cloneable is not implemented
b. How the error is resolved by implementing Cloneable */


class Student{
    String name;
    int rollNo;
    String department;

    public Student(String name,int rollNo,String department) {
    this.name=name;
    this.rollNo=rollNo;
    this.department=department;
    }

}

public class Qno8 implements Cloneable{

    Student student;

    public Qno8(Student student) {
        this.student = student;
    }
    

    @Override
    protected Object clone()throws CloneNotSupportedException{
        return super.clone();
    }
    public static void main(String[] args)throws CloneNotSupportedException{
        Student stu=new Student("vishwa", 10, "ComputerScience");
        Qno8 ori=new Qno8(stu);
        Qno8 copy=(Qno8)ori.clone();

        System.out.println(ori.student.name);
        System.err.println(copy.student.name);

        ori.student.name="ananth";

        System.out.println(ori.student.name);
        System.out.println(copy.student.name);

    }
}
/*
b. How the error is resolved by implementing Cloneable 
 OUTPUT:
vishwa
vishwa
ananth
ananth*/

// class Student{
//     String name;
//     int rollNo;
//     String department;

//     public Student(String name,int rollNo,String department) {
//     this.name=name;
//     this.rollNo=rollNo;
//     this.department=department;
//     }

// }

// public class Qno8{

//     Student student;

//     public Qno8(Student student) {
//         this.student = student;
//     }
    

//     @Override
//     protected Object clone()throws CloneNotSupportedException{
//         return super.clone();
//     }
//     public static void main(String[] args)throws CloneNotSupportedException{
//         Student stu=new Student("vishwa", 10, "ComputerScience");
//         Qno8 ori=new Qno8(stu);
//         Qno8 copy=(Qno8)ori.clone();

//         System.out.println(ori.student.name);
//         System.err.println(copy.student.name);

//         ori.student.name="ananth";

//         System.out.println(ori.student.name);
//         System.out.println(copy.student.name);

//     }
// }
// /*
// OUTPUT:
// a. What happens if Cloneable is not implemented.

// Exception in thread "main" java.lang.CloneNotSupportedException: Qno8
//         at java.base/java.lang.Object.clone(Native Method)
//         at Qno8.clone(Qno8.java:76)
//         at Qno8.main(Qno8.java:81)
//         */