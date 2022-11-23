package org.example;
import java.util.Scanner;

public class bai1 {
    public static void main(String[] args) {
        int n;
        System.out.println("Nhập vào một số nguyên:");

        /** Đây là hàm để lấy giá trị mà mình mới nhập vào
         * Scanner cũng được gọi là một kiểu dữ liệu nhưng tạm thời mọi người đừng quan tâm nhé
         * chỉ dùng để mình giải quyết mấy bài tập này thôi
         * sc thì n là tên biến thôi
         * System.in cho phép lấy giá trị mới nhập
         *
         */
        Scanner sc = new Scanner(System.in);

        // sc.nextInt() Hàm giúp get số nhé, với trường hợp lấy giá trị là chuỗi thì sẽ dùng nextLine()
        n = sc.nextInt();

        if (n >= 0) {
            System.out.println("Đây là một số nguyên dương");
        }
        else {
            System.out.println("Đây là số nguyên âm");
        }
    }
}
