package com.bbj;

import java.util.PriorityQueue;
import java.util.Queue;

public class App {
    public static void main(String[] args) {

        //Dijkstra's algo relies heavily on this data structure
        Queue<AccessCard> queue = new PriorityQueue<>();

        AccessCard accessCard = new AccessCard("card1", 5);
        queue.add(new AccessCard("card1", 5));
        queue.add(new AccessCard("card2", 3));
        queue.add(new AccessCard("card3", 7));

        System.out.println(queue.poll()); //AccessCard{name='card2', id=3}
        System.out.println(queue.poll()); //AccessCard{name='card1', id=5}
        System.out.println(queue.poll()); //AccessCard{name='card2', id=7}

        queue.add(new AccessCard("card1", 5));
        queue.add(new AccessCard("card2", 3));
        queue.add(new AccessCard("card3", 7));
        while (queue.peek() != null) {
            System.out.println(queue.poll());
        }
    }
}
