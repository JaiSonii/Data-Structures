package hashtable.questions.GroupAnagrams;

import java.util.*;

public class Main {

    // WRITE GROUPANAGRAMS METHOD HERE //
    // //
    // //
    // //
    // //
    /////////////////////////////////////

    public static List<List<String>> groupAnagrams(String[] strings) {
        if (strings == null)
            return new ArrayList<>();
        HashMap<String, List<String>> map = new HashMap<>();

        for (String s : strings) {
            char ca[] = s.toCharArray();
            Arrays.sort(ca);
            String key = String.valueOf(ca);
            if (!map.containsKey(key)) {
                map.put(key, new LinkedList<>());
            }
            map.get(key).add(s);
        }
        return new ArrayList<>(map.values());
    }

    public static void main(String[] args) {
        System.out.println("1st set:");
        System.out.println(groupAnagrams(new String[] { "eat", "tea", "tan", "ate", "nat", "bat" }));

        System.out.println("\n2nd set:");
        System.out.println(groupAnagrams(new String[] { "abc", "cba", "bac", "foo", "bar" }));

        System.out.println("\n3rd set:");
        System.out.println(
                groupAnagrams(new String[] { "listen", "silent", "triangle", "integral", "garden", "ranged" }));

        /*
         * EXPECTED OUTPUT:
         * ----------------
         * 1st set:
         * [[eat, tea, ate], [tan, nat], [bat]]
         * 
         * 2nd set:
         * [[abc, cba, bac], [foo], [bar]]
         * 
         * 3rd set:
         * [[listen, silent], [triangle, integral], [garden, ranged]]
         * 
         */

    }

}
