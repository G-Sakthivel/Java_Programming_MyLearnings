/*
Write a program to print the sum of all numbers from 1 to n
 */

import java.util.Scanner;                       // Import Scanner Class
public class forLoopExample8 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);   // Create a Scanner Object
        System.out.print("Enter n: ");
        int n = scn.nextInt();                  // Read user input, i.e., n = 5
        int sum=0;
        for(int i=1; i<=n; i++)
        {
            sum= sum + i;                       // sum = 15
        }
        System.out.println("sum = "+sum);
    }
}

/*
output:
Enter n: 5   // 1 + 2 + 3 + 4 + 5
sum = 15
 */
