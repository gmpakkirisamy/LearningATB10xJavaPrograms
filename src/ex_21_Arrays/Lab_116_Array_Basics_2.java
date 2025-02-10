package ex_21_Arrays;

import java.util.Arrays;

public record Lab_116_Array_Basics_2() {
    public static void main(String[] args) {
        int [] marks = {58,56,53,54,55};
        System.out.println(marks.length);
        for (int i = 0; i < marks.length; i++) {
            System.out.println(marks[i]);
        }
        Arrays.sort(marks);

    }
}
