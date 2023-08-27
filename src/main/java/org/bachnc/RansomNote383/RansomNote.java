package org.bachnc.RansomNote383;

import java.util.HashMap;

public class RansomNote {
    public static void main(String[] args) {
        String ransomNote1 = "aa" ;
        String magazine1 = "ab";
        System.out.println(canConstruct(ransomNote1,magazine1));
        String ransomNote2 = "aa" ;
        String magazine2 = "aab";
        System.out.println(canConstruct(ransomNote2,magazine2));
    }



    public static boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character, Integer> magazineLetter = new HashMap<>();

        for (int i = 0; i < magazine.length(); i++) {
            char m = magazine.charAt(i);

            int currentCount = magazineLetter.getOrDefault(m,0);
            magazineLetter.put(m,currentCount + 1 );
        }

        for(int i = 0; i < ransomNote.length(); i++){
            char r = ransomNote.charAt(i);
            int currentCount = magazineLetter.getOrDefault(r,0);
            if( currentCount == 0 ){
                return false;
            }
            magazineLetter.put(r, currentCount - 1);
        }
        return true;
    }
}
