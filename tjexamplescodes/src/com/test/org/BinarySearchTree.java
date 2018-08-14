package com.test.org;

class BST {
	int data;
    BST left;
    BST right;
    public BST(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }

public void insertNode(int data) {
    BST root = this;
	// create new node
    BST newNode = new BST(data);
    if (root == null) {
    	root = newNode;
    	return;
    }
    BST prev = root, temp = root;
    while (temp != null) {
        prev = temp;
        if (data < temp.data) {
            temp = temp.left;
        } else if (data >= temp.data) {
            temp = temp.right;
        }
    }
    if (data < prev.data) {
        prev.left = newNode;
    } else {
        prev.right = newNode;
    }
}

public void printInorder(BST temp) {
    if (temp != null) {
		printInorder(temp.left);
		System.out.println(temp.data);
		printInorder(temp.right);
	}
}
}

public class BinarySearchTree {
    
	public static void main(String[] args) {
		BST root = new BST(50);
		root.insertNode(70);
		root.insertNode(30);
		root.insertNode(40);
		root.insertNode(20);
		root.insertNode(10);
		root.insertNode(60);
		System.out.println("Done!!!!!!");
		root.printInorder(root);
		
}
}
