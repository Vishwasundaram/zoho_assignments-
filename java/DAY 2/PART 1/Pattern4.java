import java.util.Scanner;
public class Pattern4{
    public static void main(String[] args) {
        Scanner value=new Scanner(System.in);
        int n=value.nextInt();
        int i=1;
        int count=1;
        while(i<=n){
            int j=1;
            while (j<=count) {
             System.out.print("W ");
             j++;
            }
            System.out.println();
            if(i<n/2+1){
                count++;
            }
            else count--;
             i++;
        }
    }
}
/*OUTPUT:
5
W 
W W 
W W W 
W W 
W 
*/