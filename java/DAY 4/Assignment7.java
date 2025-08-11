
import java.util.Scanner;

/*6. Design and implement a custom Java class named MyString that mimics the behavior of Java’s built-in String class. 
Your class should store character data internally (e.g., using a char[] or String as input) and 
should provide the following string methods,
1. int length() – Returns the number of characters.
2. char charAt(int index) – Returns the character at the specified index.
3. boolean equals(MyString other) – Checks if two MyString objects are equal.
4. MyString toUpperCase() – Returns a new string with all characters in uppercase.
5. MyString toLowerCase() – Returns a new string with all characters in lowercase.
6. MyString substring(int start, int end) – Returns a substring from start to end-1.
7. MyString concat(MyString other) – Concatenates another string to the current one.
8. boolean contains(MyString sub) – Checks if a substring exists.
9. int indexOf(char ch) – Returns the index of the first occurrence of the character.
10. MyString replace(char oldChar, char newChar) – Replaces all occurrences of a character.
* Implement proper constructors, including one that takes a char[] or String as input.
* Avoid using any built-in String methods to perform the operations internally.
* Write a main method to demonstrate the working of your MyString class.    */
public class Assignment7{
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        MyString ob=new MyString();

        System.out.println("Enter the String:");
        String name=scan.nextLine();

        char[] arr=name.toCharArray();

        System.out.println("Enter the your choice.");
        System.out.println("1. int length() - Returns the number of characters.");
        System.out.println("2. char charAt(int index) - Returns the character at the specified index.");
        System.out.println("3. boolean equals(MyString other) - Checks if two MyString objects are equal.");
        System.out.println("4. MyString toUpperCase() - Returns a new string with all characters in uppercase.");
        System.out.println("5. MyString toLowerCase() - Returns a new string with all characters in lowercase.");
        System.out.println("6. MyString substring(int start, int end) - Returns a substring from start to end-1.");
        System.out.println("7. MyString concat(MyString other) - Concatenates another string to the current one.");
        System.out.println("8. boolean contains(MyString sub) - Checks if a substring exists.");
        System.out.println("9. int indexOf(char ch) - Returns the index of the first occurrence of the character.");
        System.out.println("10. MyString replace(char oldChar, char newChar) – Replaces all occurrences of a character.");
        System.out.println("11.EXIT");
        int a;
        
        do{
            System.out.println("your choice:");
            a=scan.nextInt();
            scan.nextLine();
            switch (a){

            case 1:    
            ob.length(name);
            break;

            case 2:    
            System.out.println("Enter the Index.");
            int index=scan.nextInt();scan.nextLine();
            ob.specificIndex(index,name,arr);
            break;
            
            case 3:
            System.out.println("Enter the second string:");
            String name1=scan.nextLine();
            char[] arr1=name1.toCharArray();
            ob.equal(arr,arr1);
            break;

            case 4:
             ob.uppercase(arr);
             break;

            case 5:
            ob.lowercase(arr);
            break;
            
            case 6:
            ob.substring(arr);
            break;

            case 7:
            ob.concat(name);
            break;

            case 8:
             ob.checkSub(arr,name);
             break;

            case 9:
            ob.returnIndex(name);
            break;

            case 10:
            ob.replacesChar(name);
            break;
    
            case 11:
            System.out.println("Exit.");
            break;

            default:
                System.out.println("Invalid No.");
                break;
            }

        }while(a!=11);

    }
}

