package Java_OOPs.ex_39_Feb_21_Excercise;

public class Lab_218_Method_Overriding {
    public static void main(String[] args) {

        geminai gem1 = new geminai();
        gem1.mainf();
        gem1.annoncement();
        gem1.remainders();
    }
}

class Alexa {
    void annoncement (){
        System.out.println("Am Alexa, I will make an announcement");
    }

    void remainders () {
        System.out.println("Am Alex, I will make an Remainders");
    }
}

class geminai extends Alexa {
    void mainf () {
        System.out.println("Am the original fucntion from geminai");
    }

    @Override
    void annoncement() {
        System.out.println("Am Geminai, I will make an announcement. This is override function");
    }

    @Override
    void remainders() {
        System.out.println("Am Geminai, I will make an remainders. This is override function");
    }
}