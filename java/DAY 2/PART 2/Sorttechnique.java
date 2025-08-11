/*7. Write a program to input and store the weight of ten people.
Sort and display them in descending order using the Selection sort technique.*/
import java.util.Arrays;
import java.util.Scanner;
public class Sorttechnique{
    public static void main(String[] arg){
        Sorttechnique obj=new Sorttechnique();
        obj.process();
    }

    public void process(){
        Scanner scan=new Scanner(System.in);
        int[] arr=new int[10];
        System.out.println("Enter the people weight.");
        for(int k=0;k<arr.length;k++){
            arr[k]=scan.nextInt();
        }
        scan.close();
        System.out.println("Before weight:"+Arrays.toString(arr));
        for(int i=0;i<arr.length-1;i++){
            int max=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]>arr[max]){
                    max=j;
                }
            }
            //Swap
            int temp=arr[i];
            arr[i]=arr[max];
            arr[max]=temp;
        }
        System.out.println("After Desending weight:"+Arrays.toString(arr));
    }
}
/* OUTPUT:
Enter the people weight.
12
23
34
45
43
66
77
77
45
34
Before weight:[12, 23, 34, 45, 43, 66, 77, 77, 45, 34]
After Desending weight:[77, 77, 66, 45, 45, 43, 34, 34, 23, 12]
*/