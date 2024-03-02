package treeTraversal.kthSmalltestNode;

import java.util.LinkedList;
import java.util.Stack;

public class BinarySearchTree {

    private Node root;

    class Node {
        public int value;
        public Node left;
        public Node right;

        Node(int value) {
            this.value = value;
        }
    }

    public boolean insert(int value) {
        Node newNode = new Node(value);
        if (root == null) {
            root = newNode;
            return true;
        }
        Node temp = root;
        while (true) {
            if (newNode.value == temp.value)
                return false;
            if (newNode.value < temp.value) {
                if (temp.left == null) {
                    temp.left = newNode;
                    return true;
                }
                temp = temp.left;
            } else {
                if (temp.right == null) {
                    temp.right = newNode;
                    return true;
                }
                temp = temp.right;
            }
        }
    }

    public int kthSmallest(int k) {
        Node currentNode = root;
        Stack<Node> stack = new Stack<>();

        while (!stack.isEmpty() || currentNode != null) {
            while (currentNode != null) {
                stack.push(currentNode);
                currentNode = currentNode.left;
            }
            currentNode = stack.pop();
            k--;
            if (k == 0)
                return currentNode.value;
            currentNode = currentNode.right;
        }
        return -1;
    }

}

// WRITE KTHSMALLEST METHOD HERE //
// //
// //
// //
// //
/////////////////////////////////
