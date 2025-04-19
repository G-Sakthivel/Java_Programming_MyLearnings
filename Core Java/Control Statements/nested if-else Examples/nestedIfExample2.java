/*
Write a program to check whether the given input is alphabet or not,
if it is alphabet then check it is vowel or not?
 */

import java.util.Scanner;                       // Import Scanner Class
public class nestedIfExample2 {
    public static void main(String [] args)
    {
        Scanner scn = new Scanner(System.in);   // Create a Scanner object
        System.out.print("Enter any Input: ");
        char input = scn.next().charAt(0);      // Read input user, i.e., input = A
        if((input>='A' && input<='Z')||(input>='a' && input<='z'))  // Outer If condition true
        {                                       // Outer If block executed
            if(input=='a'||input=='e'||input=='i'||input=='o'||input=='u'||input=='A'||input=='E'||input=='I'||input=='O'||input=='U')  // Inner If condition true
            {                                   // Inner If block executed
                System.out.println("Given alphabet "+input+" is Vowel");
            }
            System.out.println("Given input is alphabet");  // Outer If Block Executed
        }
    }
}
