/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solutions
 *  Copyright 2021 Gabriel Martin
 */

package baseline;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solution42 {
    private final File data = new File("data/exercise42_input.txt");
    public static void main(String[] args) {
        ParseCSV csv = new ParseCSV();
        csv.separatedData = csv.separateData();
        csv.lastNames = csv.createLastNameArray();
        csv.firstNames = csv.createFirstNameArray();
        csv.salaries = csv.createSalaryArray();
        csv.outputEmployees();
    }

    public List<String> getFileData() {
        ArrayList<String> sArray = new ArrayList<>();
        try {
            //create a buffered reader insider a try/catch block
            try (Scanner sc = new Scanner(data)) {
                //while the next line is not null
                while (sc.hasNextLine()) {
                    //store that line in the String array
                    sArray.add(sc.nextLine());
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        //return the created String array
        return sArray;
    }
}
