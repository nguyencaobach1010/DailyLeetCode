package org.bachnc.FizzBuzz;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số: " );
        System.out.print(FizzBuzz(sc.nextInt()));

    }

    public static List<String> FizzBuzz (int n){
        List<String> answer  = new ArrayList<>(n);

        for (int i = 1; i <= n; i++) {
            boolean a1 = i % 3 == 0;
            boolean a2 = i % 5 == 0;

            if ( a1 && a2){
                answer.add("FizzBuzz");
            }else if (a1) {
                answer.add("Fizz");
            }else if (a2) {
                answer.add("Buzz");
            }else{
                answer.add(String.valueOf(i));
            }
        }

        return answer;
    }
}
