package com.bbj;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

        //Stream.of() to create Stream<T>
        Stream.of("item1","item2","item3").findFirst().ifPresent(System.out::println); //item1
        Stream.of(10,20,30).findFirst().ifPresent(System.out::println); //10

        //.stream().filter()
        List<String> names = Arrays.asList("Alan", "Adam", "Kevin", "Joe", "James");
        System.out.println(names.stream().filter(name->name.startsWith("J")).count()); //2

        //Stream.iterate()
        Stream<Integer> numbers = Stream.iterate(1, n->n+1).limit(10);
        numbers.forEach(n->System.out.print(n+" ")); //1 2 3 4 5 6 7 8 9 10

        //Stream.generate()
        System.out.println();
        Stream<Double> randomNumbers = Stream.generate(Math::random).limit(10);
        randomNumbers.forEach(n->System.out.print(n+" "));

        //transform an Array of String into a Stream of String
        System.out.println();
        String[] title = {"This","is","just","an","example"};
        Stream<String> stream = Arrays.stream(title);
        //reduce(f) returns an Optional<T>, it "reduces" several values into 1 value
        //f(elem[0], elem[1]) => result then next iteration we do f(result, elem[3]), etc
        Optional<String> result = stream.reduce((word1, word2)->word1+"-"+word2);
        System.out.println(result); //Optional[This-is-just-an-example]
        System.out.println(result.get()); //This-is-just-an-example

        //map()
        List<String> words = Arrays.asList("this","is","again","an","example");
        List<String> wordsUpper = words.stream().map(String::toUpperCase).collect(Collectors.toList());
        wordsUpper.forEach(n->System.out.print(n+" ")); //THIS IS AGAIN AN EXAMPLE

        //flatMap()
        List<String> femaleNames = Arrays.asList("Kate","Judy","Nicole");
        List<String> maleNames = Arrays.asList("Kevin","Peter","Joe");
        List<List<String>> allNames = Arrays.asList(femaleNames, maleNames);
        System.out.println(allNames); //[[Kate, Judy, Nicole], [Kevin, Peter, Joe]]
        allNames.stream().map(list->list.stream()).collect(Collectors.toList()).forEach(System.out::println);
        /*
            java.util.stream.ReferencePipeline$Head@3e3abc88
            java.util.stream.ReferencePipeline$Head@6ce253f1
         */
        allNames.stream().flatMap(list->list.stream()).collect(Collectors.toList()).forEach(System.out::println);
        /*
        Kate
        Judy
        Nicole
        Kevin
        Peter
        Joe
         */
    }
}