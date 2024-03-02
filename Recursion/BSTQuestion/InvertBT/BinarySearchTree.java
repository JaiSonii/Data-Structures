package Recursion.BSTQuestion.InvertBT;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

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

    private Node insert(Node currentNode, int value) {
        if (currentNode == null)
            return new Node(value);

        if (value < currentNode.value) {
            currentNode.left = insert(currentNode.left, value);
        } else if (value > currentNode.value) {
            currentNode.right = insert(currentNode.right, value);
        }
        return currentNode;
    }

    public void insert(int value) {
        if (root == null)
            root = new Node(value);
        insert(root, value);
    }

    public ArrayList<Integer> BFS() {
        Node currentNode = root;
        Queue<Node> queue = new LinkedList<>();
        ArrayList<Integer> results = new ArrayList<>();
        if (currentNode != null) {
            queue.add(currentNode);
        }

        while (queue.size() > 0) {
            currentNode = queue.remove();
            if (currentNode != null) {
                results.add(currentNode.value);
                queue.add(currentNode.left);
                queue.add(currentNode.right);
            }
        }
        return results;
    }

    public void invert() {
        root = invertTree(root);
    }

    private Node invertTree(Node currentNode) {
        if (currentNode == null)
            return null;

        Node temp = currentNode.left;
        currentNode.left = currentNode.right;
        currentNode.right = temp;

        invertTree(currentNode.left);
        invertTree(currentNode.right);
        return currentNode;

    }
    // +===================================================+
    // | WRITE YOUR CODE HERE |
    // | Description: |
    // | - Inverts a binary tree by swapping the left and |
    // | right children of all nodes in the tree. |
    // | - This method is private and intended for internal|
    // | use within the class. |
    // | - It operates recursively, visiting each node and |
    // | swapping its children. |
    // | |
    // | Parameters: |
    // | - node: The current node to process. |
    // | |
    // | Return: |
    // | - The node after its subtree has been inverted. |
    // | |
    // | Tips: |
    // | - The base case for the recursion is when the |
    // | method encounters a null node. |
    // | - A temporary node is used to facilitate the swap |
    // | of the left and right children. |
    // +===================================================+

}
