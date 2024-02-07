package Heap.questions.MaxStreamElement;

import java.util.ArrayList;
import java.util.List;

public class Main {

    // WRITE THE STREAMMAX METHOD HERE //
    // //
    // //
    // //
    // //
    /////////////////////////////////////

    public static List<Integer> streamMax(int[] nums) {
        if (nums.length == 0)
            return new ArrayList<>();
        List<Integer> resultList = new ArrayList<>();
        Heap myHeap = new Heap();

        for (int i : nums) {
            myHeap.insert(i);
            resultList.add(myHeap.getHeap().get(0));
        }
        return resultList;
    }

    public static void main(String[] args) {
        // Test case 1
        int[] nums1 = { 1, 5, 2, 9, 3, 6, 8 };
        System.out.println("Test case 1:");
        System.out.println("Input: [1, 5, 2, 9, 3, 6, 8]");
        System.out.println("Expected output: [1, 5, 5, 9, 9, 9, 9]");
        System.out.println("Actual output: " + streamMax(nums1));
        System.out.println();

        // Test case 2
        int[] nums2 = { 10, 2, 5, 1, 0, 11, 6 };
        System.out.println("Test case 2:");
        System.out.println("Input: [10, 2, 5, 1, 0, 11, 6]");
        System.out.println("Expected output: [10, 10, 10, 10, 10, 11, 11]");
        System.out.println("Actual output: " + streamMax(nums2));
        System.out.println();

        // Test case 3
        int[] nums3 = { 3, 3, 3, 3, 3 };
        System.out.println("Test case 3:");
        System.out.println("Input: [3, 3, 3, 3, 3]");
        System.out.println("Expected output: [3, 3, 3, 3, 3]");
        System.out.println("Actual output: " + streamMax(nums3));
        System.out.println();

        /*
         * EXPECTED OUTPUT:
         * ----------------
         * Test case 1:
         * Input: [1, 5, 2, 9, 3, 6, 8]
         * Expected output: [1, 5, 5, 9, 9, 9, 9]
         * Actual output: [1, 5, 5, 9, 9, 9, 9]
         * 
         * Test case 2:
         * Input: [10, 2, 5, 1, 0, 11, 6]
         * Expected output: [10, 10, 10, 10, 10, 11, 11]
         * Actual output: [10, 10, 10, 10, 10, 11, 11]
         * 
         * Test case 3:
         * Input: [3, 3, 3, 3, 3]
         * Expected output: [3, 3, 3, 3, 3]
         * Actual output: [3, 3, 3, 3, 3]
         * 
         */

    }

}
