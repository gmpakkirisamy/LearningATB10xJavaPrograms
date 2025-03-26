package Java_1_Basic_Concepts.ex_21_Arrays;

public class Lab_115_Array_Basics {
    public static void main(String[] args) {

        //Array is the collection of data which is in similar type
        //Array is also called as homegeneous data structure
        // Elements of the array will be stored in contiguous memory location
        //Index will start from 0,1,2,3,.......

        //First Method
        int [] marks = {90, 91, 92, 92, 94}; // These are the predefined elements

        System.out.println(marks.length); // It will print the total lenght of the  array
        System.out.println(marks[0]); // It will print the element /value of the 0th index in an array

        // Second Method
        int [] marks2 = new int[5]; // In this array size is fixed to 5

        marks2[0] = 10;
        marks2[1] = 23;
        marks2[2] = 24;
        System.out.println(marks2[3]); // Default value will be printed
        System.out.println(marks2[0]);
       // System.out.println(marks2[6]); // ArrayIndexOutOfBoundException

        String [] names = {"Samy", "Pakkiri", "M"};

        String [] names2 = new String[3]; // Another method
        names2[0] = "Pakkiri";
        names2[1] = "Samy";
        names2[2] = "M";

        System.out.println("Length : "+names2.length);
        System.out.println(names2[2]);

        boolean [] is_male = new boolean[4];
        is_male[0] = true;
        is_male[1] = false;
    }
}
