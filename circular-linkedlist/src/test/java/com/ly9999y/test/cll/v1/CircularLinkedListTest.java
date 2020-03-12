package com.ly9999y.test.cll.v1;

import org.junit.Before;
import org.junit.Test;

import java.util.Random;

public class CircularLinkedListTest {
	CircularLinkedList<Integer> circularLinkedList;

	@Before
	public void init() {
		circularLinkedList = new CircularLinkedList<>();
		Random random = new Random();
		final int size = random.nextInt(10) + 5;

		for (int i = 0; i < size; i++) {
			ListNode<Integer> integerListNode = new ListNode<>(random.nextInt(100));
			circularLinkedList.append(integerListNode);
		}
	}

	@Test
	public void testDisplay() {
		circularLinkedList.display();
	}

	@Test
	public void testAppend() {
		circularLinkedList.display();
		for (int i = 0; i < 100; i ++){
			circularLinkedList.append(new ListNode<Integer>(i));
		}
		circularLinkedList.display();
	}

	@Test
	public void testGet(){
		circularLinkedList.display();
		int size = circularLinkedList.size();
		System.out.println("size: \t" + size);
		System.out.println("-1: \t"+ circularLinkedList.get(-1));
		System.out.println("0: \t"+ circularLinkedList.get(0));
		System.out.println("1: \t"+ circularLinkedList.get(1));
		System.out.println("size/2:"+ size/2 +": \t"+ circularLinkedList.get(size/2));
		System.out.println("size:"+ size +": \t"+ circularLinkedList.get(size));
		System.out.println("size*2:"+ size/2 +": \t"+ circularLinkedList.get(size*2));
	}

	@Test
	public void testGet2(){
		circularLinkedList.display();
		for (int i= 0; i < 100; i++){
			System.out.println(i +":"+circularLinkedList.get(i));
		}
	}

	@Test
	public void testSize(){
		circularLinkedList.display();
		System.out.println(circularLinkedList.size());
	}

	@Test
	public void testInsert(){
		int i = 100;
		circularLinkedList.display();
		i ++;
		System.out.println("-1 位置插入"+ i +"后");
		System.out.println("插入结果："+ (circularLinkedList.insert(new ListNode<Integer>(i), -1)? "成功": "失败"));
		circularLinkedList.display();
		System.out.println();

		i ++;
		System.out.println("0 位置插入"+ i +"后");
		System.out.println("插入结果："+ (circularLinkedList.insert(new ListNode<Integer>(i), 0)? "成功": "失败"));
		circularLinkedList.display();
		System.out.println();

		i ++;
		System.out.println(circularLinkedList.size()/2 + " 位置插入"+ i +"后");
		System.out.println("插入结果："+ (circularLinkedList.insert(new ListNode<Integer>(i), circularLinkedList.size()/2)? "成功": "失败"));
		circularLinkedList.display();
		System.out.println();

		i ++;
		System.out.println(circularLinkedList.size() + " 位置插入"+ i +"后");
		System.out.println("插入结果："+ (circularLinkedList.insert(new ListNode<Integer>(i), circularLinkedList.size())? "成功": "失败"));
		circularLinkedList.display();
		System.out.println();

		i ++;
		System.out.println(circularLinkedList.size()*2 + " 位置插入"+ i +"后");
		System.out.println("插入结果："+ (circularLinkedList.insert(new ListNode<Integer>(i), circularLinkedList.size()*2)? "成功": "失败"));
		circularLinkedList.display();
	}

	@Test
	public void testDeleteByIndex(){
		circularLinkedList.display();

		System.out.println(-1 + " 位置" +circularLinkedList.get(-1)+ "删除后");
		System.out.println("删除结果："+ (circularLinkedList.delete(-1)? "成功": "失败"));
		circularLinkedList.display();
		System.out.println();

		System.out.println(0 + " 位置" +circularLinkedList.get(0)+ "删除后");
		System.out.println("删除结果："+ (circularLinkedList.delete(0)? "成功": "失败"));
		circularLinkedList.display();
		System.out.println();

		System.out.println(circularLinkedList.size()/2  + " 位置" +circularLinkedList.get(circularLinkedList.size()/2)+ "删除后");
		System.out.println("删除结果："+ (circularLinkedList.delete(circularLinkedList.size()/2)? "成功": "失败"));
		circularLinkedList.display();
		System.out.println();

		System.out.println(circularLinkedList.size() - 1  + " 位置" +circularLinkedList.get(circularLinkedList.size()-1)+ "删除后");
		System.out.println("删除结果："+ (circularLinkedList.delete(circularLinkedList.size() - 1)? "成功": "失败"));
		circularLinkedList.display();
		System.out.println();

		System.out.println(circularLinkedList.size()*2  + " 位置" +circularLinkedList.get(circularLinkedList.size()*2)+ "删除后");
		System.out.println("删除结果："+ (circularLinkedList.delete(circularLinkedList.size()*2)? "成功": "失败"));
		circularLinkedList.display();
		System.out.println();
	}

	@Test
	public void testDeleteByIndex2(){
		for (int i = 0; i < 100; i ++){
			circularLinkedList.append(new ListNode<Integer>(i));
		}
		circularLinkedList.display();
		for (int i = 0; i < 1000; i ++){
			circularLinkedList.display();
			circularLinkedList.delete(i);
		}
		circularLinkedList.display();
	}
}
