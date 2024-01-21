package BinarySearchTree;

public class BinarySearchTree {
    class Node {
        int value;
        Node left;
        Node right;

        Node(int value) {
            this.value = value;
            this.left = null;
            this.right = null;
        }
    }

    Node root;

    // USING RECURSION
    // public Node insert(Node root, int value) {
    // if (root == null) {
    // root = new Node(value);
    // } else if (root.value == value) {
    // System.out.println("Cannot insert: value already exists");
    // return root;
    // } else if (value < root.value) {
    // root.left = insert(root.left, value);
    // } else {
    // root.right = insert(root.right, value);
    // }
    // return root;
    // }

    // Using loop
    public boolean insert(int value) {
        Node newNode = new Node(value);
        if (root == null) {
            root = newNode;
            return true;
        }

        Node temp = root;
        while (true) {
            if (temp.value == value) {
                System.out.println("Value already exist in the tree");
                return false;
            }
            if (value < temp.value) {
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

    public boolean contains(int value) {
        if (root == null) {
            return false;
        }
        Node temp = root;

        while (temp != null) {
            if (temp.value == value)
                return true;
            else if (value < temp.value) {
                temp = temp.left;
            } else {
                temp = temp.right;
            }
        }
        return false;
    }
}
