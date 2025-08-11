/*3. Design a class``Employee with private data members: employee ID, name, designation, department, and monthly salary.
 Use proper getter and setter methods to access and update these fields.
 Add a method to calculate and return the annual salary of the employee.*/
class Employee{
    private int ID;
    private String name; 
    private String designation;
    private String department; 
    private double  monthlysalary;
    public void setId(int id){
        ID=id;
    }
     public void setName(String name){
        this.name=name;
    }
     public void setDesignation(String designation){
        this.designation=designation;
    }
     public void setDepartment(String department){
        this.department=department;
    }
     public void setsalary(double monthlysalary){
        this.monthlysalary=monthlysalary;
    }
    public int getId(){
        return ID;
    }
    public String getName(){
        return name;
    }
    public String getDesignation(){
        return designation;
    }
    public String getDepartment(){
        return department;
    }
    public double  getsalary(){
        return monthlysalary;
    }

    public void cal(){
        System.out.println("Annual salay:"+(12*monthlysalary));
    }
}

public class Qno3{
    public static void main(String[] args){
        Employee obj=new Employee();

        obj.setId(1);
        obj.setName("vishwa");
        obj.setDesignation("Software Developer");
        obj.setDepartment("Development");
        obj.setsalary(50000);
        
        System.out.println("Employee ID:"+obj.getId()+"\n"+"Name:"+obj.getName()+"\n"+"Designation:"+obj.getDesignation()+"\n"+"Department:"+obj.getDepartment()+"\n"+"Monthly salary:"+obj.getsalary());
        obj.cal();

    }
}
/* OUTPUT:
Employee ID:1
Name:vishwa
Designation:Software Developer
Department:Development
Monthly salary:50000.0
Annual salay:600000.0
*/
