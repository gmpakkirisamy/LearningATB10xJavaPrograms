package Java_3_Core_Concepts.ex_40_Exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Lab_224_Exception_Checked {
    public static void main(String[] args) {
        try {
            FileInputStream fileInputStream = new FileInputStream("c://samy.txt");
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
        // Checked Exception
        //JVM knows about it, during the compilation this may lead to file not found exception. So its telling that to handle it
    }
}
