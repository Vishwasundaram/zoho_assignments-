/*6. Define a method to convert the decimal number to a binary number?*/
import java.util.Scanner;
public class Binary{
public static void main(String[] args){
Scanner value=new Scanner(System.in);
System.out.print("Enter the value:");
int a=value.nextInt();
String b=Integer.toBinaryString(a);
System.out.print("Binary value:"+b);
value.close();
}
}
/*  OUTPUT:
    Enter the value:10
    Binary value:1010
*/
