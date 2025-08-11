/*2. Can we override private method, constructor, static method, final method? Illustrate with an example.*/
class Check{
    private void same(){
        System.out.println("Private Method1.");
    }

    public Check() {
        System.out.println("Constructor1.");
    }

     static void same1(){
        System.out.println("Static1.");
    }
    final void same2(){
        System.out.println("Final1.");
    }
    
}
class Check1 extends Check{
      private void same(){
        System.out.println("Private Method2.");
    }

    public Check() {
        System.out.println("Constructor2.");
    }

     static void same1(){
        System.out.println("Static2.");
    }
    final void same2(){
        System.out.println("Final2.");
    }
    

}
public class On2{
    public static void main(String[] args) {
        Check1 obj1=new Check1();             //can not override the constractor.
        
        obj1.same();                         //can not override the private method.
        

        Check1.same1();                     //can not override the Static method.
       

        obj1.same2();                       //can not override the final method.
       
    }
}

/*Output:
 On2.java:24: error: invalid method declaration; return type required
    public Check() {
           ^
1 error

*/
