package com.company;

public class Commercial extends Customer {

    private boolean multi;
    private double charge = (squareFootage / 1000) * 5;


    public Commercial(String customerName, String customerPhone, String customerAddress, double squareFootage, boolean multi, double charge) {
        super(customerName, customerPhone, customerAddress, squareFootage);
        this.multi = multi;
        this.charge = charge;
    }

    public Commercial() {

    }


    public  void print() {
            System.out.println("Commercial Customer");
            PrintCustomerInfo();
            System.out.printf("Has Mutiple Properties:\n" + multi + "Weekly Charges:\n%s%n", charge);


    }


}
