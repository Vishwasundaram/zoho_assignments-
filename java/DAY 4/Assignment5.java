/*5. Create a class named Shape with a method that prints "This is a shape". 
Create another class named Polygon inheriting the Shape class with the same method that prints "Polygon is a shape". 
Create two other classes named Rectangle and Triangle having the same method which prints "Rectangle is a polygon" and
"Triangle is a polygon" respectively. Again, make another class named Square having the same method 
which prints "Square is a rectangle".
Now, try calling the method by the object of each of these classes.*/
public class Assignment5{
    public static void main(String[] args){
        Shape ob1=new Shape();
        Polygon ob2=new Polygon();
        Rectangle ob3=new Rectangle();
        Triangle ob4=new Triangle();
        Square ob5=new Square();
        ob1.print();
        ob2.print();
        ob3.print();
        ob4.print();
        ob5.print();
    }
}
class Shape{
    public void print(){
        System.out.println("This is a Shape.");
    } 
}
class Polygon extends Shape{
    public void print(){
        System.out.println("Polygon is a shape.");
    } 
}
class Rectangle extends Polygon{
    public void print(){
        System.out.println("Rectangle is a Polygon.");
    } 
}
class Triangle extends Polygon{
    public void print(){
        System.out.println("Triangle is a polygon.");
    } 
}
class Square extends Rectangle{
    public void print(){
        System.out.println("Square is a rectangle.");
    } 
}