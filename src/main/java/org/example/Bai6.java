package org.example;
import java.util.Scanner;
public class Bai6 {
    public static void main(String[] args) {
        String n;
        char s;
        int i, a = 0;
        Scanner sc = new Scanner(System.in);
        n = sc.nextLine();
        s = sc.nextLine().charAt(0);
        for (i = 0; i < n.length(); i++) {
            if (n.charAt(i) == s) {
                a++;
            }
        }
        if (a>0){
            System.out.println("Có kí tự chữ");
        }
        else {
            System.out.println("Không có kí tự đó");
        }
    }
}
