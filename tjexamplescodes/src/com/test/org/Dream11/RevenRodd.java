package com.test.org.Dream11;

public class RevenRodd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Tech Discussions
		int arr[] = {12,3,5,7,13,12};
		System.out.println(plusMult(arr));
	}
	public static String plusMult(int arr[])
	{
		int Reven = 0, Rodd = 0;
		for(int i = 0; i < arr.length; i += 2)
		{
			if (arr[i]%2 == 0)
			{
				// ignore next even no.
				i += 2;
				continue;
			}
			i += 2;
			if(i < arr.length && arr[i]%2 == 0)
				continue;
			
			if (Reven == 0)
				Reven = 1;
			else
				Reven = 0;
		}
		for(int i = 1; i < arr.length; i += 2)
		{
			if (arr[i]%2 == 0)
			{
				// ignore next odd no.	
				i += 2;
				continue;
			}
				
			i += 2;
			if(i < arr.length && arr[i]%2 == 0)
				continue;
			
			if (Rodd == 0)
				Rodd = 1;
			else
				Rodd = 0;
		}
		if (Reven == Rodd)
			return "Neutral";
		if (Reven > Rodd)
			return "Even";
		return "Odd";
	}

}
