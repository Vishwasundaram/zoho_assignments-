
import java.util.Scanner;

/*5. Design a class named``BankAccount that uses the concept of encapsulation. 
The class should have the following private data members: account number, account holder name, and balance.
 Provide public getter and setter methods to access and modify these fields. 
Also, include a method to deposit and withdraw amount ensuring that the balance cannot go negative. */
public class Qno5{
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        BankAccount ob=new BankAccount();

        System.out.println("Enter the AccountNo:");
        int account=scan.nextInt();scan.nextLine();
        System.out.println("Enter the Account Holder Name:");
        String name=scan.nextLine();
        System.out.println("enter the Deposit Amount:");
        int deposit=scan.nextInt();
        if(deposit<0) System.out.println("Please enter the positive amount.");

       

        ob.setNo(account);
        ob.setName(name);
        ob.setbalance(500);
        ob.setdeposit(deposit);

        System.out.println("------------------------------------------");
        System.out.println("Account NO:"+(ob.getNo()));
        System.out.println("Holder Name:"+(ob.getName()));
        System.out.println("Balance:"+(ob.getbalance()));
        System.out.println("Deposite Amount:"+(ob.getdeposit()));
        ob.deposit();
        System.out.println("------------------------------------------");

        System.out.println("Enter the Withdraw Amount:");
        int withdraw=scan.nextInt();
        ob.setwithdraw(withdraw);
        System.out.println("Withdraw Amount:"+(ob.getwithdraw()));
        ob.withdraw();


        scan.close();

    }
}
class BankAccount{
    private int account;
    private String name;
    private double balance;
    private int deposit;
    private int withdraw;
    static double balance1;

    public void setNo(int account){
        this.account=account;
    }
    public void setName(String name){
        this.name=name;
    }
    public void setbalance(double balance){
        this.balance=balance;
    }
    public void setdeposit(int deposit){
        this.deposit=deposit;
    }
    public void setwithdraw(int withdraw){
        this.withdraw=withdraw;
    }
    //-------------------------------------------------------
    
    public int  getNo(){
        return account;
    }
    public String getName(){
        return name;
    }
    public double getbalance(){
        return balance;
    }
    public int getdeposit(){
        return deposit;
    }
    public int getwithdraw(){
        return withdraw;
    } 
  //---------------------------------------
  public void withdraw(){
    if (withdraw>balance) {
        System.out.println("Your account balance are negative.So cash did not withdraw.Your account balance is:"+balance1);
    }
    else{
    System.out.println("After withdraw balance:"+(balance1=balance1-withdraw));
    }
  }
  public void deposit(){
    System.out.println("After withdraw balance:"+(balance1=balance+deposit));
  }

}
/*OUTPUT:
Enter the AccountNo:
1
Enter the Account Holder Name:
Vishwa
enter the Deposit Amount:
400
------------------------------------------
Account NO:1
Holder Name:Vishwa
Balance:500.0
Deposite Amount:400
After withdraw balance:900.0
------------------------------------------
Enter the Withdraw Amount:
1000
Withdraw Amount:1000
Your account balance are negative.So cash did not withdraw.Your account balance is:900.0
*/
