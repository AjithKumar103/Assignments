package collections;

import java.util.*;

public class ListsMain {
    public static void main(String[] args) {
        // Implementing ArrayList
        // it is faster in storing and accessing
        List<Integer> arrayList = new ArrayList<>();
        System.out.println("========Array List Implementation=======");
        arrayList.add(23);
        arrayList.add(28);
        arrayList.add(30);
        arrayList.add(37);
        arrayList.add(40);

        System.out.println(arrayList);
        System.out.println(arrayList.get(0));
        System.out.println(arrayList.get(arrayList.size() - 1));
        arrayList.set(0,55);

        System.out.println(arrayList);
        arrayList.remove(0);
        System.out.println(arrayList);
        System.out.println(arrayList.contains(28));

        Iterator<Integer> itr = arrayList.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
        arrayList.clear();
        System.out.println(arrayList.isEmpty());

        // Linked List
        // Update and Deletion of elements is faster than arraylist
        List<Integer> linkedlist = new LinkedList<>();
        System.out.println("==========Linked List Implementation===========");
        linkedlist.add(30);
        linkedlist.add(35);
        linkedlist.add(37);
        linkedlist.add(40);
        System.out.println(linkedlist);
        linkedlist.set(0,25);
        System.out.println((linkedlist.size()));
        System.out.println(linkedlist.get(0));
        System.out.println(linkedlist.contains(30));
        System.out.println(linkedlist.isEmpty());
    }
}
