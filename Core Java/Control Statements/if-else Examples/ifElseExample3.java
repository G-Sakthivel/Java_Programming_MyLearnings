/* Write a Program to read num from user and perform the below operations,
---> if num is greater than 50 then increase the number by 10
---> Else decrease the num by 10
 */

import java.util.Scanner;                               // Import the scanner class
public class ifElseExample3 {
    public static void main(String [] args)
    {
        Scanner scn = new Scanner(System.in);           // Create a Scanner object
        System.out.print("Enter num value: ");
        int num = scn.nextInt();                        // Read user input, i.e., num = 60
        System.out.println("Before Operation: "+num);   // Before Operation: 60
        if(num>50)                                      // If condition true
        {                                               // If Block Executed
            num = num + 10;                             // num = 60 + 10 ---> 70
        }
        else                                            // Doesn't enter into else block
        {
            num = num - 10;                             // Else Block not executed
        }
        System.out.println("After Operation: "+num);    // After Operation: 70
    }
}
