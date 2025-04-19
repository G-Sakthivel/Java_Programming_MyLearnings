public class ifElseExample2 {
    public static void main(String [] args){
        int var1 = 100;                         // variable initialization and declaration
        System.out.println("Hi Players!!!");    // Hi Players!!!
        if(!(var1!=100))                        // If Condition True
        {                                       // If Block Executed
            System.out.println("Hi Dhoni!!!");  // Hi Dhoni!!!
        }
        else                                    // Doesn't enter into else block
        {
            System.out.println("Bye Dhoni!!!"); // Else Block not Executed
        }
        System.out.println("Bye Players!!!");   // Bye Players!!!
    }
}
