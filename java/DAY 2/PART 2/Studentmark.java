/*9. Write an array which takes in roll no and marks in 3 subjects for 10 students.
Format and Print the roll no, total marks and average for all students in a table form.*/
import java.util.Arrays;
import java.util.Scanner;
public class Studentmark{
        int[][] arr=new int[10][4];
        int total=0;
        double percent=0.00;
    public static void main(String[] args) {
        Studentmark obj=new Studentmark();
        System.out.println("Enter the Student mark.");
        obj.mark();
        System.out.println("--------------------------------------------");
        System.out.printf("%-10s %-10s %-10s","RollNo","Total","Percentage \n");
        obj.process();
        System.out.println("--------------------------------------------");
    }
    public void mark() {
        Scanner scan=new Scanner(System.in);       
        for(int i=0;i<10;i++){
            for(int j=0;j<4;j++){
                arr[i][j]=scan.nextInt();
            }
        }
        System.out.println(Arrays.deepToString(arr));
        }

    public void process(){
        for(int k=0;k<10;k++){
            total=0;
            percent=0.0;
            for(int n=1;n<4;n++){
                total+=arr[k][n];
                 percent=total/3;
            }
            System.out.printf("%-10d %-10d %-10.2f \n", arr[k][0],total,percent);
        }
    }
}
/*OUTPUT:
Enter the Student mark.
1    
12
12
12
2
23
23
23
3
34
34
34
4
45
45
45
5
56
56
56
6
67
67
67
7
78
78
78
8
89
89
89
9
56
56
56
10
45
45
45
[[1, 12, 12, 12], [2, 23, 23, 23], [3, 34, 34, 34], [4, 45, 45, 45], [5, 56, 56, 56], [6, 67, 67, 67], [7, 78, 78, 78], [8, 89, 89, 89], [9, 56, 56, 56], [10, 45, 45, 45]]
--------------------------------------------
RollNo     Total      Percentage 
1          36         12.00      
2          69         23.00      
3          102        34.00      
4          135        45.00      
5          168        56.00      
6          201        67.00      
7          234        78.00      
8          267        89.00      
9          168        56.00      
10         135        45.00      
--------------------------------------------
*/