package Java_1_Basic_Concepts.ex_03_Literals;

public class Lab08_Literal_Character {
    public static void main(String[] args) {
        char c1 = 'S';
        char new_line = '\n'; // text will start in new line
        char tab_line = '\t'; // it will give tab space between the text
        char back_space = '\b'; // it will remove the last character and print
        char carriage_return = '\r'; //it will truncate the first letter

        System.out.println("Pakkiri" + new_line + "Samy");
        System.out.println("Pakkiri" + tab_line + "Samy");
        System.out.println("Pakkiri" + back_space + "Samy");
        System.out.println("Pakkiri" + carriage_return + "Samy");

        //ASCII (limited numbers as alphabets american standard
        //UNICODE (smilies, other characters othern than alphabets)
    }
}
