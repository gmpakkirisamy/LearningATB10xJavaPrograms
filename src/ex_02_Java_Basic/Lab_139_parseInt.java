package ex_02_Java_Basic;

public class Lab_139_parseInt {
    public static void main(String[] args) {
        String age = "25";
        String age2 = "25";
        System.out.println(age+age2);

        int age3 = Integer.parseInt(age); //Converting string input into Integer
        int age4 = Integer.parseInt(age2); //Converting string input into Integer

        System.out.println(age3+age4);


    }
}
