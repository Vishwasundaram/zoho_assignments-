/*10. Write a menu driven program to do following operation on two dimensional array A of size m x n. You should use user-defined methods which accept 2-D array A, and its size m and n as arguments. The options are:
● To input elements into matrix of size m x n
● To display elements of matrix of size m x n
● Sum of all elements of matrix of size m x n
● To display row-wise sum of matrix of size m x n
● To display column-wise sum of matrix of size m x n
● To create transpose of matrix of size n x m*/
import java.util.Scanner;
public class Matrix{
    public static void main(String[] args){
            Scanner scan=new Scanner(System.in);
            System.out.println("Enter the row size:");
            int m=scan.nextInt();
            System.out.println("Enter the column size:");
            int n=scan.nextInt();
            int [][] arr=new int[m][n];
                for(int i=0;i<m;i++){
                        for(int j=0;j<n;j++){
                            System.out.print("Enter the values:["+i+"]"+"["+j+"]");
                            arr[i][j]=scan.nextInt(); 
                        }
                }
                int a;
        do{   
            System.out.println("1,View matrix size.");
            System.out.println("2,Sum of all elements of matrix.");
            System.out.println("3,Row-wise sum of matrix.");
            System.out.println("4,Column-wise sum of matrix .");
            System.out.println("5,Transpose of matrix .");
            System.out.println("6,Exit.");
            System.out.println("Enter your choice.");
             a=scan.nextInt();

            switch(a){

            case 1:
            Matrix obj1=new Matrix();
            obj1.output(arr,m,n);
            break;
            case 2 :
            Matrix obj2=new Matrix();
            obj2.alladd(arr,m,n);
            break;
            case 3:
            Matrix obj3=new Matrix();
            obj3.row(arr,m,n);
            break;
            case 4:
            Matrix obj4=new Matrix();
            obj4.column(arr,m,n);
            break;
            case 5:
            Matrix obj5=new Matrix();
            obj5.transpose(arr,m,n);
            break;
            case 6:
                System.out.println("Exit.");
                break;
            default:
                System.out.println("Please enter the valid choice.");
                break;
            }
        }while(a!=6);
    }
    //Printing the Matrix.
    public void output(int[][] arr, int m, int n) {
            System.out.println("Matrix.");
                for(int i=0;i<m;i++){

                    for(int j=0;j<n;j++){
                        System.out.print(arr[i][j]+" ");
                    }
                    System.out.println();
                    }
    }
    //Add the all value.
    public void alladd(int[][] arr, int m, int n) {
               System.out.println("Sum of Matrix values.");
                for(int i=0;i<m;i++){
                     
                    for(int j=0;j<n;j++){
                        System.out.print(arr[i][j]+arr[i][j]+"  ");
                    }
                    System.out.println();
                }
    }
    //Row-Wise sum of Matrix.
     public void row(int[][] arr, int m, int n) {
               System.out.println("Row-Wise sum of Matrix.");
               
                for(int i=0;i<m;i++){  
                    int add=0;
                    for(int j=0;j<n;j++){
                        add+=arr[i][j];
                    }
                    System.out.println(add);
                }
    }
     //column-Wise sum of Matrix.
     public void column(int[][] arr, int m, int n) {
               System.out.println("Column-Wise sum of Matrix.");
               
                for(int i=0;i<n;i++){  
                    int add=0;
                    for(int j=0;j<m;j++){
                      add+=arr[j][i];
                    }
                    System.out.println(add);
                }
    }
    //transpose of matrix of size n x m‌
     public void transpose(int[][] arr, int m, int n) {
               System.out.println("Transpose of matrix.");
                for(int i=0;i<n;i++){  
                    int add=0;
                    for(int j=0;j<m;j++){
                      System.out.print(arr[j][i]+"  ");
                    }
                    System.out.println();
                }
    }

}
/* OUTPUT:
Enter the row size:
3
Enter the column size:
4
Enter the values:[0][0]1
Enter the values:[0][1]2
Enter the values:[0][2]3
Enter the values:[0][3]4
Enter the values:[1][0]5
Enter the values:[1][1]6
Enter the values:[1][2]7
Enter the values:[1][3]8
Enter the values:[2][0]2
Enter the values:[2][1]2
Enter the values:[2][2]2
Enter the values:[2][3]2
1,View matrix size.
2,Sum of all elements of matrix.
3,Row-wise sum of matrix.
4,Column-wise sum of matrix .
5,Transpose of matrix .
6,Exit.
Enter your choice.
1
Matrix.
1 2 3 4 
5 6 7 8 
2 2 2 2 
1,View matrix size.
2,Sum of all elements of matrix.
3,Row-wise sum of matrix.
4,Column-wise sum of matrix .
5,Transpose of matrix .
6,Exit.
Enter your choice.
2
Sum of Matrix values.
2  4  6  8  
10  12  14  16  
4  4  4  4  
1,View matrix size.
2,Sum of all elements of matrix.
3,Row-wise sum of matrix.
4,Column-wise sum of matrix .
5,Transpose of matrix .
6,Exit.
Enter your choice.
3
Row-Wise sum of Matrix.
10
26
8
1,View matrix size.
2,Sum of all elements of matrix.
3,Row-wise sum of matrix.
4,Column-wise sum of matrix .
5,Transpose of matrix .
6,Exit.
Enter your choice.
4
Column-Wise sum of Matrix.
8
10
12
14
1,View matrix size.
2,Sum of all elements of matrix.
3,Row-wise sum of matrix.
4,Column-wise sum of matrix .
5,Transpose of matrix .
6,Exit.
Enter your choice.
5
Transpose of matrix.
1  5  2  
2  6  2  
3  7  2  
4  8  2  
1,View matrix size.
2,Sum of all elements of matrix.
3,Row-wise sum of matrix.
4,Column-wise sum of matrix .
5,Transpose of matrix .
6,Exit.
Enter your choice.
6
Exit.
*/
