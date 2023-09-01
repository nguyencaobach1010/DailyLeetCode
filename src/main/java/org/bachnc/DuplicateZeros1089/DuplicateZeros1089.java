package org.bachnc.DuplicateZeros1089;

public class DuplicateZeros1089 {
    public static void main(String[] args) {
        int[] arr = {1, 0, 2, 3, 0, 4, 5, 0};
        duplicateZeros(arr);
        for(int num : arr){
            System.out.print(num + " ");
        }
    }

    public static void duplicateZeros(int[] arr) {
        int n = arr.length;
        int i = 0;

        while (i < n) {
            if (arr[i] == 0) {
                // Di chuyển tất cả các phần tử bên phải của số 0 sang phải
                for (int j = n - 1; j > i; j--) {
                    arr[j] = arr[j - 1];
                }
                // Nhân bản số 0
                if (i + 1 < n) {
                    arr[i + 1] = 0;
                }
                // Bước tiếp theo là 2 vị trí sau số 0 đã được xử lý
                i += 2;
            } else {
                // Nếu không phải số 0, tiến hành kiểm tra phần tử tiếp theo
                i++;
            }

        }
    }

}
