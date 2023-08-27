package org.bachnc.SquaresOfASortedArray;

import java.util.Arrays;

public class SquaresOfASortedArray {
    public static void main(String[] args) {
        int[]arr = {-4,-1,0,3,10};
        int[] result = sortedSquares(arr);
        System.out.println("Sorted Squares: " + Arrays.toString(result));

    }
    public static int[] sortedSquares(int[] nums) {
        int[] result = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {

            result[i] = (int)Math.pow(nums[i], 2);
        }
        Arrays.sort(result);
        Arrays.toString(result);
        return result;
    }
}
