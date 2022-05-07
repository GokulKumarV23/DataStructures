package com.dsa.datastructures;

public class DynamicStack {

	int capacity = 2;
	int stackArray[] = new int[capacity];
	int top = 0;
	
	public void push(int data) {
		
		if(size() == capacity) {
			expand();
		}
		stackArray[top] = data;
		top++;
	}
	
	public void expand() {
		int newStackArr[] = new int[capacity*2];
		System.arraycopy(stackArray, 0, newStackArr, 0, size());
		stackArray = newStackArr;
		capacity = capacity*2;
	}
	
	public void shrink() {
		int newStackArr[] = new int[size() <= ((capacity/2)/2) ? (capacity/2) : capacity];
		System.arraycopy(stackArray, 0, newStackArr, 0, size());
		stackArray = newStackArr;
		capacity = newStackArr.length;
	}
	
	public int pop() {
		int poppedData = 0;
		if(isEmpty()) {
			System.out.println("No elements in the stack to pop");
		} else {
			top--;
			poppedData = stackArray[top];
			stackArray[top] = 0;
			shrink();
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
