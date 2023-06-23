package DSA.sorting;

import java.util.Arrays;
import java.util.Random;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {-3,22,4,9,3,8,2,5,6,1,7,-100,4};
        System.out.println("Before sorting: " + Arrays.toString(arr));
        System.out.println("After sorting: " + Arrays.toString(insertionSort(arr)));
        System.out.println("--------------+-----------------+---------------");
        Random rand = new Random();
        int[] arr2 = new int[100000];
        for (int i = 0; i < 100000; i++){
            arr2[i] = rand.nextInt();
        }
        double startTime = System.currentTimeMillis();
        insertionSort(arr2);
        double endTime = System.currentTimeMillis();
        System.out.println("Time taken by Insertion Sort to sort 1M elements: " + (endTime - startTime) + " ms");
    }
    public static int[] insertionSort(int[] arr){
        for (int i = 1; i < arr.length; i++){
            int currentValue = arr[i];
            int j;
            for (j = i - 1; j >= 0 && arr[j] > currentValue; j--){
                arr[j + 1] = arr[j];
            }
            arr[j + 1] = currentValue;
        }
        return arr;
    }
}
