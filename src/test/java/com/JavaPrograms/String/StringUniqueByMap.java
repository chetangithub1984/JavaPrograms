package com.JavaPrograms.String;

import java.util.HashMap;
import java.util.Map;

public class StringUniqueByMap {

    public static void main(String args[]) {

        String blogname = "howtodoinjava dot com";

        char[] chars = blogname.toCharArray();

        Map<Character, Integer> map = new HashMap<>();

        for (char c : chars) {

            if (map.containsKey(c)) {
                int count = map.get(c);
                map.put(c, ++count);
            } else {
                if ( c != ' ') {
                    map.put(c, 1);
                }
            }

        }

        for (char c : map.keySet()) {
           // if (map.get(c) > 1) {
                System.out.println(c + " " + map.get(c));
           // }
        }
    }
}
