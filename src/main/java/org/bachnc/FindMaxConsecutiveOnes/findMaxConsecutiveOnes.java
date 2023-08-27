package org.bachnc.FindMaxConsecutiveOnes;

public class findMaxConsecutiveOnes {
    public static void main(String[] args) {
        int[] arr = {1,0,1,1,0,1};
        System.out.println(findMaxConsecutiveOnes(arr));
        int[] arr1 = {1,1,0,1,1,1};
        System.out.println(findMaxConsecutiveOnes(arr1));

    }

    public static int findMaxConsecutiveOnes(int[] nums) {
        int count = 0;
        int max = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == 1) {
                count++;
                 if(count > max){
                     max = count;
                 }
            }else{
                count = 0;

            }
        }


        return max;
    }
}
