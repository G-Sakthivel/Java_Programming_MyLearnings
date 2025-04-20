/*
 * Write a program to display count of factors for a given number
 */


 import java.util.Scanner;                           // Import Scanner Class
 public class forLoopIntervQ3CountFactors 
 {
     public static void main(String[] args) 
     {
         Scanner scn = new Scanner(System.in);       // Create a Scanner Object
         System.out.print("Enter a number: ");
         int num = scn.nextInt();                    // Read user input, i.e, num = 6
         int count = 0;                              // Initialize count variable to 0
         for(int i =1; i<=num; i++)                  // for(initialization; condition; increment/decrement)
         {
             if(num%i==0)                            // If condition only allows i which returns 0 as remainder after num / i (i.e., num%i == 0)
             {
                 count++;                            // count(1,2,3,6) = 4
             }
         }
         System.out.println("Count of factors for " + num + " is " + count); // Output: 4
         
 
     }
     
 }



 /*
    output:
    Enter a number: 6
    Count of factors for 6 is 4
  */