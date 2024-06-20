package homework;

import java.util.Scanner;

public class bai8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập 3 cạnh của tam giác ");
        System.out.print("Cạnh 1:");
        double a = Double.parseDouble(scanner.nextLine());
        System.out.print("Cạnh 2:");
        double b = Double.parseDouble(scanner.nextLine());
        System.out.print("Cạnh 3:");
        double c = Double.parseDouble(scanner.nextLine());
        if (laTamGiac(a, b, c)) {
            double area = area(a, b, c);
            double perimeter = perimeter(a, b, c);
            System.out.println("Đây là một tam giác");
            System.out.printf("Diện tích tam giác là :%.2f\n", area);
            System.out.printf("Chu vi tam giác là :%.2f", perimeter);
        } else {
            System.out.println("3 cạnh nhập vào không tao thành tam giác. Vui lòng nhập lại");
        }
    }

    public static boolean laTamGiac(double a, double b, double c) {
        return (a + b > c && a + c > b && b + c > a);
    }
    public static double area(double a,double b,double c){
        double p=perimeter(a,b,c)/2;
        return Math.sqrt(p*(p-a)*(p-b)*(p-c));

    }
    public static double perimeter(double a,double b,double c){
        return a+b+c;
    }

}