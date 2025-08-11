
import javax.sound.sampled.SourceDataLine;

/*6. Develop a Java program to illustrate pass-by-value. */
public class Qon6{
    public static void main(String[] args) {
      Sample value=new Sample();
      value.sam(20);  
    }
}
class Sample{
    int a=10;
    public void sam(int a){
        this.a=a;
        System.out.println("Value is:"+a);
    }
}
/*OUTPUT:
Value is:20
*/


