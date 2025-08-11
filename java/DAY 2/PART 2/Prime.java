/*2. Write a program to take in 10 values and print only those numbers which are prime. */
import  static java.lang.Math.sqrt;
import java.util.Scanner;
import java.util.Arrays;
public class Prime{
    public static void main(String[] args){
        Scanner value=new Scanner(System.in);
        System.out.println("Enter the array Size:");
        int n=value.nextInt();
        int[] arr=new int[n];
        System.out.println("Insert the array values.");
        for(int k=0;k<=arr.length-1;k++){
            int set=value.nextInt();
            arr[k]=set;
        }
        System.out.println(Arrays.toString(arr));
        for (int j=0;j<=arr.length-1;j++){
         if(prime(arr[j])){
            System.out.println(arr[j]);
         }  
        }
    }
    public static boolean prime(int n){
        if(n<=1) return false;
            int check=(int)sqrt(n);
        for(int i=2;i<=check;i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
}
/*  OUTPUT:
Enter the array Size:
10
Insert the array values.
1
2
3
4
5
6
7
-1
9
0
[1, 2, 3, 4, 5, 6, 7, -1, 9, 0]
2
3
5
7
*/