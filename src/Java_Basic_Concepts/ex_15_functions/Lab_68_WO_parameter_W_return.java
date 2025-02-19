package Java_Basic_Concepts.ex_15_functions;

public class Lab_68_WO_parameter_W_return {
    public static void main(String[] args) {

        //Without Parameters but with Return Type

       String str = greet_message(); // Since this method is returng the string so we are storing the string then printing
       System.out.println(str);

       int num = greet_number();
        System.out.println(num);
    }

    static String greet_message() {
        return "Am returing something here";
    }

    static int greet_number(){
        return 18;
    }

}
