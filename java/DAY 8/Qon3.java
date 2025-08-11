/*3. Develop a Java program which illustrates the usage of Comparable Interface. */
import java.lang.reflect.Array;
import java.util.Arrays;
public class Qon3  implements Comparable<Qon3>{
    int v;

    public Qon3(int v) {
    this.v=v;
    }

    public String toString(){
        return String.valueOf(v);
    }
    
    public int compareTo(Qon3 o){
        return this.v-o.v;         //o.v~Number(4);
    }

    public static void main(String[] args) {
        Qon3[] a={new Qon3(5),new Qon3(51),new Qon3(15),new Qon3(2)};
        
        System.out.println("Before Sorting:"+Arrays.toString(a));

        Arrays.sort(a);

        System.out.println("After Sorting:"+Arrays.toString(a));


    }
}
/*OUTPUT:
Before Sorting:[5, 51, 15, 2]
After Sorting:[2, 5, 15, 51]
*/