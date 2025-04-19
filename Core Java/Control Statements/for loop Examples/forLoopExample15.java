/*
Write a program to print any tables
 */

import java.util.Scanner;                                       // Import Scanner Class
public class forLoopExample15 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);                   // Create a Scanner Object
        System.out.print("Which Table you want to print: ");
        int table = scn.nextInt();                              // Read user input, i.e., table = 5
        System.out.print("Enter range start s1: ");
        int s1 = scn.nextInt();                                 // Read user input s1 = 1
        System.out.print("Enter range end e1: ");
        int e1 = scn.nextInt();                                 // Read user input e1 = 15
        System.out.println("------- "+table+" table -------");
        for(int i=s1; i<=e1; i++)
        {
            System.out.println(table +" x "+i+ " = "+(i*table));
        }
    }
}


/*
output:
Which Table you want to print: 5
Enter range start s1: 1
Enter range end e1: 15
------- 5 table -------
5 x 1 = 5
5 x 2 = 10
5 x 3 = 15
5 x 4 = 20
5 x 5 = 25
5 x 6 = 30
5 x 7 = 35
5 x 8 = 40
5 x 9 = 45
5 x 10 = 50
5 x 11 = 55
5 x 12 = 60
5 x 13 = 65
5 x 14 = 70
5 x 15 = 75
 */