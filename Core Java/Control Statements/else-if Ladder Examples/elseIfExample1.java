public class elseIfExample1 {
    public static void main(String [] args)
    {
        System.out.println("Hi Main");                      // Hi Main
        if(10==10)                                          // If condition True
        {
            System.out.println("If Block Executed");        // If Block Executed
        }
        else if(10>10)
        {
            System.out.println("else if Block Executed");   // else if block not executed
        }
        else
        {
            System.out.println("else Block Executed");      // else block not executed
        }
        System.out.println("Bye Main");                     // Bye Main
    }
}
