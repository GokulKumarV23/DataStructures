package com.dsa.model;

public class Node {
	
	int data;
	Node next;
	
	public int getData() {
		return data;
	}
	public void setData(int data) {
		this.data = data;
	}
	public Node getNext() {
		return next;
	}
	public void setNext(Node next) {
		this.next = next;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Node [data=");
		builder.append(data);
		builder.append(", next=");
		builder.append(next);
		builder.append("]");
		return builder.toString();
	}

}
