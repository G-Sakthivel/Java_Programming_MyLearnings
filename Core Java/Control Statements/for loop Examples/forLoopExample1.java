/*
Write a program to print "Hello Mahi" 7 times.
 */

public class forLoopExample1 {
    public static void main(String[] args) {
        for(int i=1; i<=7; i++){                // for(variable initialization, condition, increment/decrement)
            System.out.println("Hello Mahi");   // print "Hello Mahi" 7 times
        }
    }
}

/*
output:
Hello Mahi  // i=1; 1<=7; 1++
Hello Mahi  // i=2; 2<=7; 2++
Hello Mahi  // i=3; 3<=7; 3++
Hello Mahi  // i=4; 4<=7; 4++
Hello Mahi  // i=5; 5<=7; 5++
Hello Mahi  // i=6; 6<=7; 6++
Hello Mahi  // i=7; 7<=7; 7++       // condition becomes false after this iteration
                                    //when i=8; 8<=7 return false
 */
