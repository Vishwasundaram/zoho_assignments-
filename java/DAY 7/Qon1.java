public class Qon1{
    public static void main(String[] args) {
        
        Customer ob1=new Customer("vishwa",20,851695,"Surandai");
       
        Account ob2=new Account(12300,2004, "Vishwa", 500);

        RBI ob3=new SBI(ob1,ob2);
        
        ob3.printcommon();
        System.out.println("Minimum Balance      :"+ob3.minBalance());
        System.out.println("Maximum Withdraw     :"+ob3.maxWithdraw());
        System.out.println("Minimum Interest     :"+ob3.minInterest());
         //------------------------------------------------------
        System.out.println();
        Customer ob4=new Customer("Raja",23,851000,"Surandai");
       
        Account ob5=new Account(1230000,2007, "Raja", 8000);

        RBI ob6=new IOB(ob4,ob5);
        
        ob6.printcommon();
       System.out.println("Minimum Balance    :"+ob6.minBalance());
        System.out.println("Maximum Withdraw   :"+ob6.maxWithdraw());
        System.out.println("Minimum Interest   :"+ob6.minInterest());


    }
}

abstract class RBI{
    Customer customer;
    Account account;

    RBI(Customer customer,Account account) {
    this.customer=customer;
    this.account=account;
    }

    public void printcommon(){
        customer.print();
        System.out.println();
        account.print(); 
    }
    
    public abstract int minBalance();
    public abstract long maxWithdraw();
    public abstract float minInterest();

    
}
class SBI extends RBI{

    SBI(Customer customer,Account account) {
        super(customer, account);
    }



public int minBalance(){
    return 300;
}
public long maxWithdraw(){
    return 100000;
}
public float minInterest(){
    return 5.2f;
}

}

class IOB extends RBI{

    IOB(Customer customer,Account account) {
        super(customer, account);
    }



public int minBalance(){
    return 0;
}
public long maxWithdraw(){
    return 200000;
}
public float minInterest(){
    return 4.5f;
}

}

class Customer{
    String name,address;
    int age,phone;
      Customer(String name,int age,int phone,String address){
        this.name=name;
        this.age=age;
        this.phone=phone;
        this.address=address;
     }
     public void print(){
        System.out.println("Name:"+name+"\n"+"Age:"+age+"\n"+"Phone Number:"+phone+"\n"+"Address:"+address);
     }


}
class Account{
    int accno,ifsc;
    String name;
    double balance;
    Account(int accno,int ifsc,String name,double balance){
        this.accno=accno;
        this.ifsc=ifsc;
        this.name=name;
        this.balance=balance;
    }
    public void print(){
        System.out.println("Account Holder Name:"+name);
        System.out.println("Account Number     :"+accno);
        System.out.println("IFSC No            :"+ifsc);
        System.out.println("Balance            :"+balance);
    }

}

/*Name:vishwa
Age:20
Phone Number:851695
Address:Surandai

Account Holder Name:Vishwa
Account Number     :12300
IFSC No            :2004
Balance            :500.0
Minimum Balance      :300
Maximum Withdraw     :100000
Minimum Interest     :5.2

Name:Raja
Age:23
Phone Number:851000
Address:Surandai

Account Holder Name:Raja
Account Number     :1230000
IFSC No            :2007
Balance            :8000.0
Minimum Balance    :0
Maximum Withdraw   :200000
Minimum Interest   :4.5
*/