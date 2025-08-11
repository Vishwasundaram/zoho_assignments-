import java.util.Scanner;
public class Compare {
        public static void main(String[] args) {
            Scanner value = new Scanner(System.in);
            System.out.println("Enter the A value");
            int a = value.nextInt();
            System.out.println("Enter the B value");
            int b = value.nextInt();
            System.out.println("A value" + a);
            System.out.println("B value" + b);
            int result=a-b;
           switch (result){
               case (0):
                   System.out.println("Equals.");
               default:
                   System.out.println("Not Equals.");
           }
            value.close();
        }
}
/*  OUTPUT:
Enter the A value
6
Enter the B value
7
A value6
B value7
Not Equals.
 */