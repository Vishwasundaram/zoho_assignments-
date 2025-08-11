

/*4. Write a program to illustrate that Classes cannot be used for multiple Inheritance.*/
public class MultipleInheritance{                // MultipleInheritance only invoke by interface concept
    public static void main(String[] args) {
        Child ob=new Child();
        ob.display();
    }
}
class Parent1{
    public void display(){
        System.out.println("hello");
    }
}
class Parent2{
   public void display(){
        System.out.println("world");
    }
}
class Child extends Parent1,Parent2{           
    System.out.println("can not support");
}
/* ERROR:
MultipleInheritance.java:20: error: '{' expected
class Child extends Parent1,Parent2{
                           ^
1 error
*/