/*1. Write a program that uses if statement to find the minimum of three numbers.*/
import java.util.Scanner;
public class Minumvalue {
public static void main(String[] args) {
Scanner value = new Scanner(System.in);
System.out.println("Enter the A value:");
int a = value.nextInt();
System.out.println("Enter the B value:");
int b = value.nextInt();
System.out.println("Enter the C value:");
int c = value.nextInt();
if ((a == b) && (b == c) && (a == c)) System.out.print("ALL VALUES ARE EQUALS");
else if (a < b && a < c) System.out.print(a + " is a Minimum");
else if (b < a && b < c) System.out.print(b + " is a Minimum");
else if (c < a && c < b) System.out.print(c + " is a Minimum");
}
}
/* OUTPUT:
Enter the A value:
3
Enter the B value:
4
Enter the C value:
5
3 is a Minimum
*/
