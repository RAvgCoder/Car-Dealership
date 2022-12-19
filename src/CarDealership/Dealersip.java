package CarDealership;

import LoginAuthenticator.Login;

import java.util.Scanner;

public class Dealersip extends Vehicles{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Admin admin = new Admin();
        Customer customer  = new Customer();
        Vehicles vehicles = new Vehicles();
        boolean choosen = true;


        //Login/Home Page
        Login.login(input);



        //Customer input details
        System.out.print("What is your name: ");
        customer.setName(input.nextLine());
        System.out.print("Input your address: ");
        customer.setAddress(input.nextLine());
        System.out.print("Input amount of cash on hand: ");
        customer.setCashOnHand(input.nextDouble());

        //Loops till inputs is right
        while (choosen){
            System.out.println("Do you have a vehicle in mind or do you want to browse our selection\nBrowse Selection: 1     Find your vehicle: 2");
            int vehicle  = input.nextInt();
            if  (vehicle == 1){

                choosen = false;
            } else if (vehicle == 2) {

                choosen = false;
            }else {
                System.out.println("Please select from the options above");
            }

        }

//        System.out.println(vehicles.setVehicles_Price());
    }

    public static boolean homePage(Scanner input) {
        boolean admin = true;
        boolean adminAns = true;
        System.out.println("        Welcome to Ralph's Car Dealership");

        while (adminAns) {
            System.out.println("Login as Admin: Y / N: ");
            String userAns = input.nextLine().toUpperCase();
            if (userAns.equals("Y")) {

                adminAns = false;
            } else if (userAns.equals("N")) {
                adminAns = false;
            } else {
                System.out.println("Choose from input");
            }
        }

        return  true;
    }

    public static void customer(Customer customer) {

    }

}




        /**
         * handleCustomer (Customer cust,  boolean finance, Vehivle)
         * if (finance==true){
         *     runCredHistory(Customer cust, double double Amount)
         * }esle{
         *      if (vehicle.getprice() <= cusrt.getCashOnHond){
         *          processsTransactoin(Customer cust, Vehcle, Vehicle)
         *      }else{
         *          sout(more cash);
         *      }
         * }
         *
          */
