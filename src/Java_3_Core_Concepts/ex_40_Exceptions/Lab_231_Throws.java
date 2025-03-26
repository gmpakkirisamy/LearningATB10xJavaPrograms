package Java_3_Core_Concepts.ex_40_Exceptions;

import java.io.FileInputStream;
//throws  - will be used in main method. But it's not used in automation. Just to understand this. Not recommendable
// Multiple throws can be used at single time
public class Lab_231_Throws {
    public static void main(String[] args) throws Exception {
        FileInputStream fileInputStream = new FileInputStream("C://smau.txt");
    }
}
