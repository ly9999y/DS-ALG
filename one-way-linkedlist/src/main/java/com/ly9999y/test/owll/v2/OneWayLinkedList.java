package com.ly9999y.test.owll.v2;

public class OneWayLinkedList<T> {

	private ListNode<T> head;

	final boolean FAIL = false;
	final boolean SUCCESS = true;

	public T get(int index){
		ListNode<T> node = this.getElement(index);
		if (null == node){ return null; }
		else { return node.getData(); }
	}

	public int size(){
		int count = 0;
		ListNode<T> currentNode = head;
		while (null != currentNode){
			count ++;
			currentNode = currentNode.getNext();
		}
		return count;
	}

	public void append(T value){
		if (null == head){ head = new ListNode<T>(value); }
		else {
			ListNode<T> currentNode = head;
			while (null != currentNode.getNext()){
				currentNode = currentNode.getNext();
			}
			currentNode.setNext(new ListNode<T>(value));
		}
	}

	public boolean insert(T value, int posi){
		if (posi < 0){ return FAIL; }
		ListNode<T> node = new ListNode<>(value);
		if (0 == posi){
			node.setNext(head);
			head = node;
			return SUCCESS;
		}
		else {
			ListNode<T> preNode = this.getElement(posi - 1);
			if (null == preNode){ return FAIL; }
			ListNode<T> nextNode = preNode.getNext();
			preNode.setNext(node);
			node.setNext(nextNode);
			return SUCCESS;
		}
	}

	public boolean delete(int index){
		if (index < 0){ return FAIL; }
		if (0 == index){
			ListNode<T> nextNode = head.getNext();
			head.setNext(null);
			head = nextNode;
			return SUCCESS;
		}
		else {
			ListNode<T> preNode = this.getElement(index - 1);
			if (preNode == null){ return FAIL; }
			ListNode<T> currentNode = preNode.getNext();
			if (null == currentNode){ return FAIL; }
			ListNode<T> nextNode = currentNode.getNext();
			preNode.setNext(nextNode);
			currentNode.setNext(null);
			return SUCCESS;
		}
	}

	private ListNode<T> getElement(int index){
		if(index < 0){ return null; }
		else {
			int i = 0;
			ListNode<T> currentNode = head;
			while (null != currentNode){
				if (index == i){ return currentNode; }
				currentNode = currentNode.getNext();
				i ++;
			}
			return null;
		}
	}

	public String display(){
		StringBuffer stringBuffer = new StringBuffer();
		stringBuffer.append("{ ");
		ListNode<T> currentNode = head;
		while (null != currentNode){
			stringBuffer.append(currentNode.toString());
			if (null != currentNode.getNext()){ stringBuffer.append(" -> "); }
			currentNode = currentNode.getNext();
		}
		stringBuffer.append(" }");
		System.out.println(stringBuffer.toString());
		return stringBuffer.toString();
	}

	private class ListNode<T> {
		private T data;
		private ListNode<T> pre;
		private ListNode<T> next;
		public ListNode() { }
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
}
