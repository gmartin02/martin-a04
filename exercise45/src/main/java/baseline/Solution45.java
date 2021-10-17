/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solutions
 *  Copyright 2021 Gabriel Martin
 */
package baseline;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solution45 {
    private static final Scanner input = new Scanner(System.in);
    public List<String> fileInput = new ArrayList<>();
    public List<String> replacedList = new ArrayList<>();
    private static final File data = new File("data/exercise45_input.txt");

    public static void main(String[] args) {
        Solution45 solution = new Solution45();
        //gets the file data
        solution.fileInput = solution.getFileData();
        //creates the new paragraph
        solution.replacedList = solution.replaceUtilizeWithUsed();
        //writes the paragraph to the new file
        solution.writeToFile( solution.getOutputFileName());
    }

    public List<String> getFileData() {

        //each element in the array holds a line of the input file

        try {
            //create a buffered reader insider a try/catch block
            try (Scanner sc = new Scanner(data)) {
                //while the next line is not null
                while (sc.hasNextLine()) {
                    //store that line in the String array
                    fileInput.add(sc.nextLine());
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        //return the created String array
        return fileInput;
    }


    public List<String>replaceUtilizeWithUsed() {
        //loop through each element in the fileInput and find each occurrence of utilize with used, using replace()
        for(int i = 0;i < fileInput.size();i++) {
            //assign the replaced element to the local list
            String toBeReplaced = fileInput.get(i).replace("utilizes", "uses");
            toBeReplaced = toBeReplaced.replace("utilize", "use");
            replacedList.add(toBeReplaced);
        }
        //return replacedList
        return replacedList;
    }

    public String getOutputFileName() {
        System.out.print("What would you like to name the output file? ");
        //returns the name designated by the user for the output file
        return input.next();
    }

    public void writeToFile(String outputName) {
        //create a buffered writer
        try {
            //create a buffered reader insider a try/catch block
            try (BufferedWriter bw = new BufferedWriter(new FileWriter("data\\" + outputName + ".txt"))) {
                //for loop through the length of the list
                for(int i = 0;i < fileInput.size();i++) {
                    //loop through each element in the replacedList and prints it to a new file
                    bw.write(replacedList.get(i) + "\n");
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
