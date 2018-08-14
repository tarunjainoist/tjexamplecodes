package com.test.org;

public class Stack {
	int arr[];
	int top;
	public void push (int data){
		if (top + 1 == arr.length){
			System.out.println("Stack full");
			return;
		}
		top++;
		arr[top] = data;
	}
	public int pop (){
		int x;
		if (top == -1) {
			System.out.println("Stack empty");
			return -1;
		}
		x = arr[top];
		top--;
		return x;
	}
	public Stack() {
		top = -1;
	}
	public Stack(int size) {
		arr = new int[size];
		top = -1;
	}
	public static void main(String[] args) {
		Stack s = new Stack(3);
		s.push(10);
		s.push(20);
		s.push(30);
		s.push(40);
		s.push(50);
		System.out.println(s.pop());
		System.out.println(s.pop());
		System.out.println(s.pop());
		System.out.println(s.pop());
		System.out.println(s.pop());
		System.out.println(s.pop());
	}
}
