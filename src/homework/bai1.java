package homework;

import java.util.Scanner;

public class bai1 {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Nhập số nguyên vào đây: ");
            int number = scanner.nextInt();
            if (number % 3 == 0&&number % 5 == 0) {
                System.out.println(number+" chia hết cho cả 3 và 5");
            }else{
                System.out.println(number+" không chia hết cho 3 và 5");
            }
    }
}
