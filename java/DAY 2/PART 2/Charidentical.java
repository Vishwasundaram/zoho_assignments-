/*5. Write a program to initialize the following character arrays and print a suitable message after checking the arrays whether the two arrays are identical or not. Make suitable use of Boolean data type. X[] =('m', 'n', 'o', 'p'} and Y[] =('m', 'n', 'o', 'p' }
X[] =('m', 'n', 'o', 'p'} and
Y[] =('m', 'n', 'o', 'p' }*/
public class Charidentical{
    public static void main(String[] args) {
        char[] char1={'m','n','o','p'};
        char[] char2={'m','n','o','p'}; 
        System.out.println(identical(char1,char2));
              System.out.println(identical(char1,char2)?"Arrays characters are identical." : "Arrays characters are not identical.");
    }
    static boolean identical(char[] a,char[] b){
        if(a.length!=b.length) return false;
        for (int i=0;i<=a.length-1;i++) {
           if(a[i]!=b[i]) {
               return false;
           } 
        }
        return true;
    }
}
/* output:
    true
    Arrays characters are identical.
*/