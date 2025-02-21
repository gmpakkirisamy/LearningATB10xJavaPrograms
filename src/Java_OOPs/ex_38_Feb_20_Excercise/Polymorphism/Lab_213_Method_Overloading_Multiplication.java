package Java_OOPs.ex_38_Feb_20_Excercise.Polymorphism;

public class Lab_213_Method_Overloading_Multiplication {
    public static void main(String[] args) {

        multiplyOperation muls = new multiplyOperation();
        muls.multiply();
        int r = muls.multiply(10);
        System.out.println(r);

       int z = muls.multiply(10,20);
        System.out.println(z);

        int y = muls.multiply(10,20,30);
        System.out.println(y);
    }
}

class multiplyOperation {

    void multiply () {
        System.out.println("Am return nothing.");
    }
    int multiply (int a) {
        return a;
    }
    int multiply(int a, int b) {
        return a*b;
    }

    int multiply(int a, int b, int c) {
         return a*b*c;
    }


}