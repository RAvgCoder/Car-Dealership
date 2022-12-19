package LoginAuthenticator;

import CarDealership.Admin;

import java.util.Scanner;

public class Login {

    public static void login (Scanner input) {
        Admin admin = new Admin();
        boolean clearanceAns = true;
        String []loginDets; // Username/passs


        System.out.println("/////////////////////////////////////////////////////");
        System.out.println("///////   Welcome to Ralph's Car Dealership   ///////");
        System.out.println("/////////////////////////////////////////////////////");

        //Loops till user hits correct option
        while (clearanceAns) {
            System.out.print("Are you an Admin or a User: ");
            String userAns = input.nextLine().toLowerCase();
            if (userAns.equals("admin")) {
                loginDets =  credentials(input).split(" ");
                admin.setName(loginDets[0]);
                admin.setPassword(loginDets[1]);

                clearanceAns = false;
            } else if (userAns.equals("user")) {
                loginDets =  credentials(input).split(" ");
                //TODO user login
                clearanceAns = false;
            } else {
                System.out.println("Choose from options available");
            }
        }

    }

    //Gets user credentials
    private static String credentials(Scanner input) {

        System.out.print("Input your name: ");
        String name = input.nextLine();
        System.out.print("Input your password: ");
        String password = input.nextLine();

        return name + " " + password;
    }
}
