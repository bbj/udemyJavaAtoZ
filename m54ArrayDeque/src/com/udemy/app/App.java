package com.udemy.app;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Deque;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;
import java.util.Vector;

public class App {

	/**
	 * ArrayDeque
	 * 
	 * ArrayDeque in Java provides a way to apply resizable-array in addition to the implementation of the Deque
	 * interface. It is also known as Array Double Ended Queue or Array Deck. This is a special kind of array that
	 * grows and allows users to add or remove an element from both the sides of the queue. It's not ThreadSafe.
	 * 
	 * add(object) add elements to the queue
	 * offer(object) insert the specified element into this queue
	 * remove() removes the head of this queue
	 * element() retrieves, but does not remove, the head of this queue
	 * peek() retrieves, but does not remove, the head of this queue, or returns null if this queue is empty
	 * poll() retrieves and removes the head of this queue, or returns null if this queue is empty
	 * 
	 * + 
	 * 
	 * addFirst() The method inserts particular element at the start of the deque.
	 * addLast() The method inserts particular element at the end of the deque. It is similiar to add() method
	 * removeFirst() : The method returns first element and also removes it
	 * removeLast() : The method returns last element and also removes it
	 **/

	public static void main(String[] args) {

		Deque<Integer> deque = new ArrayDeque<>();

		deque.add(10); //add at the end
		deque.add(11);
		deque.add(12);

		// num:10 num:11 num:12
		for (Integer num: deque)
			System.out.print(" num:"+num);

		deque.offerFirst(1); 1 10 11 12
		deque.offerLast(2); 1 10 11 12 2
		deque.offerFirst(3); 3 1 10 11 12 2
		deque.offerLast(4); 3 1 10 11 12 2 4
		
		//deque.removeLast();
		//deque.removeFirst();

		System.out.println("\nArrayDeque contains: ");
		for(Integer i : deque){
			System.out.println(i);
		}
		// 3 1 10 11 12 2 4

		deque.removeFirst(); // 1 10 11 12 2 4
	}
}
