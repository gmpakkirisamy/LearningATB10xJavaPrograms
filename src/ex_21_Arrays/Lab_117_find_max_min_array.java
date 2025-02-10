package ex_21_Arrays;

public class Lab_117_find_max_min_array {
    public static void main(String[] args) {
        int[] array = {1, 5, 3, 6, 8, 9, 7, 4, 5, 2};

        int max_output = give_max(array);
        System.out.println(max_output);

        int min_output = give_min(array);
        System.out.println(min_output);


    }
    static int give_max(int[] array) {
        int max = array[0];

        for (int i = 0; i < array.length; i++) {

            if(array[i]>max){
                max = array[i];
            }

        }
        return max;
    }

    static int give_min(int[] array){
        int min = array[0];
        for (int i = 0; i < array.length ; i++) {
            if(array[i]<min) {
                min = array[i];
            }

        }
        return min;
    }
}