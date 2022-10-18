package com.udemy.app;

import java.util.ArrayList;

public class App {

	/**
	 * String VS String Builder VS String Buffer
	 **/

	public static void main(String[] args) {

		/**
		 * String VS String Builder object generation / hashCode()
		 */

		String string = "Alexander";
		System.out.println(string.hashCode());
		string = string + " the Great";
		System.out.println(string.hashCode());
		System.out.println(string);

		StringBuilder sb = new StringBuilder("Alexander");
		System.out.println(sb.hashCode());
		sb.append(" the Great");
		System.out.println(sb.hashCode()); //we update the same object => same hashCode() (memory address)
		System.out.println(sb);

		/**
		 * HashCode() method is used to generate a numerical representation of the contents of an object. By default
		 * the hashCode() returns an integer that represents the internal memory address of the object. Whenever it is
		 * invoked on the same object more than once during an execution of a Java application, the hashCode method
		 * must consistently return the same integer.
		 */

		/**
		 * String Buffer VS String Builder speed comparison
		 */

		// String Buffer
		StringBuffer stringbuffer = new StringBuffer();
		long startTime = System.currentTimeMillis();

		for (int i = 0; i < 10000000; i++) {
			stringbuffer.append("Java");
		}

		long endTime = System.currentTimeMillis();
		long duration = endTime - startTime;
		System.out.println("Duration of StringBuffer's running is: " + duration + " milliSecond");

		// String Builder
		StringBuilder stringbuilder = new StringBuilder();
		long startTime2 = System.currentTimeMillis();

		for (int i = 0; i < 10000000; i++) { //10 millions times
			stringbuilder.append("Java");
		}

		long endTime2 = System.currentTimeMillis();
		long duration2 = endTime2 - startTime2;
		System.out.println("Duration of StringBuilder's running is: " + duration2 + " milliSecond");

		/* Java 19 on Nano2
		Duration of StringBuffer's running is: 252 milliSecond
		Duration of StringBuilder's running is: 48 milliSecond
		 */

		//=================== StringBuilder methods ===============================

		/**
		 * charAt(), indexOf(), length(), and substring() These methods work exactly the same as in the String class.
		 */

		/**
		 * append()
		 * This method is by far the most frequently used method in StringBuilder. Let's see method chaining with
		 * append!
		 */

		StringBuilder strBuilder = new StringBuilder("Wall Street ");
		strBuilder = strBuilder.append(12).append(", ").append("New York");
		System.out.println(strBuilder); //Wall Street 12, New York

		/**
		 * insert()
		 * This method adds characters to the StringBuilder at the requested index and returns a reference to the
		 * current StringBuilder.
		 */

		System.out.println(strBuilder.insert(15, " 5th floor,")); //Wall Street 12, 5th floor, New York

		/**
		 * delete()
		 * This method removes the characters in a substring of this sequence.
		 */

		System.out.println(strBuilder.delete(15, 26)); //Wall Street 12, New York

		/**
		 * reverse()
		 * This method causes this character sequence to be replaced by the reverse of the sequence.
		 */

		System.out.println(strBuilder.reverse()); //kroY weN ,21 teertS llaW

		/**
		 * toString()
		 * Often StringBuilder is used internally for performance purposes but the end result needs to be a String.
		 * For example, maybe it needs to be passed to another method that is expecting a String.
		 */

		String s = strBuilder.toString();
		System.out.println(s); //kroY weN ,21 teertS llaW

		/**
		 * You can find other methods of String Class in the Java API documentation.
		 */

	}
}
