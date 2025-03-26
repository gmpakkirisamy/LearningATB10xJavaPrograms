package Java_1_Basic_Concepts.ex_21_Arrays;

public class Lab_124_2d_Array {
    public static void main(String[] args) {
        //multidimensional array
        // Arrays are stored in contiguous memory location
        //2D arrays are in matrix format

        int [][] array_2d = new int [3][3]; // Declaring the 2-dimensional array

        // declaring the value in the dimensional array
        array_2d[0][0] = 90;
        array_2d[0][1] = 91;
        array_2d[0][2] = 92;

        array_2d[1][0] = 9;
        array_2d[1][1] = 1;
        array_2d[1][2] = 2;

        array_2d[2][0] = 9;
        array_2d[2][1] = 1;
        array_2d[2][2] = 2;

        // array_2d[2][3] = 4; //ArrayIndexOutOfBoundsException

        for (int i = 0; i < array_2d.length; i++) {
            for (int j = 0; j < array_2d[i].length; j++) {
                System.out.print(array_2d[i][j]+"|");

            }
            System.out.println();

        }

    }
}
