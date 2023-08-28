package org.bachnc.RomanToInteger;

import java.util.HashMap;

public class RomanToInteger {
    public static void main(String[] args) {
        System.out.println(romanToInt("MCMXCIV"));
    }

    public static int romanToInt(String s) {
        int result = 0;
        HashMap<Character, Integer> romanHashMap = new HashMap<>();

        romanHashMap.put('I', 1);
        romanHashMap.put('V', 5);
        romanHashMap.put('X', 10);
        romanHashMap.put('L', 50);
        romanHashMap.put('C', 100);
        romanHashMap.put('D', 500);
        romanHashMap.put('M', 1000);

        for (int i = 0; i < s.length(); i++) {
            char romanNumber = s.charAt(i);
            if (i < s.length() - 1 && romanHashMap.get(romanNumber) < romanHashMap.get(s.charAt(i + 1))) {
                result -= romanHashMap.get(romanNumber);
            } else {
                result += romanHashMap.get(romanNumber);
            }
        }

        return result;
    }
}
