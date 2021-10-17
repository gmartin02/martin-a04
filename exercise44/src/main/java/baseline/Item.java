/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solutions
 *  Copyright 2021 Gabriel Martin
 */
package baseline;

public class Item {
    //this class holds the information for each unique item
    String name;
    double price;
    int quantity;

    public String getName() {
        //gets the name of the item
        return name;
    }

    public double getPrice() {
        //gets the price of the item
        return price;
    }

    public int getQuantity() {
        //gets the quantity of the item
        return quantity;
    }
}
