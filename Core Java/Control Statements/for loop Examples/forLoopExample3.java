/*
Write a program to print the numbers from 5 to 1 in the reverse order
 */

public class forLoopExample3 {
    public static void main(String[] args) {
        for(int i=5; i>=1; i--) {
            System.out.println(i);
        }
    }
}


/*
output:
5       // i=5; 5>=1; 5--
4       // i=4; 4>=1; 4--
3       // i=3; 3>=1; 3--
2       // i=2; 2>=1; 2--
1       // i=1; 1>=1; 1--       // condition becomes false after this iteration
 */                             // when i=0; 0>=1 returns false
