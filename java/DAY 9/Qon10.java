
import java.util.Scanner;



/* 10. Write a Java program to manage a voting system where a person must be at least 18 years old to be eligible to vote. 
Use a custom exception to handle the scenario when an ineligible person tries to register for voting. Display appropriate messages for eligible and ineligible voters.
*/
public class Qon10{
    public static void main(String[] args) {
        Code ob=new Code();
        ob.process();
    }
}
class Just extends Exception{

    public Just(String message) {
    super(message);
    }
}
class Code{
    public void process(){
    Scanner scan=new Scanner(System.in);

        System.out.println("Enter the Age:");
        int a=scan.nextInt();
        try {
            if(a<18) throw new Just("Not Eligible.");
            else throw new Just("Eligible");
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        
    }
}
/*OUTPUT:
Enter the Age:
18
Eligible.
 */