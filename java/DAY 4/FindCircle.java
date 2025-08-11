/*3. A class Point is declared as follows:
class Point{
public:
Point(){int=0;int=0;} //default constructor
void setPoint(int,int); //set coordinates
int getX() const {return x;} //get x coordinates
int getY() const {return y;} //get y coordinates
void printPoint(); // print (x,y) coordinates
private int x;
private int y;
};
--------------------
Write the implementation of the class Point in the same file.
Then, declare a class called Circle that is derived from the class Point. 
The class Circle has public member functions Circle (constructor), setRadius(), getRadius() and area() and one private data member radius. 
The class Circle indirectly uses private member x and y of class Point to store the coordinate of the center of the circle.
 The class Circle also checks to make sure the radius value is a positive number, otherwise it is set to default value 1.
Note: The private members of class Point can only be indirectly accessed by class Circle using public methods of class point.
Implement the class Circle and write a driver program to test the class Circle. An example of the output of the driver program is.
Enter x: 2
Enter y: 2
Enter radius: 1
Circle center is (2,2)
Radius is 1
Area is 3.14*/
import java.util.Scanner;
public class FindCircle{
 public static void main(String[] args){
    Scanner scan=new Scanner(System.in);
    System.out.println("Enter X:");
    int x=scan.nextInt();
    System.out.println("Enter Y:");
    int y=scan.nextInt();
    System.out.println("Enter the Radius:");
    int radius=scan.nextInt();
    radius=(radius<0)?1:radius;
    Circle ob=new Circle(x,y,radius);
    ob.printPoint(x,y);
    ob.area(radius);
 }
}
class Point{
    private int x;
    private int y;
    public Point(){
        this.x=0;
        this.y=0;
    }
    public void setPoint(int x,int y){
        this.x=x;
        this.y=y;
    }
    public int getX() {
        return x;
        } 
    public int getY() {
        return y;
        }
    public void printPoint(int x,int y){
        System.out.println("X coordinate:"+x);
        System.out.println("Y coordinate:"+y);
        }
}
class Circle extends Point{
    
    private int radius;

    public Circle(int x,int y,int radius){
        super();
        this.radius=radius;
    }
    public void setRadius(int radius){
        this.radius=radius;
    }
    public int  getRadius(){
        return radius;
    }
    public void area(int radius){
        double value=Math.PI*(radius*radius);
        System.out.printf("Area: %.4f%n",value);
    }
}
/* OUTPUT:
Enter X:
2
Enter Y:
2
Enter the Radius:
-1
X coordinate:2
Y coordinate:2
Area: 3.1416
*/