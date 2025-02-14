package session_3;

import java.util.*;

public class ques4 {
    public static void main(String[] args) {
        //create a HashMap
        HashMap<String, Integer> map = new HashMap<>();
        map.put("Pravleen", 20);
        map.put("Kawal", 25);
        map.put("Ankur", 35);
        map.put("Gini", 31);

        //convert the HashMap to a list
        List<Map.Entry<String, Integer>> entries = new ArrayList<>(map.entrySet());

        //sort the list
        entries.sort((entry1, entry2) -> entry1.getValue().compareTo(entry2.getValue()));

        //store the sorted entries in a LinkedHashMap
        Map<String, Integer> sortedMap = new LinkedHashMap<>();
        for (Map.Entry<String, Integer> entry : entries) {
            sortedMap.put(entry.getKey(), entry.getValue());
        }

        // print the sorted map
        for (Map.Entry<String, Integer> entry : sortedMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
