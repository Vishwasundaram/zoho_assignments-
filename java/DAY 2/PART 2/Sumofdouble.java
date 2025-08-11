/*4. Design a function void print( ) with a single dimensional array x[ ] and n (as size of the array) as function arguments. 
The function calculates sum of only single digit and sum of only double digit elements from the array. 
Design a main() function to input size of the array ‘len' and single dimensional array of size 'len', and 
print the required result by invoking the function print( ).*/
import java.util.Arrays;
import java.util.Scanner;
public class Sumofdouble{
    public static void main(String[] args)
    {
     Sumofdouble.print();  
    }
     static void print(){
      Scanner value= new Scanner(System.in);
      System.out.println("Declare the array of size:");
      int n=value.nextInt();
      int[] x=new int[n];
      System.out.println("Enter the arrrays values.");
      for(int i=0;i<=x.length-1;i++){
        x[i]=value.nextInt();
      }
      System.out.println(Arrays.toString(x));
      int oneDigit=0;
      int twoDigit=0;
      int j=0;
      while(j<x.length){
        if(x[j]>=-9&&x[j]<=9){
            oneDigit+=x[j];
        }
        if ((x[j]>=-10&&x[j]<=-99)||(x[j]>=10&&x[j]<=99)){
            twoDigit+=x[j];
        }
        j++;
      }
      System.out.println("Sum of one digit:"+oneDigit);
      System.out.println("Sum of two digit:"+twoDigit);
     }
}
/* OuTPUT:
Declare the array of size:
5
Enter the arrrays values.
12
1
23
4
18
[12, 1, 23, 4, 18]
Sum of one digit:5
Sum of two digit:53
*/