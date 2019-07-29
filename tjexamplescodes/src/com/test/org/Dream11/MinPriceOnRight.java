package com.test.org.Dream11;

import java.util.Set;
import java.util.TreeSet;

public class MinPriceOnRight {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Tech Discussions
		int [] arr={2,3,1,2,4,2};
		finalPrice(arr);
	}
	
	public static void finalPrice(int arr[]){
		int min = Integer.MAX_VALUE;
		int sum = 0;
		Set <Integer> ts = new TreeSet<Integer>();
		for(int i = arr.length - 1; i >= 0; i--)
		{
			if (min <= arr[i])
			{
				sum = sum + arr[i] - min;
				
			}
			else
			{
				sum = sum + arr[i];
				ts.add(i);
				
			}
			if (min > arr[i])
			{
				min = arr[i];
			}
		}
		System.out.println(sum);
		System.out.println(ts);
		
	}

}
