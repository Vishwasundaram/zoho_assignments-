/*5. Define a method to find the sum of even numbers from the series 1, 2, 3, 4, 5, ...n using continue statement.*/
import java.util.Scanner;
public class Evennum {
static void find(int n){
for(int i=1;i<=n;i++){
if(i%2==1){
continue;
}
else {
System.out.println(i);
}
}
}
public static void main(String[] args){
Scanner value=new Scanner(System.in);
System.out.println("Enter the Range of Number:");
int n=value.nextInt();
System.out.println("Number of Range is:"+n);
Evennum.find(n);
value.close();
}
}
/* OUTPUT:
Enter the Range of Even Numbers:
7
Number of Range is:7
2
4
6
*/
