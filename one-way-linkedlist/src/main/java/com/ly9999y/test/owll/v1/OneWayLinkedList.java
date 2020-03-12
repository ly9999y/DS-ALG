package com.ly9999y.test.owll.v1;

/**
 * 单向链表操作类
 *
 * 首先得知道头结点
 * 基于头结点增删改查遍历
 */
public class OneWayLinkedList<T> {
	/**
	 * 头结点
	 */
	private ListNode<T> head;

	final boolean FAIL = false;
	final boolean SUCCESS = true;

	public OneWayLinkedList() {
	}

	public OneWayLinkedList(ListNode<T> head) {
		this.head = head;
	}

	/**
	 * 获取指定位置元素
	 * @param index
	 * @return
	 */
	public ListNode<T> get(int index){
		if(index < 0){
			return null;
		} else {
			int i = 0;
			ListNode<T> currentNode = head;
			while (null != currentNode){
				if (index == i){
					return currentNode;
				}
				currentNode = currentNode.getNext();
				i ++;
			}
			return null;
		}
	}

	/**
	 * 获取链表长度
	 * @return
	 */
	public int size(){
		int count = 0;
		ListNode<T> currentNode = head;
		while (null != currentNode){
			count ++;
			currentNode = currentNode.getNext();
		}
		return count;
	}

	/**
	 * 追加节点
	 * @param node
	 */
	public void append(ListNode<T> node){
		if (null == node){
			return;
		}
		if (null == head){
			head = node;
		}
		//遍历到尾结点，并设置尾结点的后继为当前插入的节点
		else {
			ListNode<T> currentNode = head;
			while (null != currentNode.getNext()){
				currentNode = currentNode.getNext();
			}
			//遍历结束，currentNode即为尾结点
			currentNode.setNext(node);
		}
	}

	/**
	 * 指定位置插入
	 * @param node
	 * @param posi
	 * @return
	 */
	public boolean insert(ListNode<T> node, int posi){

		if(null == node){
			return FAIL;
		}
		if (posi < 0){
			return FAIL;
		}
		//头部插入
		if (0 == posi){
			node.setNext(head);
			head = node;
			return SUCCESS;
		}
		//其他插入
		else {
			ListNode<T> preNode = this.get(posi - 1);
			if (null == preNode){
				return FAIL;
			}
			ListNode<T> nextNode = preNode.getNext();
			preNode.setNext(node);
			node.setNext(nextNode);
			return SUCCESS;
		}
	}

	/**
	 * 根据index删除结点
	 * @param index
	 * @return
	 */
	public boolean delete(int index){
		if (index < 0){
			return FAIL;
		}
		//删除头结点
		if (0 == index){
			ListNode<T> nextNode = head.getNext();
			head.setNext(null);
			head = nextNode;
			return SUCCESS;
		}
		//删除其他结点
		else {
			ListNode<T> preNode = this.get(index - 1);
			//前驱为空
			if (preNode == null){
				return FAIL;
			}
			ListNode<T> currentNode = preNode.getNext();
			//待删除结点为空
			if (null == currentNode){
				return FAIL;
			}
			ListNode<T> nextNode = currentNode.getNext();
			preNode.setNext(nextNode);
			currentNode.setNext(null);
			return SUCCESS;
		}
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
