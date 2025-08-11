public class Pattern {
    public static void main(String[] args){
        int count=5;
        for(int i=1;i<=5;i++){

            for(int j=1;j<=5;j++){
                if(i==j){
                    System.out.print(1);
                }
                else if(j==count){
                    System.out.print(1);

                }
                System.out.print(" ");
            }
            count--;

            System.out.println();
        }
    }
}
/*OUTPUT:
1    1 
 1  1  
  1   
 1  1  
1    1 */
