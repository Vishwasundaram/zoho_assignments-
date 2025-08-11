
import java.util.Scanner;
/*6. Write a Java program to accept a 4-digit ATM PIN from the user and validate whether it meets the following conditions:
--->It must be exactly 4 digits long.
--->It should contain only numeric characters.
--->It must not start with 0.
Display an appropriate message whether the PIN is valid or invalid.*/
public class Qon6{
    public static void main(String[] args) {
       Pin ob=new Pin();
       ob.process();
        
    }
}
class Just extends Exception{
    public Just(String message){
        super(message);
    } 
}
class Pin{
    Scanner scan=new Scanner(System.in);
    public void process(){
        System.out.println("Enter the Pin:");
        String a=scan.nextLine();
        try {
            if(4!=a.length() || !a.matches("\\d+")|| a.charAt(0)=='0'){
                throw new Just("Invalid PIN");
            }
            else {
               throw new Just("Valid PIN");
            }
        } 
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
        scan.close();
    
    }
    
}
/*OUTPUT:
Enter the Pin:
123d 
Invalid PIN
 */
