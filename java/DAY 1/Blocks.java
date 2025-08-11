public class Blocks {
    {
        System.out.println("INITIALIZER BLOCK");
    }
    static {
        System.out.println("STATIC BLOCK");
    }

    public static void main(String[] args){
       new Blocks();
    }
}

/* OUTPUT
        STATIC BLOCK
        INITIALIZER BLOCK

 */