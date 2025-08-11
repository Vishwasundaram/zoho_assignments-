/*1. Write a program that creates an integer array of 10 elements, 
accepts values of arrays and Find the sum of all odd numbers.*/
import java.util.Scanner;
public class Addodd {
    public static void main(String[] args){
        Scanner value=new Scanner(System.in);
        int[] odd=new int[10];
        System.out.println("Enter the arrays values:");
        int count=0;
        for(int i=0;i<=odd.length-1;i++){
            int get=value.nextInt();
            odd[i]=get;
            if(odd[i]%2==1){
                count+=odd[i];
            }
        }
        System.out.println("Sum of odd number value:"+count);
    }
}
/* OUTPUT:
Enter the arrays values:
1
2
3
4
5
6
6
7
8
9
Sum of odd number value:25
 */