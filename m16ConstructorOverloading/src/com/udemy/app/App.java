package com.udemy.app;

public class App {

	/**
	 * Constructor Overloading with Constructor Chaining
	 **/

	public static void main(String[] args) {

		House house = new House(2, 3, 6);    
		house.print();
		System.out.println(house);
		// if toString() is defined: 			House{numDoors=2, numRooms=3, numWindows=6}
		// if not defined, JRE e.g. prints: 	com.udemy.app.House@85ede7b
		
		House house2 = new House(2, 4);    
		house2.print();
		System.out.println(house2);
		
		House house3 = new House();    
		house3.print();
	}
}
