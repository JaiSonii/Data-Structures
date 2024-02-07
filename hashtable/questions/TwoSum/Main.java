package hashtable.questions.TwoSum;

import java.util.*;

public class Main {

    // WRITE THE TWOSUM MEHTOD HERE //
    // //
    // //
    // //
    // //
    //////////////////////////////////
    public static int[] twoSum(int[] arr, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int[] sumArray = new int[2];
        for (int i = 0; i < arr.length; i++) {
            map.put(arr[i], i);
        }
        for (int i = 0; i < arr.length; i++) {
            int remainingSum = target - arr[i];
            if (map.containsKey(remainingSum) && map.get(remainingSum) != i) {
                sumArray[1] = map.get(remainingSum);
                sumArray[0] = i;
                return sumArray;
            }
        }
        return new int[0];
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(twoSum(new int[] { 2, 7, 11, 15 }, 9)));
        System.out.println(Arrays.toString(twoSum(new int[] { 3, 2, 4 }, 6)));
        System.out.println(Arrays.toString(twoSum(new int[] { 3, 3 }, 6)));
        System.out.println(Arrays.toString(twoSum(new int[] { 1, 2, 3, 4, 5 }, 10)));
        System.out.println(Arrays.toString(twoSum(new int[] { 1, 2, 3, 4, 5 }, 7)));
        System.out.println(Arrays.toString(twoSum(new int[] { 1, 2, 3, 4, 5 }, 3)));
        System.out.println(Arrays.toString(twoSum(new int[] {}, 0)));

        /*
         * EXPECTED OUTPUT:
         * ----------------
         * [0, 1]
         * [1, 2]
         * [0, 1]
         * []
         * [2, 3]
         * [0, 1]
         * []
         * 
         */

    }

}
