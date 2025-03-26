package Java_3_Core_Concepts.ex_40_Exceptions;

public class Lab_233_throw_example_2 {


    static void validate_age(int age) {
        if(age<18){
            try {
                throw new Exception("Age cannot be less than 18");
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
    }

    public static void main(String[] args) {

        validate_age(18); // Since this is the static method. This is available in class loader. So we can give input directly without
        //creating the object reference

    }
}


