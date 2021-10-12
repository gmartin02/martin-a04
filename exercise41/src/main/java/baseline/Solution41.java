/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Gabriel Martin
 */
package baseline;

import java.io.*;
import java.util.*;

public class Solution41 {
    private List<String> nameList = new ArrayList<>();
    private List<String> sortedList = new ArrayList<>();
    private static final String INPUT_TXT = "data\\exercise41_input.txt";

    public static void main(String[] args) {
        Solution41 solution = new Solution41();
        //call read file function
        solution.nameList = solution.getFileData(INPUT_TXT);
        //pass nameList to alphabeticSorter
        solution.sortedList = solution.alphabeticSorter(solution.nameList);
        //create the output file
        solution.outputFileData(solution.sortedList);

    }

    public List<String> getFileData(String fileLocation) {
        ArrayList<String> sArray = new ArrayList<>();
        try {
            //create a buffered reader insider a try/catch block
            try (BufferedReader br = new BufferedReader(new FileReader(fileLocation))) {
                String s;
                //while the next line is not null
                while ((s = br.readLine()) != null) {
                    //store that line in the String array
                    sArray.add(s);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        //return the created String array
        return sArray;
    }

    public List<String> alphabeticSorter(List<String> nameList) {
        //takes the String array created by the file and sorts it
        //uses Arrays.sort
        //returns sorted array
        Collections.sort(nameList);
        return nameList;
    }

    public void outputFileData(List<String> sortedList) {
        //create a buffered writer
        try {
            //create a buffered reader insider a try/catch block
            try (BufferedWriter bw = new BufferedWriter(new FileWriter("data\\exercise41_output.txt"))) {
                bw.write("Total of "+ sortedList.size() + " names");
                bw.write("\n--------------------\n");
                //for loop through the length of the list
                for(int i = 0;i < sortedList.size();i++) {
                    //print out each name on a new line
                    bw.write(sortedList.get(i) + "\n");
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
