package com.ly9999y.test.lq.v1;

import org.junit.Before;
import org.junit.Test;

import java.util.Random;

public class LinkedQueueTest {

	LinkedQueue<Integer> linkedQueue;

	@Before
	public void init() {
		linkedQueue = new LinkedQueue<>();
		Random random = new Random();
		final int size = random.nextInt(10) + 5;

		for (int i = 0; i < size; i++) {
			ListNode<Integer> integerListNode = new ListNode<>(i);
			linkedQueue.append(integerListNode);
		}
	}

	@Test
	public void testDisplay() {
		linkedQueue.display();
	}

	@Test
	public void testSize(){
		linkedQueue.display();
		System.out.println(linkedQueue.size());
	}

	@Test
	public void testAppend() {
		linkedQueue.display();
		for (int i = 0; i < 100; i++) {
			linkedQueue.append(new ListNode<Integer>(i));
		}
		linkedQueue.display();
	}

	@Test
	public void testPoll() {
		for (int i = 0; i < 100; i++) {
			linkedQueue.append(new ListNode<Integer>(i));
		}
		linkedQueue.display();
		for (int i = -10; i < 200; i++) {
			ListNode<Integer> poll = linkedQueue.poll();
			System.out.println(poll);
			linkedQueue.display();
			System.out.println();
		}
	}
}
