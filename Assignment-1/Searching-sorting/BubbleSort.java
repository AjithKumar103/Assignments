package DSA.sorting;

import java.util.Arrays;
import java.util.Random;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {-3,22,4,9,3,8,2,5,6,1,7,-100,4};
        System.out.println("Before sorting: " + Arrays.toString(arr));
        System.out.println("After sorting: " + Arrays.toString(bubbleSort(arr)));
        System.out.println("--------------+-----------------+---------------");
        Random rand = new Random();
        int[] arr2 = new int[100000];
        for (int i = 0; i < 100000; i++){
            arr2[i] = rand.nextInt();
        }
        double startTime = System.currentTimeMillis();
        bubbleSort(arr2);
        double endTime = System.currentTimeMillis();
        System.out.println("Time taken by Bubble Sort to sort 1M elements: " + (endTime - startTime) + " ms");
    }
    public static int[] bubbleSort(int[] arr){
        for (int i = arr.length; i > 0 ; i--){
            for (int j = 0; j < i - 1; j++){
                if (arr[j] > arr[j + 1]){
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        return arr;
    }
}
