package com.bbj;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class App {
    public static void main(String[] args) {

        // ArrayList: USE when set and get needed, not good when add/remove
        List<String> arrayList = new ArrayList<>();
        // LinkedList: USE when data manip (add/remove), slow for  set and get
        List<String> linkedList = new LinkedList<>();

        // add object in ArrayList
        arrayList.add("Kevin");
        arrayList.add("Joe");
        arrayList.add("Peter");

        // add object in LinkedList
        linkedList.add("Kate");
        linkedList.add("Judy");
        linkedList.add("Julia");

        // iterate through an Iterator
        // (more complex to use)
        Iterator<String> arrayIterator = arrayList.iterator();
        System.out.println("ArrayList elements:");
        while (arrayIterator.hasNext()) {
            System.out.println(arrayIterator.next());
        }

        System.out.println();

        // iterate though with for-each loop
        // - simple for loop!
        // - because Collection implements Iterable
        System.out.println("LinkedList elements:");
        for (String s: linkedList) {
            System.out.println(s);
        }
    }
}
