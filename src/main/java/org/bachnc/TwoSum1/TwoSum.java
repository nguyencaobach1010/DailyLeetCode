package org.bachnc.TwoSum1;

public class TwoSum {
    public static void main(String[] args) {
            int[] arr = {2,7,11,15};
            int target = 9;
        int[] result = twoSum(arr, target);

        if (result.length == 2) {
            System.out.println("Cặp phần tử có tổng bằng " + target + " là: " + result[0] + " và " + result[1]);
        } else {
            System.out.println("Không tìm thấy cặp phần tử có tổng bằng " + target);
        }
    }

    public static int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j  < n; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i,j};
            }


                }
            }
        return new int[]{};
    }
}
