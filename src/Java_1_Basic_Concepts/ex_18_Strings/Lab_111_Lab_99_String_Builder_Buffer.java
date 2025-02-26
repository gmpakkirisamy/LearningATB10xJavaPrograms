package Java_1_Basic_Concepts.ex_18_Strings;

public class Lab_111_Lab_99_String_Builder_Buffer {
    public static void main(String[] args) {

        // StringBuilder and StringBuffer in Java - This are the new type of creating the string
        // Even after editing the string it will not create the new location.
        // StringBuilder and StringBuffer in Java
        //StringBuilder will execute parallel so it is not thread safe (there may be chance of losing string)
        //StringBuffer will execute one by one so it is the thread safe (there is no possibility of losing string).
        //But comparably it will be slow in execution since it is executing one by one.

        StringBuilder sb = new StringBuilder("Pakkiri");
        sb.append("Samy");
        System.out.println(sb.toString());
        //This will be one string created in the scp. Less memory

        //Older Method
        String s1 = "Pakkiri";
        String s2 = "Samy";
        String s3 = s1+s2;
        System.out.println(s3);
        //This will three one string created in the scp. More memory
    }
}
