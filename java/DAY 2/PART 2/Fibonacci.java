/*3. Write a program which generates 30 terms of Fibonacci no in an array and then prints it.*/
import java.util.Scanner;
import java.util.Arrays;
public class Fibonacci{
    public static void main(String[] args){
        Scanner value=new Scanner(System.in);
        System.out.println("Enter the array length:");
        int n=value.nextInt();
        int[] arr=new int[n];
        arr[0]=0;
        arr[1]=1;
        int first=0;
        int second=1;
        int answer=0;
        for(int j=2;j<=n-1;j++){
           
           answer=first+second;
           first=second;
           second=answer;
            arr[j]=answer;
        }
        System.out.println(Arrays.toString(arr));
        System.out.println("Final value:"+answer);
        value.close();
    }
}
/* OUTPUT:
Enter the array length:
30
[0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597, 2584, 4181, 6765, 10946, 17711, 28657, 46368, 75025, 121393, 196418, 317811, 514229]
Final value:514229
*/