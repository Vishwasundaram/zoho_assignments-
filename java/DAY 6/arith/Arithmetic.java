package arith;
public class Arithmetic{
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
}
