/*
 * Write a program to display reverse of a given number
 */


import java.util.Scanner;                           // Import Scanner Class
public class whileLoopIntervQ10ReverseNumber 
{
    public static void main(String[] args) 
    {
        Scanner scn = new Scanner(System.in);       // Create a Scanner object
        System.out.print("Enter a number: ");
        int num = scn.nextInt();                    // Read user input, i.e., num = 143
        int rem = 0;                                // Assign rem/remainder = 0
        int rev = 0;                                // Assign rev/reverse = 0
        int copy = num;                             // Take a copy of num
        while(num>0)                                // while(condition), i.e., num > 0
        {
            rem = num % 10;                         
            rev = rev * 10 + rem;                   // print a number in reverse --> 1st iteration: (rev = 0 * 10 + 3) = 3 --> 2nd iteration: (rev = 3 * 10 + 4) = 34 --> 3rd iteration: (rev = 34 * 10 + 1) = 341
            num = num / 10;
        }
        
        System.out.println("Given number = "+copy); // Given number = 143
        System.out.println("Reversed number = "+rev);   // Reversed number = 341
    
    }
}



/*
    output:
    Enter a number: 143
    Given number = 143
    Reversed number = 341
 */
