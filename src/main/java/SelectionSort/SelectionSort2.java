package SelectionSort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SelectionSort2 {
    private static int findSmallest(List<Integer> arr) {
        int smallest = arr.get(0);
        int smallestIndex = 0;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) < smallest) {
                smallest = arr.get(i);
                smallestIndex = i;
            }
        }
        return smallestIndex;
    }

    private static List<Integer> selectionSort2(List<Integer> arr) {
        List<Integer> NewArr = new ArrayList<>(arr.size());

        int size = arr.size();
        for (int i = 0; i < size; i++) {
            int smallest = findSmallest(arr);
            NewArr.add(arr.get(smallest));
            arr.remove(smallest);
        }
        return NewArr;
    }

    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>(Arrays.asList(8, 4, 21, 2, 33));
        System.out.println(selectionSort2(arr));
    }
}




