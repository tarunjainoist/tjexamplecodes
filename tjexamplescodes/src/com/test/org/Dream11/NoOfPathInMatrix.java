package com.test.org.Dream11;

public class NoOfPathInMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

/*		Tech Discussions
		1 1 0 1
		1 1 1 1
		0 1 1 1
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
arr[2][0]=0;
arr[2][1]=1;
arr[2][2]=1;
arr[2][3]=1;

		int x =	numOfPathsRecursion(arr, 0, 0, m, n);
		int y = numOfPathsDP(arr, m,n);
	System.out.println(x + " " + y);
	}

	public static int numOfPathsRecursion(int[][] arr, int i, int j, int m, int n)
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
		return numOfPathsRecursion(arr, i, j + 1, m, n) + numOfPathsRecursion(arr, i + 1, j, m, n);
	}
	
	public static int numOfPathsDP(int[][] arr, int m, int n)
	{
		int [][] temp = new int [m][n];
		
		for(int x = 0; x < m; x++ )
		{
			for(int y = 0; y < n; y++ )
			{
				if(x == 0 && y == 0)
				{
					temp[0][0] = 1;
					continue;
				}
				
				if (arr[x][y] == 1)
				{
					temp[x][y] = ((x-1) >= 0 ? temp[x-1][y] : 0) + ((y-1) >= 0 ? temp[x][y-1] : 0);
				}
				else
				{
					temp[x][y] = 0;
				}
			}	
		}
		return temp[m-1][n-1];
		
	}
}
