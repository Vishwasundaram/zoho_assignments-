/*‌
4. Write a method to parse a string to an integer. 
Throw an exception if the string is not a valid number. Handle it using try-catch.*/
public class Qon4{
    public static void main(String[] args) {
        Qon4 ob=new Qon4();
        ob.sample("sd123");
    }

    public void sample(String value){
        try{
        int a=Integer.parseInt(value);
        }
        catch(NumberFormatException e){
            System.out.println("Number Format Exception: "+e);
        }
    }
}
/*OUTPUT:
Number Format Exception: java.lang.NumberFormatException: For input string: "sd123"
*/
