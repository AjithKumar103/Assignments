package DSA.sorting;

import java.util.Arrays;
import java.util.Random;

public class MergeSort{
    public static void main(String[] args) {
        int[] arr = {-3,22,4,9,3,8,2,5,6,1,7,-100,4};
        System.out.println("Before sorting: " + Arrays.toString(arr));
        System.out.println("After sorting: " + Arrays.toString(mergeSort(arr)));
        System.out.println("--------------+-----------------+---------------");
        Random rand = new Random();
        int[] arr2 = new int[100000];
        for (int i = 0; i < 100000; i++){
            arr2[i] = rand.nextInt();
        }
        double startTime = System.currentTimeMillis();
        mergeSort(arr2);
        double endTime = System.currentTimeMillis();
        System.out.println("Time taken by Merge Sort to sort 1M elements: " + (endTime - startTime) + " ms");
    }
    public static int[] mergeSort(int[] arr){
        if (arr.length <= 1) return arr;

        int arrSize = arr.length;
        int mid = arrSize / 2;
        int[] leftHalf = new int[mid];
        int[] rightHalf = new int[arrSize - mid];

        for(int i = 0; i < mid; i++){
            leftHalf[i] = arr[i];
        }
        for(int i = mid; i < arrSize; i++){
            rightHalf[i - mid] = arr[i];
        }
        return merge(arr,
                mergeSort(leftHalf),
                mergeSort(rightHalf));
    }
    public static int[] merge(int[] arr, int[] leftHalf, int[] rightHalf){
        int i = 0, j = 0, k = 0;

        while(i < leftHalf.length && j < rightHalf.length){
            if (leftHalf[i] <= rightHalf[j]){
                arr[k] = leftHalf[i];
                i++;
            }
            else{
                arr[k] = rightHalf[j];
                j++;
            }
            k++;
        }
        while(i < leftHalf.length){
            arr[k] = leftHalf[i];
            i++;
            k++;
        }
        while(j < rightHalf.length){
            arr[k] = rightHalf[j];
            j++;
            k++;
        }
        return arr;
    }
}