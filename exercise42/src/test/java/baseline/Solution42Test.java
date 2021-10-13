package baseline;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class Solution42Test {

    @Test
    void getFileData() {
        Solution42 solution = new Solution42();
        ArrayList<String> testList = new ArrayList<>();
        testList.add("Ling,Mai,55900");
        testList.add("Johnson,Jim,56500");
        testList.add("Jones,Aaron,46000");
        testList.add("Jones,Chris,34500");
        testList.add("Swift,Geoffrey,14200");
        testList.add("Xiong,Fong,65000");
        testList.add("Zarnecki,Sabrina,51500");
        assertEquals(testList, solution.getFileData());
    }
}