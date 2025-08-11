/*2. Design a Payment Gateway System using an interface named PaymentMethod with a method pay(double amount).
Implement this interface in different classes like CreditCardPayment, DebitCardPayment, and UPIPayment. Write a
main class where you can accept payment using different methods.*/
public class Qon2{
    public static void main(String[] args) {
        CreditCardPayment ob1=new CreditCardPayment();
        ob1.pay(10000);
        DebitCardPayment ob2=new DebitCardPayment();
        ob2.pay(2000);
        UPIPayment ob3=new UPIPayment();
        ob3.pay(2);
        
    }
}
interface PaymentMethod{
    public void pay(double amount);
}
class CreditCardPayment implements PaymentMethod{

    int cardno=22;
    int pin=123456;
    int balance=500;
    public void pay(double amount){
        System.out.println("Credit Card Number :"+cardno);
        System.out.println("Credit Card Pin    :"+pin);
        System.out.println("Credit Card Balance:"+balance);
        System.out.println("Sending Amount     :"+amount);
        System.out.println("-----------------------------");
  }
}
class DebitCardPayment implements PaymentMethod{
    int cardno=12;
    int pin=12456;
    int balance=50000;

    public void pay(double amount){
        System.out.println("Debit Card Number :"+cardno);
        System.out.println("Debit Card Pin    :"+pin);
        System.out.println("Debit Card Balance:"+balance);
        System.out.println("Sending Amount    :"+amount);
        System.out.println("-----------------------------");
  }
}
class UPIPayment implements PaymentMethod{
   String name="vishwa";
   String Idname="@@";
    int pin=4444;
    int balance=10000;

    public void pay(double amount){
        System.out.println("UserName          :"+name);
        System.out.println("Debit Card Pin    :"+pin);
        System.out.println("Debit Card Balance:"+balance);
        System.out.println("Sending Amount    :"+amount);
        System.out.println("-----------------------------");
  }
}
/*OUTPUT:
Credit Card Number :22
Credit Card Pin    :123456
Credit Card Balance:500
Sending Amount     :10000.0
-----------------------------
Debit Card Number :12
Debit Card Pin    :12456
Debit Card Balance:50000
Sending Amount    :2000.0
-----------------------------
UserName          :vishwa
Debit Card Pin    :4444
Debit Card Balance:10000
Sending Amount    :2.0
-----------------------------
*/