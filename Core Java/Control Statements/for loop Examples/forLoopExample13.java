/*
Write a program to print the sum of all the multiples of 7 from range(n1) to range(n2)
 */


import java.util.Scanner;                       // Import Scanner Class
public class forLoopExample13
{
    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);   // Create a Scanner Object
        System.out.print("Enter range n1: ");
        int n1  = scn.nextInt();                // Read user input, i.e., n1 = 20
        System.out.print("Enter range n2: ");
        int n2 = scn.nextInt();                 // Read user input, i.e., n2 = 50
        int sum=0;
        for(int i=n1;i<=n2;i++)
        {
            if(i%7==0)                          // If condition only allows multiples of 7 inside it
            {
                sum = sum + i;                  // sum = 21 + 28 + 35 + 42 + 49 --> 175
            }
        }
        System.out.println("Sum of all the multiples of 7 from "+n1+" to "+n2+": "+ sum);
    }
}


/*
output:
Enter range n1: 20
Enter range n2: 50
Sum of all the multiples of 7 from 20 to 50: 175
 */
