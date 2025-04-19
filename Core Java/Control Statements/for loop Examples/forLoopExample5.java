/*
Write a program to print all the odd numbers from 22 to 44
 */


public class forLoopExample5 {
    public static void main(String[] args) {
        for(int i=22; i<=44; i++) {
            if(i%2!=0){                      // If condition only allows the odd numbers to print in output
                System.out.println(i);
            }
        }
    }
}


/*
output:
23
25
27
29
31
33
35
37
39
41
43
 */
