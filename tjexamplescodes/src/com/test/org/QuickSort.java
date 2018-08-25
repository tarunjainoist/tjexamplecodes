package com.test.org;

public class QuickSort {
	static int arr[] = {1,-10,-3,-98,52,9,76,8,2,45};

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		quickSort(0, arr.length-1);
		for (int x : arr) {
		System.out.println(x);
		}
	}
	public static void quickSort(int low, int high){
		if (low < high) {
		  int partitionIndex = partition(low, high);
		  quickSort(low, partitionIndex-1);
		  quickSort(partitionIndex+1, high);
		}
	}
	public static int partition(int low, int high){
		
		int partitionIndex = low;
		while (low < high) {
			while (low <= high && arr[high] > arr[partitionIndex]){
				high--;
			}
			while (low <= high && arr[low] <= arr[partitionIndex]){
				low++;
			}
			if(low < high) {
				//swap(low, high);
				int temp = arr[low];
				arr[low] = arr[high];
				arr[high] = temp;
			}
		}
		// if both low and high has crossed each other then swap partition index element with arr[high]
		if(low > high) {
			int temp = arr[partitionIndex];
			arr[partitionIndex] = arr[high];
			arr[high] = temp;
			partitionIndex = high;
		}
		return partitionIndex; 
	}

}
