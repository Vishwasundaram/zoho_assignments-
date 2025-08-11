
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;



/*9. Create a method to read a file from disk. Handle FileNotFoundException and IOException using try-catch-finally.*/
public class Qon9{
    public static void main(String[] args) {

    System.out.println("File Not Found Exception.");
        try {
            FileReader v=new FileReader("vip.txt");
            BufferedReader d=new BufferedReader(v);
        }
        catch (FileNotFoundException e) {
            System.out.println("File Not found.");
            System.out.println(e);
        }
        finally{
            System.out.println("----------------------------");
        }

        Qon9 ob=new Qon9();
        ob.process();

    }

    public void process(){
    System.out.println("IO Exception.");
     try {
            FileReader v=new FileReader("vip.txt");
            BufferedReader d=new BufferedReader(v);
            d.close();
        }
        catch (IOException e) {
            System.out.println("IOException.");
            System.out.println(e);
        }
        finally{
            System.out.println("----------------------------");
        }

    }
}
/*OUTPUT:
File Not Found Exception.
File Not found.
java.io.FileNotFoundException: vip.txt (No such file or directory)
----------------------------
IO Exception.
IOException.
java.io.FileNotFoundException: vip.txt (No such file or directory)
----------------------------
*/