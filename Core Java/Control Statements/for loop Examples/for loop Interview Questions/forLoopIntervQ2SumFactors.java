/*
 * Write a program to display sum of factors of a given number
 */


 import java.util.Scanner;                           // Import Scanner Class
 public class forLoopIntervQ2SumFactors 
 {
     public static void main(String[] args) 
     {
         Scanner scn = new Scanner(System.in);       // Create a Scanner Object
         System.out.print("Enter a number: ");
         int num = scn.nextInt();                    // Read user input, i.e, num = 6
         int sum = 0;                                // Initialize sum variable to 0
         for(int i =1; i<=num; i++)                  // for(initialization; condition; increment/decrement)
         {
             if(num%i==0)                            // If condition only allows i which returns 0 as remainder after num / i (i.e., num%i == 0)
             {
                 sum = sum + i;                      // sum = 1 + 2 + 3 + 6 --> 12
             }
         }
         System.out.println("Sum of factors of "+num+" = "+sum); // Output: 12
 
     }
     
 }


 /*
    output:
    Enter a number: 6
    Sum of factors of 6 = 12
  */
 