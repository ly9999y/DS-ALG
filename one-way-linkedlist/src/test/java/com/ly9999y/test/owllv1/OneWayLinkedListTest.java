package com.ly9999y.test.owllv1;

import org.junit.Before;
import org.junit.Test;

import java.util.Random;

public class OneWayLinkedListTest {

	OneWayLinkedList<Integer> oneWayLinkedList;

	@Before
	public void init() {
		oneWayLinkedList = new OneWayLinkedList<>();
		Random random = new Random();
		final int size = random.nextInt(10) + 5;

		for (int i = 0; i < size; i++) {
			ListNode<Integer> integerListNode = new ListNode<>(random.nextInt(100));
			oneWayLinkedList.append(integerListNode);
		}
	}

	@Test
	public void testDisplay() {
		oneWayLinkedList.display();
	}

	@Test
	public void testAppend() {
		oneWayLinkedList.display();
		oneWayLinkedList.append(new ListNode<Integer>(100));
		oneWayLinkedList.display();
	}

	@Test
	public void testGet(){
		oneWayLinkedList.display();
		int size = oneWayLinkedList.size();
		System.out.println("size: \t" + size);
		System.out.println("-1: \t"+ oneWayLinkedList.get(-1));
		System.out.println("0: \t"+ oneWayLinkedList.get(0));
		System.out.println("1: \t"+ oneWayLinkedList.get(1));
		System.out.println("size/2:"+ size/2 +": \t"+ oneWayLinkedList.get(size/2));
		System.out.println("size*2:"+ size/2 +": \t"+ oneWayLinkedList.get(size*2));
	}

	@Test
	public void testSize(){
		oneWayLinkedList.display();
		System.out.println(oneWayLinkedList.size());
	}

	@Test
	public void testInsert(){
		int i = 100;
		oneWayLinkedList.display();
		i ++;
		System.out.println("-1 位置插入"+ i +"后");
		System.out.println("插入结果："+ (oneWayLinkedList.insert(new ListNode<Integer>(i), -1)? "成功": "失败"));
		oneWayLinkedList.display();
		System.out.println();

		i ++;
		System.out.println("0 位置插入"+ i +"后");
		System.out.println("插入结果："+ (oneWayLinkedList.insert(new ListNode<Integer>(i), 0)? "成功": "失败"));
		oneWayLinkedList.display();
		System.out.println();

		i ++;
		System.out.println(oneWayLinkedList.size()/2 + " 位置插入"+ i +"后");
		System.out.println("插入结果："+ (oneWayLinkedList.insert(new ListNode<Integer>(i), oneWayLinkedList.size()/2)? "成功": "失败"));
		oneWayLinkedList.display();
		System.out.println();

		i ++;
		System.out.println(oneWayLinkedList.size() + " 位置插入"+ i +"后");
		System.out.println("插入结果："+ (oneWayLinkedList.insert(new ListNode<Integer>(i), oneWayLinkedList.size())? "成功": "失败"));
		oneWayLinkedList.display();
		System.out.println();

		i ++;
		System.out.println(oneWayLinkedList.size()*2 + " 位置插入"+ i +"后");
		System.out.println("插入结果："+ (oneWayLinkedList.insert(new ListNode<Integer>(i), oneWayLinkedList.size()*2)? "成功": "失败"));
		oneWayLinkedList.display();
	}

	@Test
	public void testDeleteByIndex(){
		oneWayLinkedList.display();

		System.out.println(-1 + " 位置删除后");
		System.out.println("删除结果："+ (oneWayLinkedList.delete(-1)? "成功": "失败"));
		oneWayLinkedList.display();
		System.out.println();

		System.out.println(0 + " 位置删除后");
		System.out.println("删除结果："+ (oneWayLinkedList.delete(0)? "成功": "失败"));
		oneWayLinkedList.display();
		System.out.println();

		System.out.println(oneWayLinkedList.size()/2  + " 位置删除后");
		System.out.println("删除结果："+ (oneWayLinkedList.delete(oneWayLinkedList.size()/2)? "成功": "失败"));
		oneWayLinkedList.display();
		System.out.println();

		System.out.println(oneWayLinkedList.size() - 1  + " 位置删除后");
		System.out.println("删除结果："+ (oneWayLinkedList.delete(oneWayLinkedList.size() - 1)? "成功": "失败"));
		oneWayLinkedList.display();
		System.out.println();

		System.out.println(oneWayLinkedList.size()*2  + " 位置删除后");
		System.out.println("删除结果："+ (oneWayLinkedList.delete(oneWayLinkedList.size()*2)? "成功": "失败"));
		oneWayLinkedList.display();
		System.out.println();
	}
}
