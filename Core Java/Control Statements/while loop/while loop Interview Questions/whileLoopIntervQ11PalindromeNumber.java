/*
* Write a program to check whether the given number is palindrome or not
*/

/*
    Palindrome Concept:
    This Java program checks whether a given string or number is a palindrome.
    It takes user input, reverses it, and then compares it with the original input.
    If both are the same, it prints that the input is a palindrome; otherwise, it prints that it is not a palindrome.
 */


import java.util.Scanner;                           // Import Scanner Class
public class whileLoopIntervQ11PalindromeNumber 
{
   public static void main(String[] args) 
   {
       Scanner scn = new Scanner(System.in);        // Create a Scanner object
       System.out.print("Enter a number: ");
       int num = scn.nextInt();                     // Read user input, i.e., num = 143
       int rem = 0;                                 // Assign rem/remainder = 0
       int rev = 0;                                 // Assign rev/reverse = 0
       int copy = num;                              // Take a copy of num
       while(num>0)                                 // while(condition), i.e., num > 0
       {
           rem = num % 10;                         
           rev = rev * 10 + rem;                    // print a number in reverse --> 1st iteration: (rev = 0 * 10 + 1) = 1 --> 2nd iteration: (rev = 1 * 10 + 3) = 13 --> 3rd iteration: (rev = 13 * 10 + 1) = 131
           num = num / 10;
       }
       
       System.out.println("Given number = "+copy);  // Given number = 143
       System.out.println("Reversed number = "+rev);// Reversed number = 341

       if(copy == rev)                              // If condition true, i.e., 131 = 131
       {
        System.out.println("Number is palindrome"); // Number is palindrome
       }
       else                                        
       {
        System.out.println("Number is not palindrome");
       }
   
   }
}



/*
    output:
    Enter a number: 131
    Given number = 131
    Reversed number = 131
    Number is palindrome
*/

