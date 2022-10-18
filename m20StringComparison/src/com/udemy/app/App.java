package com.udemy.app;

public class App {

	/**
	 * Strings comparison
	 * 
	 * Difference between == and .equals() method both equals() method and �==� operator are used to compare
	 * objects to check equality, but there are differences between them:
	 * 
	 * == tests for reference equality (whether they are pointing to the same object). equals() it's a comparison
	 * of values in the objects (tests for value equality, whether they are logically "equal").
	 * 
	 * If a class does not override the equals method, then by default it uses equals(Object o) method of the
	 * closest parent class that has overridden this method.
	 * 
	 **/

	public static void main(String[] args) {

		// let's see our example from the previous lecture, and test comparisons:
		String n1 = "Kevin";
		String n2 = "Kevin";
		String n3 = new String("Kevin");
		String n4 = new String("Kevin");
		String n5 = new String("Peter");

		System.out.print("n1 == n2: "); // == is testing if same memory location!
		System.out.println(n1 == n2); // true (as the 2 references = same address in the String Constant Pool)
		System.out.print("n1.equals(n2): "); // equals() is testing if same value
		System.out.println(n1.equals(n2)); // true (as 2 values are the same)

		System.out.print("n2 == n3: ");
		System.out.println(n2 == n3); // false (as n2 is located in pool, and n3 on the heap, not in pool)
		System.out.print("n2.equals(n3): ");
		System.out.println(n2.equals(n3)); // true

		System.out.print("n3 == n4: ");
		System.out.println(n3 == n4); // false (2 new objects on the heap, at different locations)
		System.out.print("n3.equals(n4): ");
		System.out.println(n3.equals(n4)); // true

		System.out.print("n4 == n5: ");
		System.out.println(n4 == n5); // false (2 new objects on the heap, at different locations)
		System.out.print("n4.equals(n5): ");
		System.out.println(n4.equals(n5)); // false ("Kevin" different from "peter")

		// use equals() if you want to test whether two strings have the same value or
		// not

	}
}
