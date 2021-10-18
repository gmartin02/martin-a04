package baseline;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.*;
import java.util.stream.Collectors;

public class Solution46 {
    String fileString = "";
    File data = new File("data/exercise46_input.txt");

    public static void main(String[] args) {
        Solution46 solution = new Solution46();
        solution.fileString = solution.getFileData();
        solution.writeToFile(solution.countInstancesOfWords());
    }
    public String getFileData() {
        StringBuilder fileInput = new StringBuilder();
        try {
            //create a buffered reader insider a try/catch block
            try (Scanner sc = new Scanner(data)) {
                //while the next line is not null
                while (sc.hasNextLine()) {
                    //use concatenation to add that line to the String
                    fileInput.append(sc.nextLine());
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        //return the created String
        return fileInput.toString();
}

    public Map<String, Integer> countInstancesOfWords() {
        Map<String, Integer> countedWords = new HashMap<>();
        //split the string into a string array
        String[] stringArray = fileString.split(" ");

        List<String> arrayList = new ArrayList<>(Arrays.asList(stringArray));
        //sort the array list
        Collections.sort(arrayList);
        //loop through the array list
        for(int i = 0;i< arrayList.size();i++) {
            //when it finds a word it will add it to the map as the key and increment the value
            if(!countedWords.containsKey(arrayList.get(i))) {
                countedWords.put(arrayList.get(i), 1);
            } else if(countedWords.containsKey(arrayList.get(i))){
                //if the word is already in the map it will just increment the value
                countedWords.put(arrayList.get(i), countedWords.get(arrayList.get(i)) + 1);
            }
        }

        //return the new map
        return countedWords.entrySet().stream()
                .sorted(Comparator.comparingInt(e -> -e.getValue()))
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (a, b) -> { throw new AssertionError(); },
                        LinkedHashMap::new
                ));
    }

    public void writeToFile(Map<String, Integer> countedWords) {
        List<String> keyString = countedWords.keySet().stream().toList();

        //create a buffered writer
        try {
            //create a buffered reader insider a try/catch block
            try (BufferedWriter bw = new BufferedWriter(new FileWriter("data/exercise46_output.txt"))) {
                //for loop through the size of the map
                for(int i = 0;i < countedWords.size(); i++) {
                    //for each key print out its frequency with asterisks
                    bw.write(keyString.get(i) + " ");
                    for(int j = 0; j < countedWords.get(keyString.get(i));j++) {
                        bw.write("*");
                    }
                    bw.write("\n");
                }

            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
