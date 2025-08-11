/*2. Demonstrate multiple catch blocks: accept two numbers as strings, then convert them to integers, 
and perform division, and catch the following exceptions: InputMismatchException, NumberFormatException, ArithmeticException 
and Exception.*/
import java.util.InputMismatchException;
public class Qon2{
    public static void main(String[] args){
       try{
        String a="10",b="20";
        int num0=Integer.parseInt(a);
        int num1=Integer.parseInt(b);
        int divided=num0/num1;
        System.out.println(divided);
       }
       catch(InputMismatchException e){
        System.out.println("InputMismatchException");
        System.out.println(e);
       }
       catch(NumberFormatException e){
         System.out.println("NumberFormatException");
        System.out.println(e);
       }
        catch(ArithmeticException e){
        System.out.println("ArithmeticException");
        System.out.println(e);
       }
        catch(Exception e){
        System.out.println("Exception");
        System.out.println(e);
       }
    }
}
