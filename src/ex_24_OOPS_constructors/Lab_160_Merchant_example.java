package ex_24_OOPS_constructors;

public class Lab_160_Merchant_example {
    public static void main(String[] args) {

        supermarket dmart = new supermarket("Dmart", 1455, "RR Nagar");
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


    }
}

class supermarket {
    String company;  //Attributes creation
    int share;
    String location;

    supermarket(String company_name, int share_price, String location_in) {
        this.company = company_name;
        this.share = share_price;
        this.location = location_in;
    }

    supermarket() {
        System.out.println("Am the default constructor!!!!!!!");
    }
}
