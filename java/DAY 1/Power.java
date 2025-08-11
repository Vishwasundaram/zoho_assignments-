import java.util.Scanner;
public class Power {
    boolean two(int n) {
        for(int i=0;i<=n/2;i++){
            double a=Math.pow(2,i);
            if(a==n){
                return true;

            }
            if(a>n){
                return false;
            }

        }
        return false;

    }
    public static void main (String[] args) {
        Scanner value = new Scanner(System.in);
        System.out.println("Enter the n value:");
        int n = value.nextInt();
        Power call=new Power();
        System.out.println(call.two(n));
    }
}
/*  OUTPUT:
    Enter the n value:
    5
    false
 */
