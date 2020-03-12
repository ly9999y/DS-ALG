package com.ly9999y.test.owllv1;

/**
 * 单向链表结点类
 * @param <T>
 */
public class ListNode<T> {
	/**
	 * 数据
	 */
	private T data;
	/**
	 * 前驱
	 */
	private ListNode<T> pre;
	/**
	 * 后继
	 */
	private ListNode<T> next;


	public ListNode() {
	}

	public ListNode(T data) {
		this.data = data;
	}

	public ListNode(T data, ListNode<T> pre, ListNode<T> next) {
		this.data = data;
		this.pre = pre;
		this.next = next;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

	public ListNode<T> getPre() {
		return pre;
	}

	public void setPre(ListNode<T> pre) {
		this.pre = pre;
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
