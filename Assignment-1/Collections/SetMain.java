package collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetMain {
    public static void main(String[] args) {
        // Hashset
        // it stores only unique elements
        // it stores in the order of unicode
        Set<String> hashSet = new HashSet<>();
        System.out.println("============ Hash Set Implementation ==============");
        hashSet.add("book");
        hashSet.add("book");
        hashSet.add("pencil");
        hashSet.add("pencil");
        hashSet.add("pen");
        hashSet.add("Pen");
        System.out.println(hashSet);
        System.out.println("Removing element " + hashSet.remove("Pen"));
        System.out.println(hashSet);

        // LinkedHashset
        // it also stores only unique elements
        // it stores in the order of insertion
        Set<String> linkedHashSet = new LinkedHashSet<>();
        System.out.println("============ Linked Hash Set Implementation ==============");
        linkedHashSet.add("book");
        linkedHashSet.add("book");
        linkedHashSet.add("pencil");
        linkedHashSet.add("pencil");
        linkedHashSet.add("pen");
        linkedHashSet.add("Pen");
        System.out.println(linkedHashSet);
        System.out.println("Removing element " + linkedHashSet.remove("Pen"));
        System.out.println(linkedHashSet);

        // TreeSet
        // it also stores only unique elements
        // it stores in the elements in ascending order
        Set<Integer> treeSet = new TreeSet<>();
        System.out.println("============ Tree Set Implementation ==============");
        treeSet.add(55);
        treeSet.add(22);
        treeSet.add(55);
        treeSet.add(1);
        treeSet.add(17);
        treeSet.add(17);
        System.out.println(treeSet);
        System.out.println("Removing element " + treeSet.remove(1));
        System.out.println(treeSet);
    }
}
