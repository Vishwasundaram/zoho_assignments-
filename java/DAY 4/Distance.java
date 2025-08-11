
import java.util.Scanner;

/*2. Construct a base class called twoD contains x and y and methods to read and write the x and y.
Create another class called threeD which is derived from twoD and also contains z and write methods to read and write z.
Also write a method to find the distance of two threeD Points.
sqrt((x2-x1)^2+(y2-y1)^2+(z2-z1)^2)
In main:
Create one ThreeD object using the default constructor.
Use the setters to set x, y, and z.
Create the second ThreeD object using the constructor with three arguments.
in the TwoD class:
Add a cout statement to the TwoD default constructor with a message "TwoD default constructor"
Add a cout statement to other TwoD constructor with a message "TwoD constructor with two arguments"*/
public class Distance{
    public static void main(String[] args) {
       Scanner scan=new Scanner(System.in);
        System.out.println("Enter the X1,Y1,Z1:");
        int x1=scan.nextInt();
        int y1=scan.nextInt();
        int z1=scan.nextInt();
        System.out.println("Enter the X2,Y2,Z2:");
        int x2=scan.nextInt();
        int y2=scan.nextInt();
        int z2=scan.nextInt();                  
        ThreeD obj1=new ThreeD(x1,y1,z1);           //obj1.setX(x1);
        ThreeD obj2=new ThreeD(x2,y2,z2);
        obj1.distance(obj2);
        
    }
}
class TwoD{
    private int x;
    private int y;
    public int getX(){
        return x;
    }
    public int getY(){
        return y;
    }
    public void setX(int x){
        this.x=x;
    }
    public void setY(int y){
        this.y=y;
    }
    
     // Constructor for setting x and y
    public TwoD(int x, int y) {
        this.x = x;
        this.y = y;
    }
     // Default constructor
    public TwoD() {
    }

}
class ThreeD extends TwoD{
    private int z;
    
    // public ThreeD() {
    // super();
    // }
    
    public ThreeD(int x,int y,int z) {
       
        super(x,y);
        this.z = z;
    }
    
    
    public int getZ(){
        return z;
    }
    public void setZ(int z){
        this.z=z;
    }
    public void distance(ThreeD ob){
        int a=ob.getX()-getX();
        int b=ob.getY()-getX();
        int c=ob.getZ()-getZ();
       System.out.println("The Distance of 2D and 3D is:"+Math.sqrt((a*a+b*b+c*c)));
    }

}


