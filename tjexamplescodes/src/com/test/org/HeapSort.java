package com.test.org;

public class HeapSort {
    int  heapSize = 0;
    int arr[] = {1,45,-3,9,52,-98,76,8,2,-10};
    public HeapSort() {
		// TODO Auto-generated constructor stub
	    heapSize = arr.length ;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HeapSort heap = new HeapSort();
		heap.buildHeap();
		heap.heapSort();
	}
	
	//heapifies complete tree at a particular node i till all the leaf nodes below it in top down fashion.
	public void heapify(int i) {
		int currentNodeIndex = i;
		while (currentNodeIndex + 1 < heapSize) {
		  int leftNodeIndex = currentNodeIndex * 2 + 1;
		  int rightNodeIndex = currentNodeIndex * 2 + 2;
		  int maxNodeIndex = currentNodeIndex;
		  if (leftNodeIndex + 1 <= heapSize && arr[leftNodeIndex] > arr[maxNodeIndex]){
		    maxNodeIndex = leftNodeIndex;
		  }
		  if (rightNodeIndex + 1 <= heapSize && arr[rightNodeIndex] > arr[maxNodeIndex]){
		    maxNodeIndex = rightNodeIndex;
		  }
		  if (maxNodeIndex != currentNodeIndex) {
		    //swap the node value with its child with highest value
			int temp = arr[currentNodeIndex];
			arr[currentNodeIndex] = arr[maxNodeIndex];
			arr[maxNodeIndex] = temp;
			//update currentNode index as child's index which is next to be heapified
			currentNodeIndex = maxNodeIndex;
		  } else {
			// the node is already heapified as both the children below i are smaller than i.
			break;
		  }
		}
	}
	
	// applies heapify to all the non leaf node starting from the last non-leaf node till root node.
	public void buildHeap() {
		int lastNonLeafIndex = (heapSize - 2)/2;
		for (int i = lastNonLeafIndex; i >=0 ; i--){
			heapify(i);
		}
	}
	
	public void heapSort(){
		for (int i = heapSize-1; i >= 0; i--){
			//swap the first and last element
			System.out.println(arr[0]);
			int temp = arr[i];
			arr[i] = arr[0];
			arr[0] = temp;
			heapSize--;
			heapify(0);
		}
	}

}
