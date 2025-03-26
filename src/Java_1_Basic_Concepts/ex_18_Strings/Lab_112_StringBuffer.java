package Java_1_Basic_Concepts.ex_18_Strings;

public class Lab_112_StringBuffer {
    public static void main(String[] args) {

        StringBuffer string = new StringBuffer("Samy");
        string.append("Pakkiri");
        System.out.println(string);
        string.reverse();
        System.out.println(string);

        //This will be one string created in the scp. Less memory
    }
}
