
import java.util.Scanner;

public class Pattern6{
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int i=0;
        String value="ZOHOCORPORATIONS";
        int len = value.length();
        do { 
                
            String res = value.substring(i,i+4);
            i+=4;
            System.out.println(res);
         
        } while (i<len);
    }
}
/*OUTPUT:
ZOHO
CORP
ORAT
IONS
*/
