package com.udemy.app;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class BBJApp {
    public static void main(String[] args) {

        //Sets: no duplicate, not thread-safe

        Set<Integer> hashSet = new HashSet<>();
        hashSet.add(10);
        hashSet.add(20);
        hashSet.add(30);
        hashSet.add(40);

        System.out.println();
        System.out.println(hashSet.contains(10)); //true
        System.out.println(hashSet.contains(100)); //false

        for(Integer num: hashSet) {
            System.out.print(" num:"+num); //num:20 num:40 num:10 num:30 NOT ORDERED!
        }

        //============ LinkedHashSet : no duplicate, insertion order
        Set<Integer> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add(4);
        linkedHashSet.add(3);
        linkedHashSet.add(2);
        linkedHashSet.add(1);

        System.out.println();
        System.out.println(linkedHashSet.contains(1)); //true
        System.out.println(linkedHashSet.contains(100)); //false

        for(Integer num: linkedHashSet) {
            System.out.print(" num:"+num); //num:1 num:2 num:3 num:4 INSERTION ORDER IS KEPT!
        }

        //============ TreeSet : no duplicate, sorted order
        Set<Integer> treeSet = new TreeSet<>();
        treeSet.add(1);
        treeSet.add(5);
        treeSet.add(2);
        treeSet.add(0);

        System.out.println();
        System.out.println(treeSet.contains(1)); //true
        System.out.println(treeSet.contains(100)); //false

        for(Integer num: treeSet) {
            System.out.print(" num:"+num); //num:1 num:2 num:3 num:4 INSERTION ORDER IS KEPT!
        }

        //=========== PROBLEM: TreeSet are slow for add/remove
        // SOLUTION: use a HashSet<> for manip and TreeSet<> to order
        Set<Integer> hashSet2 = new HashSet<>();
        hashSet2.add(23);
        hashSet2.add(3);
        hashSet2.add(12);
        hashSet2.add(1);
        hashSet2.add(11);
        hashSet2.add(6);

        System.out.println("hashSet2: ");
        for (Integer in : hashSet2)
            System.out.println(" in:"+in);

        System.out.println("sortedSet: ");
        Set<Integer> sortedSet = new TreeSet<>(hashSet2);
        for (Integer in : sortedSet)
            System.out.println(" in:"+in);
    }
}
