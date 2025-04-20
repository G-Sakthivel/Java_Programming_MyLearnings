/*
 * Write a program to print digit by digit for a given number
 */


import java.util.Scanner;                       // Import Scanner class
public class whileLoopIntervQ1PrintDigits 
{
    public static void main(String[] args) 
    {
        Scanner scn = new Scanner(System.in);   // Create a Scanner object           
        System.out.print("Enter a number:");
        int num = scn.nextInt();                // Read user input, i.e., num = 1234
        int rem = 0;                            // Assign remainder/rem = 0 
        while(num>0)                            // while(condition), i.e., num > 0
        {
            rem = num % 10;                     
            System.out.print(rem);            
            num = num / 10;
        }
    }
}



/*
    output:
    Enter a number: 1234
    4
    3
    2
    1
 */
