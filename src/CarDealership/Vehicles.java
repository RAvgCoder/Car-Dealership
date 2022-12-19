package CarDealership;

import java.util.*;

public class Vehicles {
    Map<String, Double> vehicles_Price = new HashMap<>();

    //Vehicles inputs
    public void setVehicles_Price (String name) {
        vehicles_Price.put("Acura Integra", 30.8);
        vehicles_Price.put("Acura MDX", 49.5);
        vehicles_Price.put("Audi A3", 20.4);
        vehicles_Price.put("Chevrolet Blazer", 42.8);
        vehicles_Price.put("Hyundai Elantra", 34.8);
        vehicles_Price.put("Hyundai Kona", 70.8);
        vehicles_Price.put("Ford F-150", 100.8);
    }

    //For admin use to input car list
    public void setVehicles_Price (String name, double amount) {
        this.vehicles_Price.put(name, amount);
    }

    //Gets price when user asks
    public double getPrice (String name) {
        return vehicles_Price.get(name);
    }

    //Checks the cars in the amount range given
    public void getNamesInRange (String amountRange) {
        String [] range = amountRange.split("-");
        int begin = Integer.parseInt(range[0]);
        int end = Integer.parseInt(range[1]);

        for (String cars: vehicles_Price.keySet()) {
            double price = vehicles_Price.get(cars);
            if ((price >= begin) && (price <= end)) {
                System.out.println(vehicles_Price.keySet());
            }
        }
    }



}
