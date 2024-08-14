import java.util.*;
public class java_2D_Array
{
    public static void main(String [] args){

//Initialization of 2D array
        char[][] array_2d =new char[3][3];
//assigning - value to all the positions of a 2d array using nested for loop
        for (int i=0;i<3;i++){
            for (int j=0;j<3;j++){
                array_2d[i][j] = '-';
            }
        }

        array_2d[0][0] = '0';
        array_2d[1][0] = '0';
        array_2d[2][0] = '0';

// creation of 2d array dynamically

 //       char[][] dynamic_2d_array = {{'x','-','-'},{'x','-','-'},{'x','-','-'}};
    //or alternatively by creating object
        char[][] dynamic_2d_array = new char[][]{
                new char[]
                        {'x', '-', '-'},
                        {'x', '-', '-'},
                        {'x', '-', '-'}

                };


        System.out.println(Arrays.deepToString(array_2d));
        System.out.println(Arrays.deepToString(dynamic_2d_array));

    }
}

//Example for 2D 3*3 array = "Tic Tac game"
