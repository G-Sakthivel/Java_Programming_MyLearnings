public class elseIfExample2 {
    public static void main(String [] args)
    {
        System.out.println("Hi Main");                      // Hi Main
        if(10!=10)                                          // If condition False
        {
            System.out.println("If Block Executed");        // If Block not Executed
        }
        else if(10<=10)                                     // else if condition true
        {
            System.out.println("else if Block Executed");   // else if Block Executed
        }
        else
        {
            System.out.println("else Block Executed");      // else block not executed
        }
        System.out.println("Bye Main");                     // Bye Main
    }
}
