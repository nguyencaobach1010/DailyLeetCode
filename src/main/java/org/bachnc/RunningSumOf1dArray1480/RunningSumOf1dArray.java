package org.bachnc.RunningSumOf1dArray1480;

public class RunningSumOf1dArray {
    public static void main(String[] args) {
        int[] nums = {1, 1, 1, 1, 1};
        int[] result = runningSum(nums);
        for (int num : result){
            System.out.print(num + " ");
        }
    }

    public static int[] runningSum(int[] nums) {
        int[] sum = new int[nums.length];
        sum[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            sum[i] = sum[i - 1] + nums[i];
        }

        return sum;
    }
}
