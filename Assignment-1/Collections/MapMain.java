package collections;

import java.util.HashMap;
import java.util.Map;

public class MapMain {
    public static void main(String[] args) {
        Map<String,Integer> hashMap = new HashMap();
        hashMap.put("ID1",101);
        hashMap.put("ID2",102);
        hashMap.put("ID4",105);
        hashMap.putIfAbsent("ID3",103);
        System.out.println(hashMap);
        hashMap.remove("ID4",105);
        hashMap.remove("ID4");
        System.out.println("Remove operation: " + hashMap);
        System.out.println("Get the first element: " + hashMap.get("ID1"));
        System.out.println(hashMap.containsKey("ID4"));

        // value counts using hashmap
        int[] arr = {22,33,66,11,33,22,2,2,5,5,55,5,22,4};
        countElements(arr);
    }
    public static void countElements(int[] arr){
        Map<Integer,Integer> hashMap = new HashMap<>();
        for (int i = 0; i < arr.length; i++){
            if (hashMap.containsKey(arr[i]))
                hashMap.put(arr[i],hashMap.get(arr[i]) + 1);
            else
                hashMap.put(arr[i],1);
        }
        System.out.println(hashMap);
    }
}
