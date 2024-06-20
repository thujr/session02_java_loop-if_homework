package homework;

import java.util.Scanner;

public class bai3 {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println(i + " là số chia hết cho cả 3 và 5");
            }
        }
    }
}
