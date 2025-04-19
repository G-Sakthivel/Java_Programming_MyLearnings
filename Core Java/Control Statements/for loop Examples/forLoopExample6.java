/*
Write a Program to print all the multiples of 6 from 1 to n
 */

import java.util.Scanner;                       // Import Scanner Class
public class forLoopExample6 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);   // Create a Scanner Object
        System.out.print("Enter n: ");
        int n = scn.nextInt();                  // Read user input, i.e., n = 60
        for(int i=1; i<=n; i++){
            if(i%6==0){
                System.out.println(i);          // If condition only allows the multiples of 6 to print in output
            }
        }
    }
}

/*
output:
6
12
18
24
30
36
42
48
54
60
 */