package homework;

public class bai5 {
    public static void main(String[] args) {
        int count=0;
        for (int i = 2; i <= 100; i++) {
            if (primeNumber(i)) {
                count++;
                System.out.println(i + " là số nguyên tố");
            }
        }
        System.out.println("Tổng các số nguyên tố là: "+count);
    }
    public static boolean primeNumber(int number) {
        if (number <=1) {
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
}
