/*1. Illustrates with an example of using Singleton class. */
public class Qon1{
    public static void main(String[] args) {
       Singleton ob1=Singleton.getInstance("vishwa");
       Singleton ob2=Singleton.getInstance("tamil"); 
       if (ob1==ob2) {
          
           System.out.println("same memory location.");
       }
       else{
        System.out.println("Not Same.");
       }
      System.out.println( ob1.a);
      System.out.println( ob2.a);
       
    }
}
class Singleton{
    private static Singleton instance=null;
    
  public String a;

    private Singleton(String a){
        this.a=a;
    } 

    public static synchronized Singleton getInstance(String a){
        if(instance==null){
            instance=new Singleton(a);
        }
        return instance;
    }

}
/*OUTPUT:
same memory location.
vishwa
vishwa
*/
