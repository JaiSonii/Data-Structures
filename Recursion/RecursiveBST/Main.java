package Recursion.RecursiveBST;

public class Main {

    public static void main(String[] args) {

        BinarySearchTree myBST = new BinarySearchTree();

        myBST.rInsert(10);
        myBST.rInsert(8);
        myBST.rInsert(20);
        myBST.rInsert(13);
        myBST.rInsert(21);
        myBST.rInsert(22);

        // System.out.println("BST Contains 27:");
        // System.out.println(myBST.rContains(27));

        // System.out.println("\nBST Contains 17:");
        // System.out.println(myBST.rContains(17));
        myBST.rDelete(20);
        System.out.println(myBST.getRoot().value);
        System.out.println(myBST.getRoot().left.value);
        System.out.println(myBST.getRoot().right.value);

        // System.out.println(myBST.getRoot().value);
        // System.out.println(myBST.getRoot().left.value);
        // System.out.println(myBST.getRoot().right.value);

        /*
         * EXPECTED OUTPUT:
         * ----------------
         * BST Contains 27:
         * true
         * 
         * BST Contains 17:
         * false
         * 
         */

    }

}
