package homework;

import java.util.Scanner;

public class bai7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("\nMenu:");
            System.out.println("1.Kiểm tra tính chẵn lẻ");
            System.out.println("2.Kiểm tra số nguyên tố");
            System.out.println("3.Kiểm tra một số có chia hết cho 3 không");
            System.out.println("4.Thoát");
            System.out.println("Lựa chọn của bạn");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    System.out.print("Nhập số cần kiểm tra ");
                    int number1 = Integer.parseInt(scanner.nextLine());
                    checkEvenOdd(number1);
                    break;
                case 2:
                    System.out.print("Nhập số cần kiểm tra ");
                    int number2=Integer.parseInt(scanner.nextLine());
                    if (checkPrime(number2)) {
                        System.out.println(number2+" laf số nguyên tố");
                    }else{
                        System.out.println(number2+" không là số nguyên tố");
                    }
                    break;
                case 3:
                    System.out.println("Nhập só cần kiểm tra ");
                    int number3=Integer.parseInt(scanner.nextLine());
                    checkSoChiaHetCho3(number3);
                    break;
                case 4:
                    System.exit(0);
                default:
                    System.out.println();
                    System.out.println("Vui lòng lựa chọn từ 1-4");
            }
        } while (true);
    }
    public static void checkEvenOdd(int number){
        if (number%2==0) {
            System.out.println(number+" là số chẵn");
        }else{
            System.out.println(number+" là số lẻ");
        }
    }
    public static boolean checkPrime(int number){
        if (number < 1) {
            return false;
        }
        if (number == 2 || number == 3) {
            return true;
        }
        if (number % 2 == 0) {
            return false;
        }
        for (int i = 3; i <= Math.sqrt(number); i+=2) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static void checkSoChiaHetCho3(int number){
        if (number%3==0) {
            System.out.println(number+" chia hết cho 3");
        }else{
            System.out.println(number+ " không chia hết cho 3");
        }
    }

}
