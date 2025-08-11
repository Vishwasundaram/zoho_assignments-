package common;
public class Cc{
    public void concat(String n,String k){
        System.out.println(n+" "+k);
    }
    public void reverse(String n){
    String value=new StringBuilder(n).reverse().toString();
    System.out.println(value);
    }
    public void length(String n) {
    int a = n.length();
    System.out.println(a);
}

}