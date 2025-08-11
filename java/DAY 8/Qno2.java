import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/*2. Develop a Java program which illustrates the usage of Comparator Interface. */
public class Qno2{
    public static void main(String[] args) {
        List<Student> arr=new ArrayList<>();

        arr.add(new Student(01, "vishwa"));
        arr.add(new Student(12, "selvam"));
        arr.add(new Student(5, "tamil"));
    
        Collections.sort(arr,new Sorting());

        System.out.println("Sorting.");

        for(int i=0;i<arr.size();i++){
            System.out.println(arr.get(i));
        }
       
    }

}
class Student{
    int rollno;
    String name;

    Student(int rollno,String name) {
    this.rollno=rollno;
    this.name=name;
    }


    public String toString(){
        return rollno+ ": "+name;
    }
    
} 
class Sorting implements Comparator<Student>{

    public int compare(Student a,Student b){
        return a.rollno-b.rollno;
    }

}
/*OUTPUT:
Sorting.
1: vishwa
5: tamil
12: selvam
 */