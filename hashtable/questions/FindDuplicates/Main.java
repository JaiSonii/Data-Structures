package hashtable.questions.FindDuplicates;

import java.util.*;

public class Main {

    // WRITE THE FINDDUPLICATES METHOD HERE //
    // //
    // //
    // //
    // //
    //////////////////////////////////////////

    public static List<Integer> findDuplicates(int[] arr) {
        ArrayList<Integer> duplicates = new ArrayList<>();
        HashMap<Integer, Boolean> myHashMap = new HashMap<>();

        for (int i : arr) {
            if (myHashMap.get(i) != null) {
                duplicates.add(i);
            } else {
                myHashMap.put(i, true);
            }
        }
        return duplicates;
    }

    public static void main(String[] args) {

        int[] nums = { 1, 2, 3, 2, 1, 4, 5, 4 };
        List<Integer> duplicates = findDuplicates(nums);
        System.out.println(duplicates);

        /*
         * EXPECTED OUTPUT:
         * ----------------
         * [1, 2, 4]
         * 
         */

    }

}
