import java.util.Scanner;
public class Construct {
    Construct(int empId, String name, String department, double salary){
        System.out.println("EmployeeId:"+empId+"\nName:"+name+"\nDepartment"+department+"\nSalary"+salary);
    }
    public static void main(String[] args){
        Scanner value=new Scanner(System.in);
        System.out.println("Enter the employeeId:");
        int empid=value.nextInt();
        value.nextLine();
        System.out.println("Enter the Name:");
        String name=value.next();
        System.out.println("Enter the Department:");
        String department=value.next();
        System.out.println("Enter the Salary:");
        double salary=value.nextDouble();
        Construct call=new Construct(empid,name,department,salary);
    }
}
/*    OUTPUT:
        Enter the employeeId:
        10
        Enter the Name:
        vishwa
        Enter the Department:
        developer
        Enter the Salary:
        20000
        EmployeeId:10
        Name:vishwa
        Departmentdeveloper
        Salary20000.0
 */
