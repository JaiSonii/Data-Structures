package Recursion.BSTQuestion.ArrayToBalancedBST;

import java.util.ArrayList;
import java.util.List;

public class BinarySearchTree {

    private Node root;

    public static class Node {
        public int value;
        public Node left;
        public Node right;

        private Node(int value) {
            this.value = value;
        }
    }

    public Node getRoot() {
        return root;
    }

    public List<Integer> inorderTraversal() {
        List<Integer> result = new ArrayList<>();
        inorderHelper(this.root, result);
        return result;
    }

    private void inorderHelper(Node node, List<Integer> result) {
        if (node == null)
            return;
        inorderHelper(node.left, result);
        result.add(node.value);
        inorderHelper(node.right, result);
    }

    public boolean isBalanced() {
        return height(this.root) != -1;
    }

    private int height(Node node) {
        if (node == null)
            return 0;
        int leftHeight = height(node.left);
        if (leftHeight == -1)
            return -1;
        int rightHeight = height(node.right);
        if (rightHeight == -1)
            return -1;
        if (Math.abs(leftHeight - rightHeight) > 1)
            return -1;
        return 1 + Math.max(leftHeight, rightHeight);
    }

    public void sortedArrayToBST(int[] nums) {
        this.root = sortedArrayToBST(nums, 0, nums.length - 1);
    }

    private Node sortedArrayToBST(int[] arr, int start, int end) {
        if (start > end)
            return null;
        int mid = (end + start) / 2;
        Node root = new Node(arr[mid]);

        root.left = sortedArrayToBST(arr, start, mid - 1);

        root.right = sortedArrayToBST(arr, mid + 1, end);

        return root;
    }
    // +===================================================+
    // | WRITE YOUR CODE HERE |
    // | Description: |
    // | - Converts a sorted array into a height-balanced |
    // | binary search tree (BST). |
    // | - This method is private and used internally |
    // | within the class. |
    // | - It uses recursion to construct the BST. |
    // | |
    // | Parameters: |
    // | - nums: Sorted array of integers. |
    // | - left: Starting index for the current segment |
    // | of the array. |
    // | - right: Ending index for the current segment of |
    // | the array. |
    // | |
    // | Return: |
    // | - The root node of the BST created from the |
    // | sorted array segment. |
    // | |
    // | Tips: |
    // | - The middle element of the current segment is |
    // | chosen as the root to ensure the BST is |
    // | height-balanced. |
    // | - The method recursively builds the left and right|
    // | subtrees by calling itself with adjusted left |
    // | and right indices to work on sub-segments of |
    // | the array. |
    // +===================================================+

}
