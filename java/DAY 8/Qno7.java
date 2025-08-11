/*7. Develop a Java program to illustrate the usage of toString() method.*/
public class Qno7{
    public static void main(String[] args) {
        Help ob=new Help("Vishwa",20);
        System.out.println(ob);
    }
}
class Help{
    String name;
    int age;

    public Help(String name,int age) {
    this.name=name;
    this.age=age;
    }
    public String toString(){
        return "Name:"+name+"\n"+"Age:"+age;
    }  
}
/*OUTPUT:
Name:Vishwa
Age:20
*/