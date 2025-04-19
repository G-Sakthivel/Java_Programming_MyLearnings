public class IfElseExample1 {
    public  static void main(String [] args) {
        int x = 7;                              // variable initialization and declaration
        System.out.println("Hi Main");          // Hi Main
        if(x>7)                                 // If Condition False
        {
            System.out.println("Hi Mahi!");     // Doesn't enter into the if block
        }
        else                                    // Else Block Executed
        {
            System.out.println("Bye Mahi!");    // Bye Mahi!
        }
        System.out.println("Bye Main");         // Bye Main
    }
}
