package Java_OOPs.ex_28_OOPs_Polymorphism.Method_Overriding;

public class Lab_169_Method_Overriding_example2 {
    public static void main(String[] args) {

        TC1 tc1 = new TC1();
        tc1.OpenBrowser();

        TC2 tc2 = new TC2();
        tc2.OpenBrowser();

    }
}

class CommonTCtoAll {

    void OpenBrowser() {
        System.out.println("Open the browser in 10 seconds !");
    }

}

class TC1 extends CommonTCtoAll {
    void startTC() {
        OpenBrowser();
    }
}

class TC2 extends CommonTCtoAll {
    @Override
    void OpenBrowser() {
        System.out.println("Open the browser in 5 seconds !");
    }
}

