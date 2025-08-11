/*‌
3. Write a program to illustrate how to throw a ClassNotFoundException.
*/
public class Qon3{
    public static void main(String[] args) {
        try {
               Class.forName("Sampl"); 
        } 
        catch (Exception e) {
            System.out.println("Class Not Found Exception.");
        }
        System.out.print("hello");
    }
}
class Sample{
    
}
/*OUTPUT:
Class Not Found Exception.
*/
