package com.bbj;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

        List<String> names = Arrays.asList("Adam.", "Kevin.", "Joe.", "Alan.", "Natalie.");
        //the source of the stream is names, a Collection
        List<String> filteredNames = names.stream()         //create stream instance
                .filter(name -> name.startsWith("A"))       //intermediate operation
                .collect(Collectors.toList());              //terminal operation
        //print results using method reference
        filteredNames.forEach(System.out::print); //Adam.Alan.

        //another way, without a collector at the end
        System.out.println();
        names.stream().filter(name -> name.startsWith("A")).forEach(System.out::print);//Adam.Alan.

        //we can store the result as a stream
        Stream<String> stream = names.stream().filter(name -> name.startsWith("A"));
        //then print the stream or eventually do further operations on it
        System.out.println();
        stream.forEach(System.out::print); //Adam.Alan.
    }
}