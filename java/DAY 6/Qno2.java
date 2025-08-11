import arith.Arithmetic;
import common.Cc;
public class Qno2{
    public static void main(String[] args){
        Arithmetic obj=new Arithmetic();
        Cc obj1=new Cc();
        System.out.println("Arithmetic.");
        obj.add(10,20);
        obj.subtract(20,10);
        obj.multiple(5,4);
        obj.divide(10,5);
        System.out.println("-------------------");
         System.out.println("String.");
         obj1.concat("hi","hello");
         obj1.reverse("java");
         obj1.length("Hello world");

    }
}
/*OUTPUT:
Arithmetic.
ADDITION value is :30
SUBTRACT value is :10
MULTIPLE value is :20
DIVIDE value is :2
-------------------
String.
hi hello
avaj
11
*/