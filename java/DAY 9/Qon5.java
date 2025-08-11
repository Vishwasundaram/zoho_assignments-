/*‌
5. Create a program where try block contains a return statement.
 Ensure that finally block executes before the method returns. Show this with output.
 */
public class Qon5{
 public static void main(String[] args) {
    Qon5 ob=new Qon5();
    System.out.println(ob.sample(10));
     
 }
 public int sample(int a){
    int b=1;
    try{
         return b+a;
     }
     catch (Exception e) {
        System.out.println("Arithmetic Exception.");
     }
     finally{
       System.out.println("code always run:"+a);
     }
     return a;
 }
}
/*OUTPUT:
code always run:10
11
*/