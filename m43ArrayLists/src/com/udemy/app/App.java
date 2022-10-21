package com.udemy.app;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class App {

	/**
	 * 
	 * Iterating over an ArrayList & ArrayList sorting
	 * 
	 **/

	/**
	 * ArrayList methods
	 *
	 * add() : insert a new value in the ArrayList (or into a specific position)
	 * remove() : remove the first matching value in the ArrayList (or remove the element at a specified index)
	 * set() : changes one of the elements of the ArrayList without changing the size
	 * contains() : checks whether a certain value is in the ArrayList
	 * size() : shows the size of the ArrayList
	 * clear() : provides an easy way to discard all elements of the ArrayList
	 * isEmpty() : shows the ArrayList is empty or not
	 * equals() : ArrayList has a custom implementation of equals() so you can compare two lists to see if they
	 * 		contain the same elements in the same order
	 **/

	public static void main(String[] args) {

		//List<String> list = new ArrayList<>(); //ok because ArrayList implements interface List

		// loop through an ArrayList with the for-each loop
		List<String> names = new ArrayList<>();
		names.add("Joe"); // The add() methods insert a new value in the ArrayList.
		names.add("Kevin");
		names.add("Alan");
		names.add("James");
		for (String n : names) {
			System.out.println(n);
		}

		//another way to print
		System.out.println(Arrays.toString(names.toArray())); //[Joe, Kevin, Alan, James]

		System.out.println(); // separation line

		// ArrayList is a part of the Java collection framework that's why we can use Collections.sort statement
		Collections.sort(names); //merge sort => O(NlogN)
		System.out.println("Sorted names:");
		for (String n : names) {
			System.out.println(n);
		}

		//======================================= methods ======================================================
		/*
			Current elements in the Cars ArrayList:  Ford  Honda  Mercedes  Toyota
			Current elements in the Cars ArrayList:  Ford  Honda  Kia  Mercedes  Toyota
			Current elements in the Cars ArrayList:  Ford  Honda  Mercedes
			Current elements in the Cars ArrayList:  Tesla  Honda  Mercedes
			false
			3
			Current elements in the Cars ArrayList:
			true
			false
		 */


		/**
		 * add() method
		 */
		ArrayList<String> cars = new ArrayList<String>();
		cars.add("Ford");
		cars.add("Honda");
		cars.add("Mercedes");
		cars.add("Toyota");

		showArrayList(cars); // Ford  Honda  Mercedes  Toyota

		cars.add(2, "Kia");
		// cars.add(10, "Kia"); //if the position does not fit for the ArrayList:
		// IndexOutOfBoundsException

		showArrayList(cars); //Ford  Honda  Kia  Mercedes  Toyota

		/**
		 * remove() method
		 */
		cars.remove("Toyota");
		cars.remove(2);
		// cars.remove(10); //if the position does not exists in the ArrayList:
		// IndexOutOfBoundsException

		showArrayList(cars); //Ford  Honda  Mercedes

		/**
		 * set() method
		 */
		cars.set(0, "Tesla");

		showArrayList(cars); //Tesla  Honda  Mercedes

		/**
		 * contains & size() methods
		 */
		System.out.println(cars.contains("Ford")); //false
		System.out.println(cars.size()); //3

		/**
		 * clear() method
		 */
		cars.clear();
		showArrayList(cars); //""

		/**
		 * isEmpty() method
		 */
		System.out.println(cars.isEmpty()); //true

		/**
		 * equals() method
		 */
		ArrayList<String> cars2 = new ArrayList<String>();
		cars.add("Nissan");
		System.out.println(cars.equals(cars2)); //false


	}

	public static void showArrayList(ArrayList<String> cars) {
		System.out.print("Current elements in the Cars ArrayList:  ");
		for (String c : cars) {
			System.out.print(c + "  ");
		}
		System.out.println(); // separation line
	}
}
