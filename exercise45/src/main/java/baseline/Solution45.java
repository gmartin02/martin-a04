/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solutions
 *  Copyright 2021 Gabriel Martin
 */
package baseline;

import java.util.ArrayList;
import java.util.List;

public class Solution45 {
    public String outputName;
    public static void main(String[] args) {
        //gets the file data
        //creates the new paragraph
        //writes the paragraph to the new file
    }

    public List<String> getFileData() {
        List<String> fileInput = new ArrayList<>();
        //each element in the array holds a line of the input file
        //create a buffered reader insider a try/catch block
                //while the next line is not null
                    //use concatenation to add that line to the String list
        //return the created String array
    }

    public List<String>replaceUtilizeWithUsed() {
        List<String> replacedList = new ArrayList<>();

        //loop through each element in the fileInput and find each occurrence of utilize with used, using replace()
        //assign the replaced element to the local list

        //return replacedList
    }

    public String getOutputFileName() {
        //returns the name designated by the user for the output file
    }

    public void writeToFile(String outputName) {
        //loop through each element in the replacedList and prints it to a new file
    }
}
