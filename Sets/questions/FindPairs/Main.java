package Sets.questions.FindPairs;

import java.util.*;

public class Main {

    public static List<int[]> findPairs(int[] arr1, int[] arr2, int target) {
        Set<Integer> mySet = new HashSet<>();
        List<int[]> resultList = new ArrayList<>();
        for (int i : arr1) {
            mySet.add(i);
        }
        for (int i : arr2) {
            if (mySet.contains(target - i)) {
                int[] temp = new int[] { target - i, i };
                resultList.add(temp);
            }
        }
        return resultList;
    }

    public static void main(String[] args) {
        int[] arr1 = { 1, 2, 3, 4, 5 };
        int[] arr2 = { 2, 4, 6, 8, 10 };
        int target = 7;

        List<int[]> pairs = findPairs(arr1, arr2, target);
        for (int[] pair : pairs) {
            System.out.println(Arrays.toString(pair));
        }

        /*
         * EXPECTED OUTPUT:
         * ----------------
         * [5, 2]
         * [3, 4]
         * [1, 6]
         * 
         */

    }

}
