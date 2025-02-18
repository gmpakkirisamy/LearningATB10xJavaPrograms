package Java_Concepts.ex_24_OOPS_constructors;

public class Lab_160_Merchant_example {
    public static void main(String[] args) { // Main Method

        supermarket dmart = new supermarket("Dmart", 1455, "RR Nagar"); // Object creation
        System.out.println(dmart.company);
        System.out.println(dmart.share);
        System.out.println(dmart.location);

        System.out.println("-------------------------------------------------");
        supermarket reliance = new supermarket("Reliance", 221, "PWD Road");
        System.out.println(reliance.company);
        System.out.println(reliance.share);
        System.out.println(reliance.location);

        System.out.println("-------------------------------------------------");
        supermarket more = new supermarket();

        System.out.println("-------------------------------------------------");
        dmart.display();
        reliance.display();
        more.display();

        System.out.println("-------------------------------------------------");
        int share_prc = dmart.giveMeShare();
        System.out.println(share_prc);


    }
}

class supermarket {
    String company;  //Attributes creation
    int share;
    String location;

    supermarket(String company_name, int share_price, String location_in) { // Parameterized constructor
        this.company = company_name;
        this.share = share_price;
        this.location = location_in;
    }

    supermarket() {  // Default constructor
        System.out.println("Am the default constructor!!!!!!!");
    }

    void display() {  // Method creation
        System.out.println(this.company + " - " + this.share + " - " + this.location);
    }

    int giveMeShare() {
        return this.share;
    }
}
