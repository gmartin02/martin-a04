/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solutions
 *  Copyright 2021 Gabriel Martin
 */
package baseline;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution44Test {

    @Test
    void getJSONDataTest() {
        Solution44 solution = new Solution44();
        solution.getJSONData();
        assertEquals("Widget", solution.inventory.products.get(0).getName());
        assertEquals(25.0, solution.inventory.products.get(0).getPrice());
        assertEquals(5, solution.inventory.products.get(0).getQuantity());
    }
}