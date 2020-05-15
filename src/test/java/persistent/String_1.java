package persistent;

import java.util.HashMap;
import java.util.Map;

public class String_1 {

    // Find out how many spaces , unique and duplicate characters

    public static void main(String[] args) {

        String name = "chetan patel ";

        char[] charnames = name.toCharArray();

        HashMap<Character, Integer> map = new HashMap<>();

        for (char charname : charnames) {

            if (map.containsKey(charname)) {
                map.put(charname, map.get(charname) + 1);
            } else {
                //if (charname != ' ') {
                map.put(charname, 1);
                // }
            }

        }

        int uniquecounter = 0;
        int duplicatecounter = 0;

        for (Map.Entry<Character, Integer> map1 : map.entrySet()) {

            if (map1.getKey() == ' ') {
                System.out.println("total number is spaces = " + map1.getValue());
            } else if (map1.getValue() == 1) {
                uniquecounter++;

            } else {
                duplicatecounter++;
            }

        }
        System.out.println("total number of unique character is = " + uniquecounter);
        System.out.println("total number of duplicate character is = " + duplicatecounter);

    }
}
