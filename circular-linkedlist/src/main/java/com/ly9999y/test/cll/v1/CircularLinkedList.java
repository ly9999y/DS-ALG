package com.ly9999y.test.cll.v1;

public class CircularLinkedList<T> {
	private ListNode<T> head;
	/**
	 * 最好有个直接获取链表大小的字段，因为取值塞值的时候是循环的，index值可能远大于链表长度
	 */
	private int size;
	final boolean FAIL = false;
	final boolean SUCCESS = true;
	//有size属性的情况下，获取链表长度最好用这个函数，效率高
	public int getSize() {
		return size;
	}


	public ListNode<T> get(int index){
		if (index < 0){
			return null;
		}
		if (null == head){
			return null;
		}
		index %= size;
		int i = 0;
		ListNode<T> currentNode = this.head;
		do {
			if (index == i){
				return currentNode;
			}
			currentNode = currentNode.getNext();
			i++;
		}
		while (head != currentNode);
		return null;
	}

	@Deprecated
	public int size() {
		if (null == this.head) {
			return 0;
		} else {
			int count = 0;
			ListNode<T> currentNode = this.head;
			do {
				count++;
				currentNode
						=
						currentNode.getNext();
			}
			while (head != currentNode);
			return count;
		}
	}

	/**
	 * 末尾追加
	 * @param node
	 */
	public void append(ListNode<T> node){
		if (null == node){
			return;
		}
		if (null == this.head){
			head = node;
			head.setNext(head);
			size = 1;
		}
		else {
			ListNode<T> currentNode = this.head;
			while (this.head != currentNode.getNext()){
				currentNode = currentNode.getNext();
			}
			currentNode.setNext(node);
			node.setNext(head);
			size ++;
		}
	}

	/**
	 * 指定位置插入
	 * 插入指定结点时候就不要循环了，要不然会遇到插入结点位置等于长度的时候，
	 * 即插入点位置比当前尾结点索引大1的时候，是追加到尾结点后面，还是设置为头结点的尴尬
	 * @param node
	 * @param posi
	 * @return
	 */
	public boolean insert(ListNode<T> node, int posi){
		if (null == node){
			return FAIL;
		}
		if (posi < 0 || posi > size){
			return FAIL;
		}

		//如果插入点为0，则需要调整head
		if (0 == posi){
			ListNode<T> prevNode = get(size - 1);
			prevNode.setNext(node);
			node.setNext(head);
			head = node;
		}else {
			ListNode<T> prevNode = get(posi - 1);
			ListNode<T> nextNode = prevNode.getNext();
			prevNode.setNext(node);
			node.setNext(nextNode);
		}
		size ++;
		return SUCCESS;
	}

	/**
	 * 删除结点
	 * @param index
	 * @return
	 */
	public boolean delete(int index){
		if (null == head || size == 0){
			return FAIL;
		}
		if (index < 0){
			return FAIL;
		}
		index %= size;
		if (0 == index){
			//说明删干净了，就剩头节点了
			if (head == head.getNext()){
				head = null;
			}else {
				ListNode<T> prevNode = get(size - 1);
				ListNode<T> nextNode = head.getNext();
				prevNode.setNext(nextNode);
				head.setNext(null);
				head = null;
				head = nextNode;
			}
		}else {
			ListNode<T> prevNode = get(index - 1);
			ListNode<T> currentNode = prevNode.getNext();
			prevNode.setNext(currentNode.getNext());
			currentNode.setNext(null);
			currentNode = null;
		}
		size --;
		return SUCCESS;
	}

	public String display(){
		StringBuffer stringBuffer = new StringBuffer();
		stringBuffer.append("{-> ");
		if (null != head){
			ListNode<T> currentNode = head;
			do{
				stringBuffer.append(currentNode.toString());
				if (head != currentNode.getNext()){
					stringBuffer.append(" - ");
				}
				currentNode = currentNode.getNext();
			}while (head != currentNode);
		}

		stringBuffer.append(" ->}");
		System.out.println(stringBuffer.toString());
		return stringBuffer.toString();
	}
}
