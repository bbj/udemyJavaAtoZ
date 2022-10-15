package com.udemy.app;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class App {

	/**
	 * Stream 1 - Operation of the Stream
	 **/

	public static void main(String[] args) {

		/**
		 * example 1
		 */
		List<String> names = Arrays.asList("Alan", "James", "Kevin", "Joe");
		List<String> filteredNames = names.stream().filter(name -> name.startsWith("J")).collect(Collectors.toList());
		names.forEach(System.out::println);
		System.out.println(""); // new line
		filteredNames.forEach(System.out::println);

		/**
		 * example 2
		 */
//		System.out.println(""); //new line	
//		names.stream().filter(name -> name.startsWith("J")).forEach(System.out::println);
//		names.forEach(System.out::println);

		/**
		 * example 3
		 */
//		System.out.println("\n Stream example: ");
//		Stream<String> str = names.stream().filter(name -> name.startsWith("J"));
//		str.forEach(System.out::println);

		/**
		 * example 4
		 */
//		str.forEach(System.out::println);

	}

}
