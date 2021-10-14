/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solutions
 *  Copyright 2021 Gabriel Martin
 */
package baseline;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ParseCSVTest {

    @Test
    void separateDataTest() {
        ParseCSV csv = new ParseCSV();
        List<String> testList = new ArrayList<>();
        testList.add("Ling");
        testList.add("Mai");
        testList.add("55900");

        assertEquals(testList.get(0), csv.separateData().get(0));
        assertEquals(testList.get(1), csv.separateData().get(1));
        assertEquals(testList.get(2), csv.separateData().get(2));
    }

    @Test
    void createLastNameArrayTest() {
        ParseCSV csv = new ParseCSV();
        csv.separateData();
        List<String> testList = new ArrayList<>();
        testList.add("Ling");
        testList.add("Johnson");
        testList.add("Jones");
        testList.add("Jones");
        testList.add("Swift");
        testList.add("Xiong");
        testList.add("Zarnecki");

        assertEquals(testList, csv.createLastNameArray());

    }

    @Test
    void createFirstNameArrayTest() {
        ParseCSV csv = new ParseCSV();
        csv.separateData();
        List<String> testList = new ArrayList<>();
        testList.add("Mai");
        testList.add("Jim");
        testList.add("Aaron");
        testList.add("Chris");
        testList.add("Geoffrey");
        testList.add("Fong");
        testList.add("Sabrina");

        assertEquals(testList, csv.createFirstNameArray());
    }

    @Test
    void createSalaryArrayTest() {
        ParseCSV csv = new ParseCSV();
        csv.separateData();
        List<String> testList = new ArrayList<>();
        testList.add("55900");
        testList.add("56500");
        testList.add("46000");
        testList.add("34500");
        testList.add("14200");
        testList.add("65000");
        testList.add("51500");

        assertEquals(testList, csv.createSalaryArray());
    }
}