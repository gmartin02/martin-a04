/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solutions
 *  Copyright 2021 Gabriel Martin
 */
package baseline;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ParseCSV {
    protected List<String> separatedData = new ArrayList<>();
    protected List<String> lastNames = new ArrayList<>();
    protected List<String> firstNames = new ArrayList<>();
    protected List<String> salaries = new ArrayList<>();

    public List<String> separateData() {
        Solution42 solution = new Solution42();
        List<String> notSeparatedData = solution.getFileData();

        //loop through the size of the list
        for(int i = 0;i < notSeparatedData.size(); i++) {
            //everytime  you see a comma spit the String and
            // store it to a local variable to be added to separatedData
            String[] s = notSeparatedData.get(i).split(",");
            separatedData.addAll(Arrays.asList(s));
        }
        return separatedData;
    }

    public List<String> createLastNameArray() {
        //loop through the length of the array
        for(int i = 0;i < separatedData.size(); i+=3) {
            //get the first element and skip two each time
            //add the last names to a last name array list
            lastNames.add(separatedData.get(i));
        }
        return lastNames;
    }

    public List<String> createFirstNameArray() {
        //loop through the length of the array
        for(int i = 1;i < separatedData.size(); i+=3) {
            //get the second element and skip two each time
            //add the first names to a last name array list
            firstNames.add(separatedData.get(i));
        }
        return firstNames;
    }

    public List<String> createSalaryArray() {
        //loop through the length of the array
        for(int i = 2;i < separatedData.size(); i+=3) {
            //get the third element and skip two each time
            //add the salaries to a last name array list
            salaries.add(separatedData.get(i));
        }
        return salaries;
    }


    public void outputEmployees() {
        //create a buffered writer
        try {
            //create a buffered reader insider a try/catch block
            try (BufferedWriter bw = new BufferedWriter(new FileWriter("data\\exercise42_output.txt"))) {
                bw.write("Last      First     Salary");
                bw.write("\n--------------------------------\n");
                //for loop through the length of the list
                for(int i = 0;i < lastNames.size(); i++) {
                    //print out each last, first, and salary and then a new line
                    String space = "%-10s";
                    bw.write(String.format(space, lastNames.get(i)) + String.format(space, firstNames.get(i)) + String.format(space, salaries.get(i)) + "\n");

                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
