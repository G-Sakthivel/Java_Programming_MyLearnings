/*
Write a program to print all the multiples of 8 from 101 to 301 in the reverse order
 */

public class forLoopExample7 {
    public static void main(String[] args) {
        for(int i=301; i>=101; i--) {
            if(i%8==0){
                System.out.println(i);      // If condition only allows the multiples of 8 to print in output
            }
        }
    }
}

/*
output:
296
288
280
272
264
256
248
240
232
224
216
208
200
192
184
176
168
160
152
144
136
128
120
112
104
 */
