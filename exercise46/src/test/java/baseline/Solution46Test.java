package baseline;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class Solution46Test {

    @Test
    void getFileDataTest() {
        Solution46 solution = new Solution46();
        String test = "badger badger badger badger mushroom mushroom snake badger badger badger";
        solution.fileString = solution.getFileData();
        assertEquals(test, solution.fileString);
    }

    @Test
    void countInstancesOfWordsTest() {
        Solution46 solution = new Solution46();
        solution.fileString = solution.getFileData();
        Map<String, Integer> test = new HashMap<>();
        test.put("badger", 7);
        test.put("mushroom", 2);
        test.put("snake", 1);
        assertEquals(test, solution.countInstancesOfWords());
    }

}