package Java_OOPs.ex_29_OOPs_Encapsulation;

public class Lab_174_Bank_Example {
    public static void main(String[] args) {
        Icicibank icici = new Icicibank("Samy",100);

        //System.out.println(icici.bal); - You cannot view the balance normally. You have to view via only get method

        System.out.println(icici.getBal());

        // Now we are setting the value for balance using setter method
        boolean isCashier = true;

        icici.setBal(1000, isCashier); // We are giving the access to only cashier to change the balance using the setter method.

        System.out.println(icici.getBal());
    }
}

class Icicibank {

    private String name;
    private long bal;

    Icicibank(String name_c, long bal_c) {
        this.name = name_c;
        this.bal = bal_c;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getBal() {
        return bal;
    }

    public void setBal(long bal, boolean isCashier) {
        if(isCashier) {
            this.bal = bal;
        }
        else {
            System.out.println("You are not the cashier to update the balance");
        }
    }
}
