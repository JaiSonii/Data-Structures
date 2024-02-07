package hashtable.questions.firstNonRepeatingChar;

import java.util.*;

public class Main {

    // WRITE FIRSTNONREPEATINGCHAR METHOD HERE //
    // //
    // //
    // //
    // //
    /////////////////////////////////////////////

    public static Character firstNonRepeatingChar(String str) {
        HashMap<Character, Integer> myHashMap = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (myHashMap.containsKey(c)) {
                int count = myHashMap.get(c);
                myHashMap.put(c, count + 1);
            } else {
                myHashMap.put(c, 1);
            }
        }
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (myHashMap.get(c).equals(1)) {
                return c;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        System.out.println(firstNonRepeatingChar("leetcode"));
        System.out.println(firstNonRepeatingChar("hello"));
        System.out.println(firstNonRepeatingChar("aabbcc"));

        /*
         * EXPECTED OUTPUT:
         * ----------------
         * l
         * h
         * null
         * 
         */

    }

}
