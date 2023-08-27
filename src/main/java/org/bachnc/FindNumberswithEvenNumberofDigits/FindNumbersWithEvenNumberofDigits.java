package org.bachnc.FindNumberswithEvenNumberofDigits;

public class FindNumbersWithEvenNumberofDigits {
    public static void main(String[] args) {
        int[]arr1 = {12,345,2,6,7896};
        System.out.println(findNumbers(arr1));

        int[]arr = {555,901,482,1771};
        System.out.println(findNumbers(arr));
    }

    public static int findNumbers(int[] nums) {
        int result = 0;

        for (int num : nums){
            String numStr = Integer.toString(num);
            int numDigit = numStr.length();
            if (numDigit %2 == 0) {
                result++;
            }
        }
        return result;
    }
}
