/*
 * Write a program to print the count of odd digits for a given number
 */


 import java.util.Scanner;                       // Import Scanner class
 public class whileLoopIntervQ9CountOfOddDigits 
 {
     public static void main(String[] args) 
     {
         Scanner scn = new Scanner(System.in);   // Create a Scanner object           
         System.out.print("Enter a number:");
         int num = scn.nextInt();                // Read user input, i.e., num = 1234
         int rem = 0;                            // Assign remainder/rem = 0 
         int count = 0;                          // Assign count = 0
         while(num>0)                            // while(condition), i.e., num > 0
         {
             rem = num % 10;
             if(rem % 2 != 0)                    // if remainder is odd
             {
                count++;                         // count odd digits --> count(3,1) = 2
             }       
             num = num / 10;
         }
         System.out.println("Count of odd digits: "+count);  // Print count of odd digits --> 2
         
     }
 }



 /*
    output:
    Enter a number:1234
    Count of odd digits: 2
  */