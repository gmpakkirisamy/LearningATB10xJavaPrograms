package ex_27_OOPs_Inheritance.ex_02_Multilevel_Inheritance;

public class Lab_164_GF_Father_Son {
    public static void main(String[] args) {

        Son samy = new Son();

        samy.home(); // Now son class can access all the properties of Grandfather and father.
        samy.fl();
        samy.home2();
        samy.home3();
    }
}
