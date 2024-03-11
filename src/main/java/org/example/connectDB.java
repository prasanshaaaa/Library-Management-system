package org.example;

public class connectDB {
    String name;
    double price;
    int quantity;
    public connectDB ( String name, double price, int quantity) {

        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {double price = 0;
        return (int) price;
    }

    public void setPrice(double price1) {this.price = price;}

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity1) {
        this.quantity = quantity1;
    }

}