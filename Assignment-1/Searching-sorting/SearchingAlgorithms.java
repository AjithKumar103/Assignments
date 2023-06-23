package DSA.searching;

public class SearchingAlgorithms {

    // linear search
    public int linearSearch(int[] arr,int find){
        for (int i = 0; i < arr.length; i++){
            if(arr[i] == find){
                System.out.println("Element found at Index: " + i);
                return i;
            }
        }
        System.out.println("Not Found");
        return -1;
    }
    // binary search
    public int binarySearch(int[] arr, int find){
        int start = 0;
        int end = arr.length;
        int mid = (end + start) / 2;
        while (start < end && (arr[mid] != find)){
            if (find < arr[mid])
                end = mid - 1;
            else if (find > arr[mid])
                start = mid + 1;
            mid = (end + start) / 2;
        }
        if (arr[mid] == find){
            System.out.println("Found at Index: " + mid);
            return mid;
        }
        System.out.println("Not Found");
        return -1;
        }
}
