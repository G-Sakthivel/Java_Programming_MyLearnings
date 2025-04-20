/*
 * Write a program to print the sum of odd digits for a given number
 */


 import java.util.Scanner;                       // Import Scanner class
 public class whileLoopIntervQ7SumOfOddDigits 
 {
     public static void main(String[] args) 
     {
         Scanner scn = new Scanner(System.in);   // Create a Scanner object           
         System.out.print("Enter a number:");
         int num = scn.nextInt();                // Read user input, i.e., num = 1234
         int rem = 0;                            // Assign remainder/rem = 0 
         int sum = 0;                            // Assign sum = 0
         while(num>0)                            // while(condition), i.e., num > 0
         {
             rem = num % 10;
             if(rem % 2 != 0)                    // if remainder is odd
             {
                sum = sum + rem;                 // sum odd digits --> 3 + 1 = 4
             }       
             num = num / 10;
         }
         System.out.println("Sum of odd digits is: "+sum); // Print the sum of odd digits --> 4
     }
 }



 /*
    output:
    Enter a number:1234
    Sum of odd digits is: 4
  */