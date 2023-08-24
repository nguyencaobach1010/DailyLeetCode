package org.bachnc.NumberOfStepsToReduceANumberToZero1342;

import java.util.Scanner;

public class NumberOfStepsToReduceANumberToZero {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập số: ");
        int num = input.nextInt();
        System.out.println(numberOfSteps(num));

    }

    public static int numberOfSteps(int num) {
            int step = 0;

        while ( num > 0 ){
            if (num % 2 == 0) {
                num =  num / 2;
                step++;
            }else {
                num = num - 1;
                step++;
            }
        }
        return step;
    }
}
