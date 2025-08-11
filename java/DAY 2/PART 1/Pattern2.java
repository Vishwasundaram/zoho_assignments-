import java.util.Scanner;
public class Pattern2{
    public static void main(String[] args) {
        Scanner value=new Scanner(System.in);
        int n=value.nextInt();
        int count=n/2+1;
        for (int i=1;i<=n;i++){
            for(int j=1;j<=n-1;j++){
               if ( ( (i==1||j==1)||(i==n/2+1) ) || ( (j==n-1)&&(i<=n/2+1) )  )    {
                System.out.print("R ");
               }
               else if(j==count&&i>n/2+1)
               {
                System.out.print("R ");
               }
               else{
                System.out.print("  ");
               }
            }
            if (i>n/2+1) {
                count++;
            }

            System.out.println();
        }
    }
}
/* OUTPUT:
10
R R R R R R R R R 
R               R 
R               R 
R               R 
R               R 
R R R R R R R R R 
R         R       
R           R     
R             R   
R               R 
*/