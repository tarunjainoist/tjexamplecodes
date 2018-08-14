package com.test.org;

public class Queue {

	int arr[];
	int front, rear;
	public void enque (int data){
		if (rear + 1 == arr.length){
			System.out.println("Queue full");
			return;
		}
		if (front == -1 && arr.length > 0) {
			front++;
		}
		rear++;
		if (rear < arr.length){
		  arr[rear] = data; 
		}
	}
	public int deque (){
		int x;
		if (front == -1) {
			System.out.println("Queue empty");
			return -1;
		}
		x = arr[front];
		if (front == rear){
			front = -1;
			rear = -1;
		} else{
			front++;
		}
		return x;
	}
	public Queue() {
		front = -1;
		rear = -1;
	}
	public Queue(int size) {
		arr = new int[size];
		front = -1;
		rear = -1;
	}
	public static void main(String[] args) {
		Queue q = new Queue(3);
		q.enque(10);
		q.enque(20);
		q.enque(30);
		q.enque(40);
		q.enque(50);
		System.out.println(q.deque());
		System.out.println(q.deque());
		System.out.println(q.deque());
		System.out.println(q.deque());
		System.out.println(q.deque());
	}

}
