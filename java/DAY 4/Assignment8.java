import java.util.Scanner;
public class Assignment8{
    public static void main(String[]args){
        Scanner scan=new Scanner(System.in);
        ScientificCalculator obj=new ScientificCalculator();
    
        System.out.println("ADDITION.");
        System.out.println("Enter the A value:");
        int a=scan.nextInt();
        System.out.println("Enter the B value:");
        int b=scan.nextInt();
        obj.add(a, b);
        System.out.println("------------------------");
        //--------------------------
        System.out.println("SUBTRACTION.");
        System.out.println("Enter the A value:");
        int a1=scan.nextInt();
        System.out.println("Enter the B value:");
        int b1=scan.nextInt();
        obj.subtract(a1, b1);
        System.out.println("------------------------");
        //--------------------------
        System.out.println("MULTIPLE.");
        System.out.println("Enter the A value:");
        int a2=scan.nextInt();
        System.out.println("Enter the B value:");
        int b2=scan.nextInt();
        obj.multiple(a2, b2);
        System.out.println("------------------------");
        //--------------------------
        System.out.println("DIVITION.");
        System.out.println("Enter the A value:");
        int a3=scan.nextInt();
        System.out.println("Enter the B value:");
        int b3=scan.nextInt();
        obj.divide(a3, b3);
        System.out.println("------------------------");
        //-------------------------------------------------------------------
        System.out.println("POWER.");
        System.out.println("Enter the BASE value:");
        int base=scan.nextInt();
        System.out.println("Enter the EXPONENT value:");
        int exponent=scan.nextInt();
        obj.power(base, exponent);
        System.out.println("------------------------");
        //--------------------------
        System.out.println("MODULS.");
        System.out.println("Enter the A value:");
        int a4=scan.nextInt();
        System.out.println("Enter the B value:");
        int b4=scan.nextInt();
        obj.modulas(a4, b4);
        System.out.println("------------------------");
        //---------------------------
        System.out.println("SQUARE ROOT.");
        System.out.println("Enter the value:");
        double number1=scan.nextDouble();
        obj.squareRoot(number1);
        System.out.println("------------------------");
        //----------------------------
        System.out.println("SIN.");
        System.out.println("Enter the Degree for sin:");
        double number2=scan.nextDouble();
        obj.sin(number2);
        System.out.println("------------------------");
        //-----------------------------
        System.out.println("COS.");
        System.out.println("Enter the Degree for cos:");
        double number3=scan.nextDouble();
        obj.cos(number3);
        System.out.println("------------------------");
        //-----------------------------
        System.out.println("LOG.");
        System.out.println("Enter the Log value:");
        double number4=scan.nextDouble();
        obj.log(number4);
        System.out.println("------------------------");
        //-------------------------------
        System.out.println("EXPONENTIAL .");
        System.out.println("Enter the exponential for value:");
        double number5=scan.nextDouble();
        obj.exp(number5);
        System.out.println("------------------------");
        //-----------------------------

    }
}
class BasicCalculator{
  //ADDITION.
  public void add(int a,int b){
    System.out.println("ADDITION value is :"+(a+=b));
  }
  //SUBTRACT.
   public void subtract(int a,int b){
    System.out.println("SUBTRACT value is :"+(a-=b));
  }
  //MULTIPLE.
   public void multiple(int a,int b){
    System.out.println("MULTIPLE value is :"+(a*=b));
  }
  //DIVIDE.
   public void divide(int a,int b){
    if(b!=0){
    System.out.println("DIVIDE value is :"+(a/=b));
    }
    else{
    System.out.println("Not divided from 0");
    }

}
class AdvancedCalculator extends BasicCalculator{
  
  //POWER.
  public void power(int base,int exponent){
    System.out.println("Power value:"+Math.pow(base, exponent));
  }
  //MODULUS.
   public void modulas(int a,int b){
    System.out.println("Modulus value:"+(a%=b));
  }
  //SQUAREROOT.
   public void squareRoot(double number){
    System.out.println("SQUARE ROOT value:"+(Math.sqrt(number)));
  }
}
class ScientificCalculator extends AdvancedCalculator{
    //SIN
    public void sin(double angle){
        System.out.println("SIN value:"+(Math.sin(angle)));
    }
    //COS
    public void cos(double angle){
        System.out.println("COS value:"+(Math.cos(angle)));
    }
    //LOG
    public void log(double value){
    if(value > 0){
        System.out.println("LOG value:" + Math.log10(value)); // for base 10 log
    } else {
        System.out.println("Invalid input for LOG. Value must be > 0.");
    }
    }
    //EXP
    public void exp(double value){
        System.out.println("EXPONENTIAL value:"+Math.exp(value));
     }
    }
}
