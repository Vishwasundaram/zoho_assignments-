class Find {

}
public class Instance {
public static void main(String[] args){
  Find a=new Find();
  Instance b=new Instance();
  System.out.println(a instanceof Find);      //true.
  System.out.println(b instanceof Instance);  //true.
}
}
/* OUTPUT:
      true
      true
 */