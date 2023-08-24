package org.bachnc.RichestCustomerWealth1672;

public class RichestCustomerWealth {
    public static void main(String[] args) {
        int [][] result= {{2,8,7},{7,1,3},{1,9,5}};

        maximumWealth(result);
        System.out.print("result: " + maximumWealth(result));
    }
    public static int maximumWealth(int[][] accounts) {
        int maxWealthSoFar = 0;

        for (int[] customer : accounts) {
            int currentCustomerWealth = 0;

            for (int bank : customer){
                currentCustomerWealth += bank;
            }

            maxWealthSoFar = Math.max(maxWealthSoFar, currentCustomerWealth);
        }
        return maxWealthSoFar;
    }
}

