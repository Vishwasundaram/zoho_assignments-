import java.util.Scanner;
public class Pattern3{
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        int i=1;
        int count=1;
        System.out.println("Enter the length:");
        int n=scan.nextInt();
        int half=n/2+1;
        int half1=2;
        while (i<=n) {

            int k=1;
            while (half>=k) { 
                if (k<=half) {
                    System.out.print(" ");
                k++;
                }
            }
            if(i>=n/2+1) half++;
            else {
                half--;
            }
//-------------------------------------------
             int j=1;
            while (half1>j) { 
                if (j<half1) {
                    System.out.print(count+" ");
                    count++;
                    j++;
                }
            }
            if(i<n/2+1){
                   half1++; 
            }
            else{
                half1--;
            }
            System.out.println();
            i++;
        }

    }
}
/*OUTPUT:
Enter the length:
7
    1 
   2 3 
  4 5 6 
 7 8 9 10 
  11 12 13 
   14 15 
    16 
*/ 