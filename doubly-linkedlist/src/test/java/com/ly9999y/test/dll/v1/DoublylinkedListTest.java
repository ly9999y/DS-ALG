package com.ly9999y.test.dll.v1;

import org.junit.Before;
import org.junit.Test;

import java.util.Random;

public class DoublylinkedListTest {

	DoublylinkedList<Integer> doublylinkedList;

	@Before
	public void init() {
		doublylinkedList = new DoublylinkedList<>();
		Random random = new Random();
		final int size = random.nextInt(10) + 5;

		for (int i = 0; i < size; i++) {
			ListNode<Integer> integerListNode = new ListNode<>(random.nextInt(100));
			doublylinkedList.append(integerListNode);
		}
	}

	@Test
	public void testDisplay() {
		doublylinkedList.display();
	}

	@Test
	public void testAppend() {
		doublylinkedList.display();
		doublylinkedList.append(new ListNode<Integer>(100));
		doublylinkedList.display();
	}

	@Test
	public void testGet(){
		doublylinkedList.display();
		int size = doublylinkedList.size();
		System.out.println("size: \t" + size);
		System.out.println("-1: \t"+ doublylinkedList.get(-1));
		System.out.println("0: \t"+ doublylinkedList.get(0));
		System.out.println("1: \t"+ doublylinkedList.get(1));
		System.out.println("size/2:"+ size/2 +": \t"+ doublylinkedList.get(size/2));
		System.out.println("size*2:"+ size/2 +": \t"+ doublylinkedList.get(size*2));
	}

	@Test
	public void testSize(){
		doublylinkedList.display();
		System.out.println(doublylinkedList.size());
	}

	@Test
	public void testInsert(){
		int i = 100;
		doublylinkedList.display();
		i ++;
		System.out.println("-1 位置插入"+ i +"后");
		System.out.println("插入结果："+ (doublylinkedList.insert(new ListNode<Integer>(i), -1)? "成功": "失败"));
		doublylinkedList.display();
		System.out.println();

		i ++;
		System.out.println("0 位置插入"+ i +"后");
		System.out.println("插入结果："+ (doublylinkedList.insert(new ListNode<Integer>(i), 0)? "成功": "失败"));
		doublylinkedList.display();
		System.out.println();

		i ++;
		System.out.println(doublylinkedList.size()/2 + " 位置插入"+ i +"后");
		System.out.println("插入结果："+ (doublylinkedList.insert(new ListNode<Integer>(i), doublylinkedList.size()/2)? "成功": "失败"));
		doublylinkedList.display();
		System.out.println();

		i ++;
		System.out.println(doublylinkedList.size() + " 位置插入"+ i +"后");
		System.out.println("插入结果："+ (doublylinkedList.insert(new ListNode<Integer>(i), doublylinkedList.size())? "成功": "失败"));
		doublylinkedList.display();
		System.out.println();

		i ++;
		System.out.println(doublylinkedList.size()*2 + " 位置插入"+ i +"后");
		System.out.println("插入结果："+ (doublylinkedList.insert(new ListNode<Integer>(i), doublylinkedList.size()*2)? "成功": "失败"));
		doublylinkedList.display();
	}

	@Test
	public void testDeleteByIndex(){
		doublylinkedList.display();

		System.out.println(-1 + " 位置删除后");
		System.out.println("删除结果："+ (doublylinkedList.delete(-1)? "成功": "失败"));
		doublylinkedList.display();
		System.out.println();

		System.out.println(0 + " 位置删除后");
		System.out.println("删除结果："+ (doublylinkedList.delete(0)? "成功": "失败"));
		doublylinkedList.display();
		System.out.println();

		System.out.println(doublylinkedList.size()/2  + " 位置删除后");
		System.out.println("删除结果："+ (doublylinkedList.delete(doublylinkedList.size()/2)? "成功": "失败"));
		doublylinkedList.display();
		System.out.println();

		System.out.println(doublylinkedList.size() - 1  + " 位置删除后");
		System.out.println("删除结果："+ (doublylinkedList.delete(doublylinkedList.size() - 1)? "成功": "失败"));
		doublylinkedList.display();
		System.out.println();

		System.out.println(doublylinkedList.size()*2  + " 位置删除后");
		System.out.println("删除结果："+ (doublylinkedList.delete(doublylinkedList.size()*2)? "成功": "失败"));
		doublylinkedList.display();
		System.out.println();
	}
}
