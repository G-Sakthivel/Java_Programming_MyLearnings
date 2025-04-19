/*
Write a java program to check whether the given number is even number or not, if it is even check that even number is divisible by 6 or not?
 */

import java.util.Scanner;                       // Import Scanner Class
public class nestedIfExample1 {
    public static void  main(String [] args)
    {
        Scanner scn = new Scanner(System.in);   // create a Scanner object
        System.out.print("Enter any number: ");
        int num = scn.nextInt();                // Read input from user, i.e., num = 12
        if(num%2==0)                            // Outer If condition true
        {                                       // Outer If Block Executed
            if(num%6==0)                        // Inner If condition true
            {                                   //Inner If Block Executed
                System.out.println("The given number is even number and also divisible by 6");
            }
            System.out.println("The given number is even number"); // Outer If Block Executed
        }

    }

}
