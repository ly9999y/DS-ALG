package com.ly9999y.test.ls.v1;

import org.junit.Before;
import org.junit.Test;

import java.util.Random;

public class LinkedStackTest {

	LinkedStack<Integer> linkedStack;

	@Before
	public void init() {
		linkedStack = new LinkedStack<Integer>();
		Random random = new Random();
		final int size = random.nextInt(10) + 5;

		for (int i = 0; i < size; i++) {
			linkedStack.push(new ListNode<Integer>(i));
		}
	}

	@Test
	public void testDisplay() {
		linkedStack.display();
	}

	@Test
	public void testPush() {
		linkedStack.display();
		linkedStack.push(new ListNode<Integer>(100));
		linkedStack.display();
	}

	@Test
	public void testSize(){
		linkedStack.display();
		System.out.println(linkedStack.size());
	}

	@Test
	public void testPop(){
		linkedStack.display();
		for (int i = -5; i < 200; i++) {
			System.out.println(linkedStack.pop());
			linkedStack.display();
			System.out.println();
		}
	}
}
