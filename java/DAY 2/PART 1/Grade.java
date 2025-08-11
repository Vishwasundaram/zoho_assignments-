/*7. Use both if and switch case statement  as two ways to find the grade of a student.
Percent>=85 && Percent<=100 Grade ‘A’
Percent>=70 Grade ‘B’
Percent>=50 Grade ‘C’
otherwise print ”Fail”*/
import java.util.Scanner;
public class Grade {
static void anothertype(int mark){
switch(mark/10){
case 10:
case 9:
System.out.println('a');
break;
case 8:
if(mark<=84&&mark>=80) {
System.out.println('b');
break;
}
System.out.println('a');
break;
case 7:
System.out.println('b');
break;
case 6:
System.out.println('c');
break;
case 5:
System.out.println('c');
break;
case 4:
case 3:
case 2:
case 1:
case 0:
System.out.println("fail");
break;
default:
System.out.println(mark+" This is not valid Percentage.");
}
}
public static void main(String[] args){
Scanner value=new Scanner(System.in);
int percent=value.nextInt();
System.out.println("Enter your Mark:"+percent);
if(percent>=101) System.out.println("only percentage calculate to (1 to 100) ");
else if (percent>=85 && percent<=100) System.out.println('A');
else if (percent>=70 && percent<=84) System.out.println('B');
else if (percent>=50 && percent<=69) System.out.println('C');
else System.out.println("Fail");
Grade.anothertype(percent);
}
}
/* OUTPUT:
case 1:
Enter your Mark
100
a
case 2:
Enter your Mark
999
only percentage calculate to (1 to 100)
999 This is not valid Percentage.
*/
