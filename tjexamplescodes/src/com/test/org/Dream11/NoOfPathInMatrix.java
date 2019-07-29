package com.test.org;

public class NoOfPathInMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

/*		Tech Discussions
		1 1 0 1
		1 1 1 1
		1 0 1 1
*/
int m,n;
m = 3; n = 4;

		int [][] arr = new int [m][n];
arr[0][0]=1;
arr[0][1]=1;
arr[0][2]=0;
arr[0][3]=1;
arr[1][0]=1;
arr[1][1]=1;
arr[1][2]=1;
arr[1][3]=1;
arr[2][0]=1;
arr[2][1]=0;
arr[2][2]=1;
arr[2][3]=1;
		int x =	numOfPaths(arr, 0, 0, m, n);
	System.out.println(x);
	}

	public static int numOfPaths(int[][] arr, int i, int j, int m, int n)
	{
		if(i == m || j == n)
			return 0;
		
		if (arr[i][j] == 0)
			return 0;
		if (i == m - 1 && j == n - 1)
		{
			if (arr[i][j] == 1)
				return 1;
			return 0;
		}
		return numOfPaths(arr, i, j + 1, m, n) + numOfPaths(arr, i + 1, j, m, n);
	}
}
