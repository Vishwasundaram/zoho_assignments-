
import java.util.Scanner;

/*8. Design a login system that throws AuthenticationException if the username or password is incorrect. Handle it and display a login failure message.*/
public class Qon8{
    public static void main(String[] args) {
        Process ob=new Process();
        ob.process();
    }
}
class Just extends Exception{
   
    public Just(String message) {
        super(message);
    }
  
}
class Process{
     Scanner scan=new Scanner(System.in);
      public void process(){
        System.out.println("SignUP Page.");
        System.out.println("-------------------");
        System.out.println("Enter your name    :");
        String name=scan.nextLine();
        System.out.println("Enter Your Password:");
        String pass=scan.nextLine();
        try {
            System.out.println("Login Page");
            System.out.println("-------------------");
            System.out.println("User Name :");
            String name1=scan.nextLine();
            System.out.println("Password  :");
            String pass1=scan.nextLine();
             if(name.equals(name1)&&pass.equals(pass1)) throw new Just("Successfully Login.");
             else throw new Just("Login Failure");  
        } 
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
        scan.close();
    }    
}
/* OUTPUT:
SignUP Page.
-------------------
Enter your name    :
vishwa
Enter Your Password:
vishwa
Login Page
-------------------
User Name :
vis
Password  :
vishwa
Login Failure
*/