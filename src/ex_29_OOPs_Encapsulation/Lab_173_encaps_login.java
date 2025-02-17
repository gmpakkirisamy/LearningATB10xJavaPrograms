package ex_29_OOPs_Encapsulation;

public class Lab_173_encaps_login {
    public static void main(String[] args) {
        wlogin log1 = new wlogin("Admin",123);
        System.out.println(log1.password);  // This can be seen by anyone
        log1.password = 678; // Also this can be changed by other people. So we are going to the encapsulation concept.
        System.out.println(log1.password);

        goodEncapLogin gd1 = new goodEncapLogin("Admin", "samy");
        // System.out.println(gd1.username); - We cannot access or modify the username because we marked as private in the class
        // So this username will be accessible within the class and not outside the class.

        // If you want to change the username to change at least. Use the getter setter method to change the access. Instead of marking
        //the parameters to public. This is way to do the encapsulation, actually.
        boolean isAdmin = true; // Its not necessary to set here
        gd1.setPassword("Samy", false); // This is the setter method in encapsulation to set the password or username. You cannot access them directly
        System.out.println(gd1.getPassword()); // Even to view the password you have to use the getter function to view it. You cannot access it directly.
    }
}

class wlogin {
    String username;
    int password;

    wlogin(String username_c, int password_c) {
        this.username = username_c;
        this.password = password_c;
    }
}

class goodEncapLogin {
    private String username;           // You have to create the username and password with private for encapsulation.
    private String password;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password, boolean isAdmin) { // We are setting the admin check here to change the password.
        if(isAdmin) {
            this.password = password;
        }
        else {
            System.out.println("You are not a admin, so you cant able to change the password!");
        }
    }

    goodEncapLogin(String username_c, String password_c) {
        this.username = username_c;
        this.password = password_c;
    }
}


