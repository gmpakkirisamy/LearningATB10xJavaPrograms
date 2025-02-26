package Java_1_Basic_Concepts.ex_06_how_get_inputs;

public class Lab_22_commanline_inputs {
    public static void main(String[] args) {
        // Take input from the CLI Command Line Intputs

        String age_string = args[0]; // This is the default statement to get value from the command line
        int age = Integer.parseInt(age_string); // Here we are converting the string value to Interger value
                                                // Using this statement
        System.out.println(age);
        //How to Feed Input:
        //1. Click down arrow in the Current File
        //2. Click Edit Configuration
        //3. Enter the values in the program arguments

    }
}
