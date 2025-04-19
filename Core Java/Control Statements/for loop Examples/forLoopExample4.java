/*
Write a program to print all the even numbers from 51 to 71 in the reverse order
 */

public class forLoopExample4 {
    public static void main(String[] args) {
        for(int i=71; i>=51; i--){
            if(i%2==0){                     // If condition only allows the even numbers to print in output
                System.out.println(i);
            }
        }
    }
}


/*
output:
70
68
66
64
62
60
58
56
54
52
 */
