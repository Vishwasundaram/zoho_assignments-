import java.util.Scanner;

public class Pattern5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the No rows:");
        int n = scan.nextInt(); // number of rows
        int i = 0; // row index

        do {
            // Print spaces
            int k = 0;
            do {
                if (k >= n - i) break;
                System.out.print("  "); // two spaces
                k++;
            } while (true);

            // Print Pascal numbers
            int j = 0;
            int num = 1;
            do {
                if (j > i) break;
                System.out.print(num + "   ");
                num = num * (i - j) / (j + 1);
                j++;
            } while (true);

            System.out.println(); // new line
            i++;
        } while (i < n);
    }
}
/*OUTPUT:
Enter the No rows:
5
          1   
        1   1   
      1   2   1   
    1   3   3   1   
  1   4   6   4   1  
*/
