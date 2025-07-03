package scanner.ex;

import java.util.Scanner;

public class ScannerEx2_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("하나의 정수를 입력하세요:");
        int number = scanner.nextInt();

        String result = (number % 2 == 0) ? "짝수" : "홀수";

        System.out.println("입력한 숫자 " + number + "는 " + result + "입니다.");
    }
}
