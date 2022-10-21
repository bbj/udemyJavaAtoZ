package com.bbj;

import java.util.ArrayList;

public class App {
    public static void main(String[] args) {

        //non-generic, anything can be stored in it, everything stored as Object (int => Integer)
        ArrayList arrayList = new ArrayList();

        // Object

        arrayList.add(12);
        arrayList.add("Bruno");

        //int num = arrayList.get(0); //Compile-time error: Incompatible types. Found: 'java.lang.Object', required: 'int'
        int num = (int) arrayList.get(0);
        String name = (String) arrayList.get(1);
        System.out.println(num); //12
        System.out.println(name); //Bruno

        //Generic
        ArrayList<String> stringArrayList = new ArrayList<>();
        stringArrayList.add("Adam");
        String name1 = stringArrayList.get(0);
        System.out.println(name1); //Adam

        String[] names = {"Adam", "Kevin", "Joe"};
        printArray(names); //Java automatically substitutes the T with String! (same with Integer)
//        array1: Adam Kevin Joe
        Integer[] ages = {43, 56, 23};
        print2Arrays(names, ages);
//        array1: Adam Kevin Joe
//        array2: 43 56 23
    }

    public static <T>void printArray(T[] t) { //AVOID METHOD OVERLOADING!!!

        System.out.print("\narray: ");
        for (T value: t) {
            System.out.print(value+" ");
        }
    }

    public static <T,V>void print2Arrays(T[] t, V[] v) { //AVOID METHOD OVERLOADING!!!

        System.out.print("\narray1: ");
        for (T value: t) {
            System.out.print(value+" ");
        }

        System.out.print("\narray2: ");
        for (V value: v) {
            System.out.print(value+" ");
        }
    }
}
