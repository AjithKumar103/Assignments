package DSA.sorting;

import java.util.Arrays;
import java.util.Random;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr = {-3,22,4,9,3,8,2,5,6,1,7,-100,4};
        int left = 0;
        int right = arr.length - 1;
        System.out.println("Before sorting: " + Arrays.toString(arr));
        System.out.println("After sorting: " + Arrays.toString(quickSort(arr,left,right)));
        System.out.println("--------------+-----------------+---------------");
        // Time taken by quick sort to sort 1 Million elements in an array
        Random rand = new Random();
        int[] arr2 = new int[100000];
        for (int i = 0; i < 100000; i++){
            arr2[i] = rand.nextInt();
        }
        double startTime = System.currentTimeMillis();
        quickSort(arr2,left,arr2.length - 1);
        double endTime = System.currentTimeMillis();
        System.out.println("Time taken by Quick Sort to sort 1M elements: " + (endTime - startTime) + " ms");
    }
    public static void swap(int[] arr, int indexOne, int indexTwo){
        int temp = arr[indexOne];
        arr[indexOne] = arr[indexTwo];
        arr[indexTwo] = temp;
    }
    public static int pivote(int[] arr,int start,int end){
        int pivote = arr[start];
        int swapIndex = start;
        for (int i = start + 1; i <= end; i++){
            if (pivote > arr[i]){
                swapIndex++;
                swap(arr,swapIndex,i);
            }
        }
        swap(arr,start,swapIndex);
        return swapIndex;
    }
    public static int[] quickSort(int[] arr,int left,int right){
        if (left < right) {
            int pivoteIndex = pivote(arr, left, right);
            // left half
            quickSort(arr, left, pivoteIndex - 1);
            // right half
            quickSort(arr, pivoteIndex + 1, right);
        }
        return arr;
    }
}
