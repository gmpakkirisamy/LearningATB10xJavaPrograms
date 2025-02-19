package Java_Basic_Concepts.ex_16_Feb1st_excercise;

import java.util.Scanner;

public class Lab_75_categorize_website {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the URL!");
        String url = sc.nextLine();

        int lastDotIndex = url.lastIndexOf(".");
        String tld = url.substring(lastDotIndex+1);

        String websiteType;
        switch(tld){
            case "com":
                websiteType ="Commercial";
                break;

            case "org":
                websiteType = "Organisation";
                break;

            case "edu":
                websiteType = "Education";
                break;

            case "gov":
                websiteType = "Goverment";
                break;

            case "net":
                websiteType = "Network";
                break;

            case "mil":
                websiteType = "Millitary";
                break;

            default:
                websiteType = " Other or Unknown";
                break;

        }
        System.out.println(websiteType);

    }
}
