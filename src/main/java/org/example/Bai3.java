package org.example;

import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args) {
        int a, b, c;
        System.out.println("Nhập x:");
        Scanner x = new Scanner(System.in);
        a = x.nextInt();
        System.out.println("Nhập y:");
        Scanner y = new Scanner(System.in);
        b = y.nextInt();
        System.out.println("Nhập z:");
        Scanner z = new Scanner(System.in);
        c = z.nextInt();
        if (a*a+b*b==c*c) {
            System.out.println("Đây là tam giác vuông");
        }else {
            System.out.println("Đây không phải tam giác vuông");
        }


    }
}
