package Recursion.BSTQuestion.InvertBT;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    private static void performTest(String description, int[] insertValues, Integer[] expectedValues,
            boolean doubleInversion) {
        BinarySearchTree bst = new BinarySearchTree();
        for (int value : insertValues) {
            bst.insert(value);
        }
        if (doubleInversion) {
            bst.invert(); // First inversion
        }
        bst.invert(); // Perform inversion (or second inversion for the specific case)

        ArrayList<Integer> resultList = bst.BFS();

        // Use Arrays.asList for compatibility with older Java versions
        List<Integer> expectedList = new ArrayList<>(Arrays.asList(expectedValues));

        System.out.println(description + ": " + (expectedList.equals(resultList) ? "Pass" : "Fail"));
        System.out.println("Expected: " + expectedList);
        System.out.println("Actual:   " + resultList);
    }

    private static void testInvertBinarySearchTree() {
        System.out.println("--- Testing Inversion of Binary Search Tree ---");

        performTest("Invert an empty tree", new int[] {}, new Integer[] {}, false);
        performTest("Invert a tree with a single node", new int[] { 1 }, new Integer[] { 1 }, false);
        performTest("Invert a tree with only a left child", new int[] { 2, 1 }, new Integer[] { 2, null, 1 }, false);
        performTest("Invert a tree with only a right child", new int[] { 1, 2 }, new Integer[] { 1, 2 }, false);
        performTest("Invert a full binary tree", new int[] { 2, 1, 3 }, new Integer[] { 2, 3, 1 }, false);
        performTest("Invert a more complex binary tree", new int[] { 4, 2, 6, 1, 3, 5, 7 },
                new Integer[] { 4, 6, 2, 7, 5, 3, 1 }, false);
        performTest("Double inversion returns original", new int[] { 3, 1, 4 }, new Integer[] { 3, 1, 4 }, true);
    }

    public static void main(String[] args) {
        testInvertBinarySearchTree();
    }

}
