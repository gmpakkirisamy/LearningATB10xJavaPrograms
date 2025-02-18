package Java_Concepts.ex_32_Abstraction;

public class Lab_183_WagonR_example {
    public static void main(String[] args) {

        WagonR car1 = new WagonR();
        car1.startDrive();
        System.out.println("Am Driving!");
        car1.stopDrive();

    }
}

abstract class Vehicle1 {
    abstract void startDrive();

    abstract void stopDrive();
}

class WagonR extends Vehicle1 {

    @Override
    void startDrive() {
        System.out.println("Start");
    }


    @Override
    void stopDrive() {
        System.out.println("Stop");

    }
}