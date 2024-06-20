package homework;

import java.util.Scanner;

public class bai4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số đầu trong khoảng ");
        int start=scanner.nextInt();
        System.out.println("Nhập số cuối trong khoảng ");
        int end=scanner.nextInt();
        int sum=0;
        for(int i=start; i<=end; i++){
            if(i%2==0){
                sum+=i;
            }
        }
        System.out.println(sum+" là tổng giá trị các sỗ chẵn từ "+start+" đến "+end);
    }
}
