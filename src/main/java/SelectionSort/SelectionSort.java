package SelectionSort;

import java.util.Arrays;

public class SelectionSort {
    private static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[i]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] myList = {5, 3, 9, 1, 4};
        selectionSort(myList);
        System.out.println(Arrays.toString(myList));
    }
}