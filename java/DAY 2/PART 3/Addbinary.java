

public class Addbinary {
    public static void main(String[] args) {
     Addbinary obj=new Addbinary();
     System.out.println(obj.addBinary("11","1"));
    }
    public String addBinary(String a, String b) {
        StringBuilder str = new StringBuilder();
        int al = a.length()-1;
        int bl = b.length()-1;
        int c=0;
        while(al>=0 || bl>=0 || c>0){
            int s = c;
            if(al>=0){
                s +=a.charAt(al) - '0';
                al--;
            }
            if(bl>=0){
                s +=b.charAt(bl) - '0';
                bl--;
            }
            str.append(s%2);
            c = s/2;   

        }

        return "binary value:"+str.reverse().toString();
    }
}