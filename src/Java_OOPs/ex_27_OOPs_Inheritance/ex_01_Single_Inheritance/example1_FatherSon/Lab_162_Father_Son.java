package Java_OOPs.ex_27_OOPs_Inheritance.ex_01_Single_Inheritance.example1_FatherSon;

public class Lab_162_Father_Son {
    public static void main(String[] args) {

        Son samy = new Son();
        System.out.println(samy.gold);
        samy.home(); // Son class accessing the father class properties.
        samy.home2();
    }
}
