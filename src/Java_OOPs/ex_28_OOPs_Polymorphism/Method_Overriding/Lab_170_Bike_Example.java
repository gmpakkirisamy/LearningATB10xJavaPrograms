package Java_OOPs.ex_28_OOPs_Polymorphism.Method_Overriding;

public class Lab_170_Bike_Example {
    public static void main(String[] args) {

        Father1 f1 = new Father1();
        f1.bike();
        System.out.println("-------------------------------------");

        Son1 s1 = new Son1();
        s1.Son1Bike();
        System.out.println("-------------------------------------");

        Son2 s2 = new Son2();
        s2.bike();
        System.out.println("-------------------------------------");

        Son3 s3 = new Son3();
        s3.bike();
        System.out.println("-------------------------------------");
    }
}

class Father1 {
    void bike() {
        System.out.println("I have a Splendor Bike !");
    }
}

class Son1 extends Father1 {
    void Son1Bike() {
        bike();
    }
}

class Son2 extends Father1 {
    @Override
    void bike() {
        System.out.println("Am overriding fathers splendor bike and buying new Yamaha SS125cc");
    }
}

class Son3 extends  Father1 {
    @Override
    void bike() {
        System.out.println("Am overriding fathers splendor bike and buying new Yamaha FZ");
    }
}
