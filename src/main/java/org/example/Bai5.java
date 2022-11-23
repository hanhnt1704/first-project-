package org.example;
import java.util.Scanner;
public class Bai5 {
    public static void main(String[] args){
        int n,i;
        System.out.println("Số phần tử của mảng:");
        Scanner sc = new Scanner(System.in);
        // sc.nextInt() Hàm giúp get số nhé, với trường hợp lấy giá trị là chuỗi thì sẽ dùng nextLine()
        n = sc.nextInt();
        //khai báo mảng
        int[] arr = new int[n];
        for(i = 0; i < n; i++){
            System.out.println("phần tử " + i);
            arr[i] =sc.nextInt();
        }

        for (i = 0; i < n-1; i++){
            int j;
            int temp = arr[0];
            for (j = i +1; j < n; j++){
                if(arr[i] > arr[j]){
                    temp =arr[j];
                    arr[i] =temp;
                }
            }
        }
        for (i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
