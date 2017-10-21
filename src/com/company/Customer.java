package com.company;


public class Customer {
    String customerName;
    String customerPhone;
    String customerAddress;
    double squareFootage;

    public Customer(String customerName, String customerPhone, String customerAddress, double squareFootage) {
        this.customerName = customerName;
        this.customerPhone = customerPhone;
        this.customerAddress = customerAddress;
        this.squareFootage = squareFootage;
    }

    public Customer() {

    }


    public String getCustomerName() {
            return customerName;
        }

        public void setCustomerName(String customerName) {
            this.customerName = customerName;
        }

        public String getCustomerPhone() {
            return customerPhone;
        }

        public void setCustomerPhone(String customerPhone) {
            this.customerPhone = customerPhone;
        }

        public String getCustomerAddress() {
            return customerAddress;
        }

        public void setCustomerAddress(String customerAddress) {
            this.customerAddress = customerAddress;
        }

        public double getSquareFootage() {
            return squareFootage;
        }

        public void setSquareFootage(double squareFootage) {
            this.squareFootage = squareFootage;
        }

    public void PrintCustomerInfo() {
        System.out.println("Customer Name: " + "\n" + customerName + "Customer Address:" + customerAddress + "Customer Phone:" + customerPhone);



    }


}