class  MyString{
    String value;
    String getValue;
    static int count=0;
    int index;
    public void length(String value){
        this.value=value;
        try{
            
        while(true){
            getValue+=value.charAt(count);
            count++;
        }
        }
        catch(Exception e){
            System.out.println("String length.");
        }
        System.out.println(count);
    }
    // Find index.
    public void specificIndex(int index,String value,char arr[]){
        this.index=index;
        if(index>=count){
            System.out.println("Please enter the valid index.");
        }
        for (int i=0;i<=count-1;i++){
                 if(index==i){
                    System.out.println("Index character:"+arr[i]);
                 }
        }
    }
    //Equal.
    public void equal(char arr[],char arr1[]){
        int increament=0;
        if(arr.length==arr1.length){
        for(int i=0;i<=count-1;i++){
            if(arr[i]==arr1[i]){
               increament++;
            }
        }
        }
        System.out.println((increament==count)?"Equal":"Not Equal");
    }
    //Uppercase.
    public void uppercase(char arr[]){
        StringBuffer tempstring=new StringBuffer();
        for(int i=0;i<=count-1;i++){
            char a=arr[i];
            if(('A'<=a&&a<='Z')){
                tempstring.append((char)(arr[i]));
            }
            else if('a'<=a&&a<='z'){
            tempstring.append((char)(arr[i]-32));
            }
        }
        System.out.println("String Uppercase:"+tempstring);
    }
     //Lowercase.
    public void lowercase(char arr[]){
        StringBuffer tempstring1=new StringBuffer();
        for(int i=0;i<=count-1;i++){
            char a=arr[i];
            if(('a'<=a&&a<='z')){
                tempstring1.append((char)(arr[i]));
            }
            else if('A'<=a&&a<='Z'){
            tempstring1.append((char)(arr[i]+32));
            }
        }
        System.out.println("String Lowercase:"+tempstring1);
    }
    //SubString.
    public void substring(char arr[]){
        Scanner value=new Scanner(System.in);
         StringBuffer tempstring2=new StringBuffer();
        System.out.println("Enter the substring starting index and end index and the string length is:"+(count-1));
        int start=value.nextInt();
        int end=value.nextInt();
        System.out.println("subString("+start+","+end+")");
        if((start<=count && end<=count)||(start==count && end==count)){

        if((end>=0&&end<=count)&&(start>=0&&start<=count)){
        for(int i=start;i<end;i++){
            tempstring2.append(arr[i]);
        }
        System.out.println("SubStirng value:"+tempstring2);
        }
        
        else if(start>=0&&start<=count){
        for(int i=start;i<count;i++){
            tempstring2.append(arr[i]);
        }
        System.out.println("SubStirng value:"+tempstring2);
        }

        else if( (start==count)&&(end==count) || (start==end) ){
        for(int i=start;i<count;i++){
            tempstring2.append(""+" - Empty");
        }
        System.out.println("SubStirng value:"+tempstring2);
        }        
        }

        else{
        System.out.println("not valid index number.");
        }
    }
    //concat.
    public void concat(String value){
        Scanner current=new Scanner(System.in);
        System.out.println("First String value:"+value);
        System.out.println("Enter the concat String value.");
        String currentvalue=current.nextLine();
        System.out.println("Concat the string = "+value+" "+currentvalue);
    }
    //check the substring.
    public boolean checkSub(char arr[],String value){
        Scanner current1=new Scanner(System.in);
        
        System.out.println("Your current String value:"+value);

        System.out.println("Enter the checking value:");
        String user1=current1.nextLine();
        
        int len=user1.length();

        int looprun=value.length()/user1.length();
        for(int i=0;i<value.length();i++){
            String makesub=value.substring(i,len);
            if(makesub.equals(user1.substring(0))){
                System.out.println("True");
                return true;
            }
            len++;
        }
        System.out.println("False");
        return false;
    }

    //return index.
    public void returnIndex(String value){
        Scanner current2=new Scanner(System.in);
        System.out.println("your Stirng :"+value);
         System.out.print("Enter a character: ");
        String ch = current2.nextLine();
        if(ch.length()<=1){
        for(int i=0;i<value.length();i++){
            if ((value.charAt(i))==(ch.charAt(0))) {
                System.out.println(i);
            }
            else{
                System.out.println("Invalid character, so not found it.");
                
            }
            break;
        }
        }
        else{
            System.out.println("It is not valid character.");
        }
    }
      //replaces all character.
    public void replacesChar(String value){
        Scanner current3=new Scanner(System.in);
        
        System.out.println("your Stirng :"+value);
        
        System.out.print("Enter a old character: ");
        String charswap1 = current3.nextLine();

        System.out.print("Enter a new character: ");
        String charswap2 = current3.nextLine();
        
        StringBuffer get=new StringBuffer();
        
        if((charswap1.length()<=1)&&(charswap2.length()<=1)){
        for(int i=0;i<value.length();i++){
            if ((value.charAt(i))==(charswap1.charAt(0))) {
                get.append(charswap2.charAt(0));
            }

            else{
               get.append(value.charAt(i));
            }

        }

        }
        else{
            System.out.println("It is not valid character.");
        }
        System.out.println("Replaces all occurrences of a character:"+get);
    }
}
