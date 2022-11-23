package org.example;

import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
        int n;
        System.out.println("Nhập vào một số nguyên:");

        Scanner sc = new Scanner(System.in);

        // sc.nextInt() Hàm giúp get số nhé, với trường hợp lấy giá trị là chuỗi thì sẽ dùng nextLine()
        n = sc.nextInt();
        switch(n) {
            case 0:
                System.out.println("Không");
            case 1:
                System.out.println("Một");
            case 2:
                System.out.println("Hai");
            case 3:
                System.out.println("Ba");
            case 4:
                System.out.println("Bốn");
            case 5:
                System.out.println("Năm");
            case 6:
                System.out.println("Sáu");
            case 7:
                System.out.println("bẩy");
            case 8:
                System.out.println("Tám");
            case 9:
                System.out.println("Chín");
            case 10:
                System.out.println("Mười");
                break;

        }

    }
}
