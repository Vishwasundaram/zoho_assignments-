public class Variables {
    static String word1="hi";        //static variable.
    static int No1=1;                //static variable.
    String word2="hello";            //instance variable.
    int No2=2;                       //instance variable.
    {
        String word5="Variables";   //block level variable.
        int No5=5;                   //block level variable.
        System.out.println(word5+" "+No5+"Types");
    }
    public static void main(String[] args){
        String word3="welcome";      //Local variable.
        int No3=3;                   //Local variable.
        final String word4="hello,world";  //Final variable.
        final int No4=4;                   //Final variable.
        Variables  call=new Variables();
        System.out.print(word1+"  "+No1+"\n"+call.word2+"  "+call.No2+"\n"+word3+"  "+No3+"\n"+word4+"  "+No4);
    }
}

/*OUTPUT
        Variables 5Types
        hi  1
        hello  2
        welcome  3
        hello,world  4
 */
