/*
 * Write a program to print the count of even digits for a given number
 */


 import java.util.Scanner;                       // Import Scanner class
 public class whileLoopIntervQ8CountOfEvenDigits 
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
             if(rem % 2 == 0)                    // if remainder is even
             {
                count++;                         // count even digits --> count(4,2) = 2
             }       
             num = num / 10;
         }
         System.out.println("Count of even digits: "+count);  // Print count of even digits --> 2
         
     }
 }



 /*
    output:
    Enter a number:1234
    Count of even digits: 2
  */