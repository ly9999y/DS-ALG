package com.ly9999y.test.lq.v1;

public class LinkedQueue<T> {
	private ListNode<T> head;
	private ListNode<T> tail;
	private int size;


	/**
	 * 队尾添加元素
	 * @return
	 */
	public void append(ListNode<T> node){
		if (null == node){
			throw new NullPointerException("node can not be null");
		}
		if(null == head && null == tail){
			head = node;
		}
		else {
			tail.setNext(node);
		}
		tail = node;
		size ++;
	}

	/**
	 * 返回并移除头元素
	 * @return
	 */
	public ListNode<T> poll(){
		if (0 == size){
			return null;
		}
		else if (1 == size){
			ListNode<T> tarNode = this.head;
			head = null;
			tail = null;
			size -- ;
			return tarNode;
		}else {
			ListNode<T> tarNode = this.head;
			ListNode<T> next = tarNode.getNext();
			head = next;
			size -- ;
			return tarNode;
		}
	}
	/**
	 * 获取队列大小
	 * @return
	 */
	public int size(){
		return this.size;
	}

	/**
	 * 打印结果
	 * @return
	 */
	public String display(){
		StringBuffer stringBuffer = new StringBuffer();
		stringBuffer.append("{ ");
		ListNode<T> currentNode = head;
		while (null != currentNode){
			stringBuffer.append(currentNode.toString());
			if (null != currentNode.getNext()){
				stringBuffer.append(" -> ");
			}
			currentNode = currentNode.getNext();
		}
		stringBuffer.append(" }");
		System.out.println(stringBuffer.toString());
		return stringBuffer.toString();
	}
}
