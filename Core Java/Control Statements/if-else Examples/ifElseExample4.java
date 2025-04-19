/* Write a Program to read num from user and perform the below operations,
---> if num is less than or equal to 10 then increment the num by 1
---> Else decrement the num by 1
*/

import java.util.Scanner;                               // Import the scanner class
public class ifElseExample4 {
    public static void main(String [] args)
    {
        Scanner scn = new Scanner(System.in);           // Create a Scanner object
        System.out.print("Enter num value: ");
        int num = scn.nextInt();                        // Read user input, i.e., num = 12
        System.out.println("Before Operation: "+num);   // Before Operation: 12
        if(num<=10)                                     // If condition false
        {                                               // If Block not Executed
            num++;
        }
        else                                            // Else Block Executed
        {
            num--;                                      // num = 12 - 1 ---> 11
        }
        System.out.println("After Operation: "+num);    // After Operation: 11
    }
}
