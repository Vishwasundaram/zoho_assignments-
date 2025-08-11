import java.util.Scanner;
public class Ternaryoperators {
    public static void main(String[] args){
        Scanner value=new Scanner(System.in);
        System.out.println("Enter the A value");
        int a=value.nextInt();
        System.out.println("Enter the B value");
        int b=value.nextInt();
        System.out.println("A value:"+a);
        System.out.println("B value:"+b);
        System.out.println((a==b)?"value are same":((a<b)?"Big value is B":"Big value is A"));
        value.close();
    }
}
/*  OUTPUT
        Enter the A value
        3
        Enter the B value
        4
        A value3
        B value4
        Big value is B
 */
