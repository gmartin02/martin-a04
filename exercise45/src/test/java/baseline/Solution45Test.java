/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solutions
 *  Copyright 2021 Gabriel Martin
 */
package baseline;

import org.junit.jupiter.api.Test;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

class Solution45Test {

    @Test
    void getFileDataTest() {
        Solution45 solution = new Solution45();
        String test = "One should never utilize the word \"utilize\" in writing. Use \"use\" instead.";
        solution.fileInput = solution.getFileData();
        assertEquals(test, solution.fileInput.get(0));
    }

    @Test
    void replaceUtilizeWithUsedTest() {
        Solution45 solution = new Solution45();
        String test = "One should never use the word \"use\" in writing. Use \"use\" instead.";
        solution.fileInput = solution.getFileData();
        solution.replacedList = solution.replaceUtilizeWithUsed();
        assertEquals(test, solution.replacedList.get(0));
    }

    @Test
    void writeToFileTest() {
        Solution45 solution = new Solution45();
        solution.fileInput = solution.getFileData();

        solution.replacedList = solution.replaceUtilizeWithUsed();

        solution.writeToFile("test");

        List<String> test = new ArrayList<>();

        File data = new File("data/test.txt");

        try (Scanner sc = new Scanner(data)) {
            while (sc.hasNextLine()) {
                test.add(sc.nextLine());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        assertEquals(solution.replacedList.get(0), test.get(0));
    }
}