/*7. Write a Java program that shows exception propagation across multiple methods (method1 calls method2 calls method3, which throws the exception). Handle the exception in method1. */
public class Qon7{
    public static void main(String[] args) {
        Qon7 ob=new Qon7();
        ob.method1();

    }
    public void method1(){
        try {
            method2();
        }
         catch (ArithmeticException e) {
        System.out.println("Exception.");
        System.out.println(e);
        }
    }
    public void method2(){
        method3();
    }
    public void method3(){
        int a=10;
        int b=0;
        int c=a/b;
    }
    
}
/*OUTPUT:
Exception.
java.lang.ArithmeticException: / by zero
*/