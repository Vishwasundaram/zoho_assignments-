/*6. 6. Write a program to accept the year of graduation from school as an integer value from the users . Using the Binary search technique on the sorted array of integers given below . 
Output the message “record exists" if the value input is located in the array and if not output the message record does not exits”.
{1982, 1987, 1993, 1996, 1999, 2003, 2006, 2007, 2009, 2010, 2016, 2002}*/
import java.util.Arrays;
import java.util.Scanner;
public class Graduation{
    public static void main(String[] args) {
     int result= binary();
     System.out.println((result==1)?"Record Not Exists.":"Record Exists."); 
    }
    static int binary(){
        Scanner value=new Scanner(System.in);
        int[] values={1982, 1987, 1993, 1996, 1999, 2003, 2006, 2007, 2009, 2010, 2016, 2002};
        System.out.println("Enter the year of graduation from school");
        int n=value.nextInt();
        System.out.println((n>=1000&&2999>=n)?"Valid year.":"Please enter the valid year.");
        int first=0;
        int last=values.length-1;
        int mid=0;
        Arrays.sort(values);
        while(first<=last){
            mid=(first+last)/2;
            if(values[mid]==n) {
               return 0;
            } 
            else if(n<values[mid]){
                last=mid-1;
                first=first;
            }
            else{
                first=mid+1;
                last=last;
            } 
        }
        return 1;
    }
}
/* OUTPUT:
Enter the year of graduation from school
2010
Valid year.
Record Exists.
*/