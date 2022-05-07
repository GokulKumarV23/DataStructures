package com.dsa.main;

import com.dsa.datastructures.DynamicStack;
import com.dsa.datastructures.LinkedList;
import com.dsa.datastructures.Stacks;

public class MainClass {
	
	public static void main(String[] args) {
		
		System.out.println("Linked List\n");
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
		
		System.out.println("\nStack\n");
		
		Stacks stack = new Stacks();
		System.out.println("Is stack empty : " +stack.isEmpty());
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(4);
		stack.show();
		System.out.println("Before pop");
		System.out.println(stack.peek());
		System.out.println(stack.pop());
		System.out.println("After pop");
		stack.show();
		System.out.println("Stack size : " +stack.size());
		System.out.println("Is stack empty : " +stack.isEmpty());
		
		System.out.println("\nDynamic Stack\n");
		
		DynamicStack dynamicStack = new DynamicStack();
		
		dynamicStack.push(1);
		dynamicStack.push(2);
		dynamicStack.show();
		System.out.println("\nStack expanded * 2\n");
		dynamicStack.push(3);
		dynamicStack.show();
		System.out.println("\nStack Shrinked\n");
		dynamicStack.pop();
		dynamicStack.pop();
		dynamicStack.show();
	}

}
