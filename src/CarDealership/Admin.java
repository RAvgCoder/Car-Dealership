package CarDealership;

import javax.swing.plaf.IconUIResource;
import java.beans.DesignMode;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Admin {
    Scanner input = new Scanner(System.in);
    Vehicles vehicles = new Vehicles();
    Map<String, String> employees =  new HashMap<>();
    String name;
    String password;

    private final String clearanceID = "PlayBoy2045";



    public void setName(String name) {
        this.name = name;
    }


    public void setPassword(String password) {
        this.password = password;
        employeeValidation();
    }


    private void employeeValidation () {
        int loginTryCount = 3;
        System.out.println("///////////////////////////////");
        System.out.println("///////   Admin Login   ///////");
        System.out.println("///////////////////////////////");
        while (loginTryCount <3) {
            if (employees.get(name) == null) {
                System.out.println("User not found in Database\n Do you wish to add sign up or go back to login page");
                System.out.println("Sign-Up: S        Go back: B");
                String choice = input.nextLine().toUpperCase();

                if (choice.equals("S")) {
                    System.out.println("Input clearance ID");
                    String ID = input.nextLine().toUpperCase();
                    if (ID.equals(clearanceID)) {

                    }
                } else {

                }
            }
        }
    }


    //Inputs cars and price
    private void setCars (String name, double amount) {
        vehicles.setVehicles_Price(name, amount);
    }
}
