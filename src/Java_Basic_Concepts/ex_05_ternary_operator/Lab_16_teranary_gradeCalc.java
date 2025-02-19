package Java_Basic_Concepts.ex_05_ternary_operator;

public class Lab_16_teranary_gradeCalc {
    public static void main(String[] args) {
        int score = 69;

        String result = (score<=59 ? "Your Grade is F" : (score>=90 ? "Your Grade is A" : (score>=80 ? "Your Grade is B" :(score>=70 ? "Your Grade is C " : "Your Grade is D"))));
        System.out.println(result);
    }
}
