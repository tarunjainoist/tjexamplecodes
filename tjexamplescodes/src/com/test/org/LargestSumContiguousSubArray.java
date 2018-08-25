package com.test.org;

public class LargestSumContiguousSubArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int arr[] = {-2, -3, 4, -1, -2, 1, 5, -3};
      int max_here = arr[0], max_so_far = arr[0];
      for (int i = 1; i < arr.length; i++){
    	  if ((max_here + arr[i]) > arr[i]) {
    		  max_here = max_here + arr[i];
    	  } else {
    		  max_here = arr[i];
    	  }
    	  if (max_so_far < max_here) {
    		  max_so_far = max_here;
    	  }
      }
      System.out.println(max_so_far);
	}

}
