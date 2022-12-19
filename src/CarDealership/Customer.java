package CarDealership;

public class Customer {
    private String name;
    private String address;
    private double cashOnHand;


    public String getName() {
        return name;
    }

    public double getCashOnHand() {
        return cashOnHand;
    }

    public String getAddress() {
        return address;
    }

    public void setName (String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setCashOnHand(double cashOnHand) {
        this.cashOnHand = cashOnHand;
    }


}
