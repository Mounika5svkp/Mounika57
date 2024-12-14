package org.tnsif.capgemini.c2tc.collectionsdemo;

import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueDemo {

	public static void main(String[] args) {
		Queue<Integer> pq=new PriorityQueue<>();
		
		pq.add(2);
		pq.add(20);
		pq.add(65);
		pq.add(80);
		
		
		System.out.println(pq);
		System.out.println(pq.poll());
		System.out.println(pq);
		System.out.println(pq.poll());
		System.out.println(pq);
		System.out.println(pq.poll());
		System.out.println(pq);

	}

}