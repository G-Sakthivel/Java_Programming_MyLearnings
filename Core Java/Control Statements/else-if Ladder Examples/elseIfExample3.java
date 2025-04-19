public class elseIfExample3 {
    public static void main(String [] args)
    {
        System.out.println("Hi Main");                      // Hi Main
        if(101<100)                                         // If condition false
        {
            System.out.println("If Block Executed");        // If Block not Executed
        }
        else if(100==200)                                   // else if condition false
        {
            System.out.println("else if Block Executed");   // else if block not executed
        }
        else
        {
            System.out.println("else Block Executed");      // else Block Executed
        }
        System.out.println("Bye Main");                     // Bye Main
    }
}
