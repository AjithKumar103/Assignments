package DSA.sorting;

import java.util.Arrays;
import java.util.Random;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {-3,22,4,9,3,8,2,5,6,1,7,-100,4};
        System.out.println("Before sorting: " + Arrays.toString(arr));
        System.out.println("After sorting: " + Arrays.toString(selectionSort(arr)));
        System.out.println("--------------+-----------------+---------------");
        Random rand = new Random();
        int[] arr2 = new int[100000];
        for (int i = 0; i < 100000; i++){
            arr2[i] = rand.nextInt();
        }
        double startTime = System.currentTimeMillis();
        selectionSort(arr2);
        double endTime = System.currentTimeMillis();
        System.out.println("Time taken by Selection Sort to sort 1M elements: " + (endTime - startTime) + " ms");
    }
    public static int[] selectionSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int minimum = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minimum])
                    minimum = j;
            }
            if (i != minimum){
                int temp = arr[i];
                arr[i] = arr[minimum];
                arr[minimum] = temp;
            }
        }
        return arr;
    }
}
