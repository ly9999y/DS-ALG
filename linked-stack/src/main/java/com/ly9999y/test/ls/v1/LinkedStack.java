package com.ly9999y.test.ls.v1;

public class LinkedStack<T> {
	private ListNode<T> head;
	private int size;

	public int size(){
		return size;
	}

	public void push(ListNode<T> node){
		if (0 == size){
			head = node;
		}
		else {
			node.setNext(head);
			head = node;
		}
		size ++;
	}

	public ListNode<T> pop(){
		if (0 == size){
			return null;
		}else {
			ListNode<T> tar = this.head;
			ListNode<T> next = this.head.getNext();
			head = next;
			size --;
			return tar;
		}
	}


	public String display(){
		StringBuffer stringBuffer = new StringBuffer();
		stringBuffer.append("{ ");
		ListNode<T> currentNode = head;
		while (null != currentNode){
			stringBuffer.append(currentNode.toString());
			if (null != currentNode.getNext()){ stringBuffer.append(" |-| "); }
			currentNode = currentNode.getNext();
		}
		stringBuffer.append(" }");
		System.out.println(stringBuffer.toString());
		return stringBuffer.toString();
	}
}
