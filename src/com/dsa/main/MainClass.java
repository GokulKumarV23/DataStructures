package com.dsa.main;

import com.dsa.datastructures.LinkedList;

public class MainClass {
	
	public static void main(String[] args) {
		
		LinkedList linkedList = new LinkedList();
		
		linkedList.insertAtStart(5);
		
		linkedList.insertAtEnd(1);
		linkedList.insertAtEnd(2);
		linkedList.insertAtEnd(3);
		
		linkedList.insertAtStart(4);
		
		linkedList.insertAtAnywhere(2, 6);
		linkedList.insertAtAnywhere(0, 7);
		
		System.out.println("Before deletion");
		linkedList.show();
		System.out.println("After deletion");
		linkedList.delete(0);
		linkedList.delete(2);
		linkedList.show();
	}

}
