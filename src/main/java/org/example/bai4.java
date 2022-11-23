package org.example;

import java.util.Scanner;

public class bai4 {
    public static void main(String[] args) {
        int i, n;
        int s = 0;
        System.out.println("Nhập vào một số nguyên:");

        Scanner Sum = new Scanner(System.in);
        n = Sum.nextInt();
        for (i = 0; i < n; i++) {
            if (i % 2 == 0){
//                System.out.println(s = s + i);
                s = s + i;
            }
        }

        System.out.println(s);

    }
}