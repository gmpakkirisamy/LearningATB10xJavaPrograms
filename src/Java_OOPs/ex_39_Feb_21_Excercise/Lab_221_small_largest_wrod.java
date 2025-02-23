package Java_OOPs.ex_39_Feb_21_Excercise;

public class Lab_221_small_largest_wrod {
    public static void main(String[] args) {
        String input = "vision without action is day dream";
        String[] words = input.split(" ");

        String smallest = words[0];
        String largest = words[0];

        for (String word : words) {
            if (word.length() < smallest.length()) {
                smallest = word;
            }
            if (word.length() > largest.length()) {
                largest = word;
            }
        }

        System.out.println("Smallest string: \"" + smallest + "\"");
        System.out.println("Largest string: \"" + largest + "\"");
    }
}
