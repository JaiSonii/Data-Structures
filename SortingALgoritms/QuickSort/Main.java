package SortingALgoritms.QuickSort;

import java.util.Arrays;

public class Main {
    public static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public static int pivot(int[] array, int pivotIndex, int endIndex) {
        int swapIndex = pivotIndex;

        for (int i = pivotIndex + 1; i <= endIndex; i++) {
            if (array[i] < array[pivotIndex]) {
                swapIndex++;
                swap(array, swapIndex, i);
            }
        }
        swap(array, pivotIndex, swapIndex);
        return swapIndex;

    }

    public static void quickSortHelper(int[] array, int left, int right) {
        if (left < right) {
            int pivotIndex = pivot(array, left, right);
            quickSortHelper(array, left, pivotIndex - 1);
            quickSortHelper(array, pivotIndex + 1, right);
        }
    }

    public static void quickSort(int[] array) {
        quickSortHelper(array, 0, array.length - 1);
    }

    public static void main(String[] args) {
        int[] myArray = { 4, 6, 1, 7, 3, 2, 5 };

        quickSort(myArray);

        System.out.println(Arrays.toString(myArray));

        /*
         * EXPECTED OUTPUT:
         * ----------------
         * [1, 2, 3, 4, 5, 6, 7]
         * 
         */
    }
}
