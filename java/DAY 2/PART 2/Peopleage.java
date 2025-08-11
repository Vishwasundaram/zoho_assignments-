/*8.Write a program which takes in 10 people’s age and gives number of people who are <18, 18-60, >60.*/
import java.util.Scanner;
import java.util.Arrays;
public class Peopleage{
    public static void main(String[] args){
        Peopleage obj=new Peopleage();
        obj.age();
    }
    public void age(){
        Scanner scan=new Scanner(System.in);
        int[] arr=new int[10];
        System.out.println("Enter the age.");
        int count1=0;
        int count2=0;
        for(int i=0;i<arr.length;i++){
            arr[i]=scan.nextInt();
            if(0<=arr[i]&&arr[i]<=18) count1++;
            if(19<=arr[i]&&arr[i]<=60) count2++;
        }
        System.out.println("People ages:"+Arrays.toString(arr));
        System.out.println("Under 18 age of people:"+count1);
        System.out.println("Under 60 age of people:"+count2);
    }
}
/* OUTPUT:
Enter the age.
2
12
23
44
18
60
61
23
2
19
People ages:[2, 12, 23, 44, 18, 60, 61, 23, 2, 19]
Under 18 age of people:4
Under 60 age of people:5
*/