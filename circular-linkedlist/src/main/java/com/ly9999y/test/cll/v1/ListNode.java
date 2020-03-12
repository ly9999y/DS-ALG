package com.ly9999y.test.cll.v1;

/**
 * 循环链表结点
 * @param <T>
 */
public class ListNode<T> {
	private T data;
	private ListNode<T> next;

	public ListNode() {}
	public ListNode(T data) { this.data = data; }

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

	public ListNode<T> getNext() {
		return next;
	}

	public void setNext(ListNode<T> next) {
		this.next = next;
	}

	@Override
	public String toString() {
		return data.toString();
	}
}
