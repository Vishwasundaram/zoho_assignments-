import java.util.Scanner;
public class Firstsetbit {
    static int bitCheck(int n) {
        if (n == 0) return 0;
        int count = 0;
        while (n > 0) {
            count++;
            if ((n & 1) == 1) return count;
            n = n / 2;
        }
        return 0;
    }
    public static void main(String[] args){
        Scanner value=new Scanner(System.in);
        System.out.println("Enter the value:");
        int n=value.nextInt();

        System.out.println(bitCheck(n));
    }
}
/*    OUTPUT:
        Enter the value:
        2
        2
 */