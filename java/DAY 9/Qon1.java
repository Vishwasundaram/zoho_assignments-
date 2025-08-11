/*1. int[] arr = {2, 5, 1, 4, 0, 7};
int quotient = arr[7] / arr[4];
Develop a Java program which handles any unexpected situations that may arise during execution.*/
import java.lang.reflect.Array;
import java.util.Arrays;
public class Qon1{
    public static void main(String[] args){
        Excep ob1=new Excep();
        int[] arr={2,5,1,4,0,7};
        ob1.check(arr);
    }
}
class Excep{
    public void check(int[] arr){
        try{
        int quotient = arr[7] / arr[4];
        System.out.println(quotient);
        }
        catch(ArithmeticException e){
            System.out.println(e);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        }
    }
}
/*OUTPUT:
java.lang.ArrayIndexOutOfBoundsException: Index 7 out of bounds for length 6
*/