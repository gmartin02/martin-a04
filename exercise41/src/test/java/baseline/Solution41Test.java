/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Gabriel Martin
 */
package baseline;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution41Test {
    @Test
    public void alphabeticSorterTest() {
        Solution41 solution = new Solution41();
        String [] nameList = {"Ling, Mai", "Johnson, Jim", "Zarnecki, Sabrina", "Jones, Chris", "Jones, Aaron", "Swift, Geoffrey", "Xiong, Fong"};

        String [] sortedList = {"Johnson, Jim", "Jones, Aaron", "Jones, Chris", "Ling, Mai", "Swift, Geoffrey", "Xiong, Fong",  "Zarnecki, Sabrina"};

        assertEquals(sortedList, solution.alphabeticSorter(nameList));
    }

}