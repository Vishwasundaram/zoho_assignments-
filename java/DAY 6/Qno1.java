/*1. Illustrate the concept-Encapsulation with the Payment Gateway System.[The class should encapsulate private data members 
such as transaction ID, payer name, payee name, amount, payment method, and transaction status. Provide appropriate public getter 
and setter methods to access and modify these details securely.Also include a method to display the transaction summary.] */
class Payment{
    private int id;
    private String payername;
    private String payeename;
    private int  amount;
    private String paymethod;
    private String status;
    //setter.
    public void setId(int id1){
        id=id1;
    }
     public void setname(String name){
        payername=name;
    }
     public void setpayee(String payee){
        payeename=payee;
    }
     public void setcash(int cash){
       amount=cash;
    }
     public void setmethod(String method){
         paymethod=method;
    }
     public void setstate(String state){
        status=state;
    }
    //getter.
    public int  getId(){
        return id;
    }
     public String getname(){
        return payername;
    }
     public String getpayee(){
        return payeename;
    }
     public int getcash(){
       return amount;
    }
     public String getmethod(){
        return paymethod;
    }
     public String getstate(){
        return status;
    }
}
public class Qno1{
    public static void main(String[] args) {
        Payment obj=new Payment();
        
        obj.setId(001);
        obj.setname("Vishwa");
        obj.setpayee("Raja");
        obj.setcash(10000);
        obj.setmethod("GPay");
        obj.setstate("Successfull");

        System.out.println("Payment Method.");
        System.out.println("-------------------");
       System.out.println("Transaction ID:"+obj.getId());
       System.out.println("Payer name:"+obj.getname());
       System.out.println("Payee name:"+obj.getpayee());
       System.out.println("Transaction:"+obj.getcash());
       System.out.println("Payment Method:"+obj.getmethod());
       System.out.println("Payment Status:"+obj.getstate());
        
    }
}
/*OUTPUT:
Payment Method.
-------------------
Transaction ID:1
Payer name:Vishwa
Payee name:Raja
Transaction:10000
Payment Method:GPay
Payment Status:Successfull
*/