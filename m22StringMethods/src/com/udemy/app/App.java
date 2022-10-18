package com.udemy.app;

import java.util.ArrayList;

public class App {

	/**
	 * String methods
	 **/

	public static void main(String[] args) {

		String str1 = "Adam";
		System.out.println(str1.length()); //4
		String str2 = "Johnson";
		String result = str1+str2;
		System.out.println(result); //AdamJohnson
		System.out.println(str1.concat(str2)); //AdamJohnson



		/**
		 * previously:
		 * 
		 * - length() method: returns the length of this string. e.g.: str1.length()
		 * - equals(Object anObject) method: a comparison of values in the objects. e.g.: str1.equals(str2)
		 * - intern() method: returns a canonical representation for the string object. e.g.: str1.intern();
		 */

		/**
		 * concat(String str) method
		 * As we have seen in the previous chapter this returns a new string that is string1 with string2 added to it
		 * at the end.
		 * 
		 * + operator
		 * Strings are more commonly concatenated with the + operator, and it brings the same results.
		 */

		String string1 = "Hello ";
		String string2 = "Java!";
		String string3 = string1.concat(string2);
		String string4 = string1 + string2;
		System.out.println(string3); // System.out.println(string4);
		System.out.println(string3.equals(string4));

		/**
		 * charAt(int index) method 
		 * Returns the specified character from the string.
		 */

		System.out.println("Char in search position: " + string1.charAt(1)); // "Hello " (1) -> e
		System.out.println("last Char: " + string1.charAt(string1.length()-1)); // -> o
		/*
		string1.charAt(10);
			Exception in thread "main" java.lang.StringIndexOutOfBoundsException: Index 10 out of bounds for length 6
			at java.base/jdk.internal.util.Preconditions$1.apply(Preconditions.java:55)
			at java.base/jdk.internal.util.Preconditions$1.apply(Preconditions.java:52)
			at java.base/jdk.internal.util.Preconditions$4.apply(Preconditions.java:213)
			at java.base/jdk.internal.util.Preconditions$4.apply(Preconditions.java:210)
			at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:98)
			at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:106)
			at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:302)
			at java.base/java.lang.String.checkIndex(String.java:4570)
			at java.base/java.lang.StringLatin1.charAt(StringLatin1.java:46)
			at java.base/java.lang.String.charAt(String.java:1527)
			at com.udemy.app.App.main(App.java:53)
		*/

		/**
		 * indexOf(String str)
		 * Returns the index within this string of the first occurrence of the specified substring.
		 */

		System.out.println("Found index is: " + string1.indexOf("llo")); // "Hello " -> "llo" -> 2

		/**
		 * substring(int beginIndex) method
		 * Returns a new string that is a substring of this string.
		 */

		String str = "Hello Java!";
		System.out.println(str.substring(6)); 		//Java!
		System.out.println(str.substring(6, 8)); 			//Ja

		/**
		 * replace(char oldChar, char newChar)
		 * Returns a new string resulting from replacing all occurrences of oldChar in this string with newChar.
		 * 
		 * replaceAll(String regex, String replacement)
		 * Replaces each substring of this string that matches the given regular expression with the given
		 * replacement.
		 */

		System.out.println(str.replace('J', 'L')); //Hello Lava!
		System.out.println(str.replaceAll("Java", "Peter")); //Hello Peter!

		/**
		 * trim() 
		 * Returns a copy of the string, with leading and trailing whitespace omitted.
		 */

		String s = "    trim is a useful method in Java    ";
		System.out.println(s + ".");     //    trim is a useful method in Java    .
		System.out.println(s.trim() + ".");    //trim is a useful method in Java.

		/**
		 * split(String regex, int limit)
		 * Splits this string around matches of the given regular expression.
		 * 
		 * regex: regular expression, limit: how many strings to be returned
		 */

		String strSplit = "string&split&method";
		String[] arrayOfStrings = strSplit.split("&", 3);

		for (String strSp : arrayOfStrings)
			System.out.println(strSp);

		/*
			strSplit.split("&", 2); //limit = 2 => second one contains remaining string:
			string
			split&method
		 */

		/**
		 * You can find other methods of String Class in the Java API documentation.
		 */

	}
}
