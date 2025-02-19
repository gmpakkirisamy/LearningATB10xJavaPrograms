package Java_OOPs.ex_33_Interface_and_Implements;

public class Lab_185_Interface_example_2 {
    public static void main(String[] args) {
        common c1 = new common();
        c1.inComMethod1();
        c1.inComMethod2();
        c1.inComMethod3();
    }
}

class common implements inter1, inter2 {

    @Override
    public void inComMethod1() {
        System.out.println("ICM Complete 1");
    }

    @Override
    public void inComMethod2() {
        System.out.println("ICM Complete 2");
    }

    @Override
    public void inComMethod3() {
        System.out.println("ICM Complete 3");
    }

}


interface  inter1 {
    void inComMethod1();
    void inComMethod2();
}

interface inter2 {
    void inComMethod3();
}
