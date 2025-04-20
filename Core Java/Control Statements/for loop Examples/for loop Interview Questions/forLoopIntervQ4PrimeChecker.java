/*
 * Write a program to check whether a given number is prime or not
 */


 import java.util.Scanner;                           // Import Scanner Class
 public class forLoopIntervQ4PrimeChecker 
 {
     public static void main(String[] args) 
     {
         Scanner scn = new Scanner(System.in);          // Create a Scanner Object
         System.out.print("Enter a number: ");
         int num = scn.nextInt();                       // Read user input, i.e, num = 29
         int count = 0;                                 // Initialize count variable to 0
         for(int i =1; i<=num; i++)                     // for(initialization; condition; increment/decrement)
         {
             if(num%i==0)                               // If condition only allows i which returns 0 as remainder after num / i (i.e., num%i == 0)
             {
                 count++;                               // count(1,29) = 2
             }
         }
         if(count == 2)                                 // If condition true i.e., 2 == 2                              
         {                                              // If block Executed
            System.out.println(num + " is a prime number"); // 29 is a prime number
         }
         else                                                   // Doesn't enter into else block
         {
            System.out.println(num + " is not a prime number"); // else block not executed
         }
         
 
     }
     
 }



 /*
    output:
    Enter a number: 29
    29 is a prime number
  */