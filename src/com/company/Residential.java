package com.company;

public class Residential extends Customer {
        private boolean senior;
        private double charge = (squareFootage / 1000) * 6;

        public Residential (String customerName, String customerPhone, String customerAddress, double squareFootage, boolean senior, double charge) {
            super(customerName, customerPhone, customerAddress, squareFootage);
            this.senior = senior;
            this.charge = charge;
        }

    public Residential() {

    }

    public void print() {
            System.out.println("Residential Customer");
            PrintCustomerInfo();
            System.out.printf("Senior: \n%sWeekly Charges: \n%s%n", senior, charge);
        }
}
