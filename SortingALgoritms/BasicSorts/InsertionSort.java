package SortingALgoritms.BasicSorts;

import java.util.Arrays;

public class InsertionSort {

    public static void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int temp = arr[i];
            int j = i - 1;
            while (j > -1 && temp < arr[j]) {
                arr[j + 1] = arr[j];
                arr[j] = temp;
                j--;
            }
        }
    }

    public static void main(String[] args) {
        int[] myArray = { 4, 2, 6, 5, 1, 3 };

        insertionSort(myArray);

        System.out.println(Arrays.toString(myArray));
    }
}
