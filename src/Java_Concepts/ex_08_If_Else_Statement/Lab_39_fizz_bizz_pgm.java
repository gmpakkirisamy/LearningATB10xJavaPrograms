package Java_Concepts.ex_08_If_Else_Statement;

public class Lab_39_fizz_bizz_pgm {
    public static void main(String[] args) {
        //Write a program that prints numbers from 1 to 100.
        // However, for multiples of 3, print "Fizz" instead of the number,
        // and for multiples of 5, print "Buzz." For numbers that are multiples
        // of both 3 and 5, print "FizzBuzz."
        //(for loop, if else)
//        System.out.println("Enter the valid inputs!");
//        Scanner sc = new Scanner(System.in);
//        int num = sc.nextInt();
        for(int i=1; i<=100; i++) {
            if(i%3==0) {
                System.out.println("Fizz");
            }
            else if (i%5==0) {
                System.out.println("Bizz");
            }
            else {
                System.out.println(i);
            }
        }

    }
}
