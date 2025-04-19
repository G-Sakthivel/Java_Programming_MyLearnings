/*
Write a program to read age from the user and perform the below operations,
---> If the user's age is greater than or equal to 21 then read gender and do the following,
---> if the gender is 'm' then display "Mahishakthi Can Marry"
---> else "Mahisha Can Marry"
 */

import java.util.Scanner;                               // Import Scanner Class
public class nestedIfElseInterviewQ1 {
    public static void main(String [] args)
    {
        Scanner scn = new Scanner(System.in);           // Create a SCanner Object
        System.out.print("Enter your age: ");
        int age = scn.nextInt();                        // Read user input, i.e., age = 24
        if(age>=21)                                     // Outer If condition true
        {
            System.out.print("Enter your gender: ");    // Outer If Block Executed
            char gender = scn.next().charAt(0);         // Read user input, i.e., gender = m
            if(gender == 'm')                           // Inner If condition true
            {                                           // Inner If Block Executed
                System.out.println("Mahishakthi Can Marry");   // output: Mahishakthi Can Marry
            }
            else                                        // Doesn't enter into inner else block
            {
                System.out.println("Mahisha Can Marry"); // Inner else block not executed
            }
        }
        else                                            // Doesn't enter into outer else block
        {
            System.out.println("Not eligible for marriage");    // Outer else block not executed
        }
    }
}
