package Java_Basic_Concepts.ex_18_Strings;

public class Lab_86_string_scp_vs_object {
    public static void main(String[] args) {
        char c = 'A';
        System.out.println(c); // Primitive data type

        String s1 = "Pakkiri";
        System.out.println(s1.length()); // Shows the length of the string
        System.out.println(s1.toLowerCase()); // Converts the string to lowercase
        System.out.println(s1.toUpperCase()); // Converts the string to uppercase
        System.out.println(s1.charAt(0)); // Returns the character at the specified index
        System.out.println(s1.indexOf('i'));   //  Returns the index of the first occurrence of the specified character
        System.out.println(s1.lastIndexOf('i'));// Returns the index of the last occurrence of the specified character
        System.out.println(s1.indexOf('i', 2));
        System.out.println(s1.concat("Samy"));

    }
}
