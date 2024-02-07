package Sets.questions.LongestSequence;

import java.util.HashSet;
import java.util.Set;

public class Main {

    // WRITE LONGESTCONSECUTIVESEQUENCE METOHOD HERE //
    // //
    // //
    // //
    // //
    ///////////////////////////////////////////////////
    public static int longestConsecutiveSequence(int[] arr) {
        if (arr.length == 0) {
            return 0;
        }
        Set<Integer> mySet = new HashSet<>();
        for (int i : arr) {
            mySet.add(i);
        }

        int streak = 1;
        for (int i : arr) {
            int currentNum = i;
            int currentStreak = 1;
            while (mySet.contains(currentNum - 1)) {
                currentStreak++;
                currentNum--;
            }
            if (streak < currentStreak) {
                streak = currentStreak;
            }
        }
        return streak;
    }

    public static void main(String[] args) {
        testLongestConsecutiveSequence("Consecutive Integers", new int[] { 1, 2, 3, 4, 5 }, 5);
        testLongestConsecutiveSequence("No Sequence", new int[] { 1, 3, 5, 7, 9 }, 1);
        testLongestConsecutiveSequence("Duplicates", new int[] { 1, 2, 2, 3, 4 }, 4);
        testLongestConsecutiveSequence("Negative Numbers", new int[] { 1, 0, -1, -2, -3 }, 5);
        testLongestConsecutiveSequence("Empty Array", new int[] {}, 0);
        testLongestConsecutiveSequence("Multiple Sequences", new int[] { 1, 2, 3, 10, 11, 12, 13 }, 4);
        testLongestConsecutiveSequence("Unordered Elements", new int[] { 5, 1, 3, 4, 2 }, 5);
        testLongestConsecutiveSequence("Single Element", new int[] { 1 }, 1);
        testLongestConsecutiveSequence("All Identical Elements", new int[] { 2, 2, 2, 2, 2 }, 1);
    }

    /**
     * Test method for longestConsecutiveSequence.
     * 
     * @param title    Title of the test
     * @param nums     Input array
     * @param expected Expected result
     */
    private static void testLongestConsecutiveSequence(String title, int[] nums, int expected) {
        System.out.println("Test: " + title);
        System.out.print("Testing array: ");
        for (int num : nums) {
            System.out.print(num + " ");
        }
        System.out.println();

        int result = longestConsecutiveSequence(nums);
        System.out.println("Expected longest streak: " + expected);
        System.out.println("Actual longest streak: " + result);

        if (result == expected) {
            System.out.println("PASS\n");
        } else {
            System.out.println("FAIL\n");
        }
    }

}
