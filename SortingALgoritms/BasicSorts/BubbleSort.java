package SortingALgoritms.BasicSorts;

import java.util.Arrays;

public class BubbleSort {

    public static void bubbleSort(int[] arr) {
        for (int i = arr.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] myArray = { 4, 2, 6, 5, 1, 3 };

        bubbleSort(myArray);

        System.out.println(Arrays.toString(myArray));
    }
}
