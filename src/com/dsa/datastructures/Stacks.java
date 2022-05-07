package com.dsa.datastructures;

public class Stacks {
	
	int stackArray[] = new int[5];
	int top = 0;
	
	public void push(int data) {
		stackArray[top] = data;
		top++;
	}
	
	public int pop() {
		int poppedData = 0;
		if(isEmpty()) {
			System.out.println("No elements in the stack to pop");
		} else {
			top--;
			poppedData = stackArray[top];
			stackArray[top] = 0;
		}
		return poppedData;
	}
	
	public int peek() {
		int poppedData = 0;
		poppedData = stackArray[top-1];
		return poppedData;
	}
	
	public void show() {
		for(int stackData : stackArray) {
			System.out.println(stackData +"  ");
		}
	}
	
	public int size() {
		return top;
	}
	
	public boolean isEmpty() {
		return top<=0;
	}

}
