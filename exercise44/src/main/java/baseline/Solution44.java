/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solutions
 *  Copyright 2021 Gabriel Martin
 */
package baseline;

import com.google.gson.Gson;

import java.io.FileReader;
import java.util.Scanner;

public class Solution44 {
    Inventory inventory;
    private static final Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        Solution44 solution = new Solution44();
        //get the product the user wants
        String userItem = solution.getProductName();
        //parse the json data
        solution.getJSONData();

        //tells the user if they entered the right data or if they need to give a new item
        solution.checkInventory(userItem);
    }

    public String getProductName() {
        //prompt for object name from the user
        System.out.print("What is the name of the product? ");
        //returns the name
        return input.next();
    }

    public void getJSONData() {
        //in a try block
        try {
            //create gson object
            Gson gson = new Gson();
            //assign inventory to hold the gson parsed data
            inventory = gson.fromJson(new FileReader("data/exercise44_input.json"), Inventory.class);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void checkInventory(String userItem) {
        //checks if the item the user asked for exists

            //if it does
        try {
            for(int i = 0;i < inventory.products.size();i++) {
                if (inventory.products.get(i).getName().equals(userItem)) {
                    System.out.println("Name: " + inventory.products.get(i).getName());
                    System.out.printf("Price: %.2f", inventory.products.get(i).getPrice());
                    System.out.println("\nQuantity: " + inventory.products.get(i).getQuantity());

                    return;
                }
            }

            throw new IllegalArgumentException();

        } catch (Exception e) {
                System.out.println("Sorry, that is not a valid input.");
                input.nextLine();
                userItem = getProductName();
                checkInventory(userItem);
        }
    }
}
