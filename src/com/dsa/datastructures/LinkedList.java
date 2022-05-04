package com.dsa.datastructures;

import com.dsa.model.Node;

public class LinkedList {
	
	Node head = null;
	
	public void insertAtStart(int data) {
		
		Node node = new Node();
		node.setData(data);
		node.setNext(null);
		
		if(head == null) {
			
			head = node;
			
		} else {
			Node n = head;
			node.setNext(n);
			head = node;
		}
		
	}
	
	public void insertAtAnywhere(int index, int data) {
		
		Node node = new Node();
		node.setData(data);
		node.setNext(null);
		
		if(index == 0) {
			insertAtStart(data);
		} else {
			Node n = head;
			for(int i = 0; i < index-1; i++) {
				n = n.getNext();
			}
			node.setNext(n.getNext());
			n.setNext(node);
		}
		
	}

	public void insertAtEnd(int data) {
		
		Node node = new Node();
		node.setData(data);
		node.setNext(null);
		
		if(head == null) {
			
			head = node;
			
		} else {
			
			Node n = head;
			
			while(n.getNext() != null) {
				n = n.getNext();
			}
			
			n.setNext(node);
			
		}
		
	}
	
	public void show() {
		
		Node node = head;
		
		while(node.getNext() != null) {
			System.out.println(node.getData());
			node = node.getNext();
		}
		
		System.out.println(node.getData());
		
	}
	
	public void delete(int index) {
		
		if(index == 0) {
			head = head.getNext();
		} else {
			
			Node n = head;
			Node n1 = null;
			
			for(int i = 0; i < index-1; i++) {
				n = n.getNext();
			}
			
			n1 = n.getNext();
			n.setNext(n1.getNext());
			n1 = null;
			
		}
		
	}
	
}
