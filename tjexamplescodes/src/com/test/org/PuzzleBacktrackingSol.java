package com.test.org;

/*
fill below with 1 to 9 number without repeating
     _ _ // line 1
     x _
     _ _ // line 2
   + _ _
     _ _ // line 3
 */

public class PuzzleBacktrackingSol {

    public static void main(String [] args) {
        int arr []= {1, 2, 3, 4, 5, 6, 7, 8, 9};
        // try all possible combination of this array
        findCorrectCombination(arr, 0, 8);
        for (int i = 0; i < 9; i++){
            System.out.print(arr[i] + ", ");
        }
    }
    public static boolean isValidArray(int arr[]) {
        int line1 = arr[0] * 10 + arr[1];
        int line2 = line1 * arr[2];
        if (isValidline(line2, arr, 2)){
            int line3 = line2 + (arr[5] * 10 + arr[6]);
            if(isValidline(line3, arr, 6))
            {
                return true;
            }
        }
        return false;
    }

    public static boolean isValidline(int line, int arr[], int index) {
        if ((line / 100) != 0)
        {
            return false;
        }
        int no1 = line / 10;
        int no2 = line % 10;
        if (no1 == arr[index + 1] && no2 == arr[index + 2])
        {
            return true;
        }
        return false;
    }

    public static boolean findCorrectCombination(int arr[], int l, int h)
    {
        if (l == h)
        {
           return isValidArray(arr);
        }

        for (int i = l; i <= h; i++) {
            // swap arr[i] and arr[l] and fix arr[i]
            int temp = arr[i];
            arr[i] = arr[l];
            arr[l] =  temp;
            boolean res = findCorrectCombination(arr, l + 1, h);
            if (res == true)
            {
                return true;
            }
            // else swap back arr[i] and arr[l]
            temp = arr[i];
            arr[i] = arr[l];
            arr[l] =  temp;
        }
        return false;
    }
}


