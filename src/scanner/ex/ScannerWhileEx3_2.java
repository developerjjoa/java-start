package scanner.ex;

import java.util.Scanner;

public class ScannerWhileEx3_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        int count = 0;
        int input = 0;

        System.out.println("숫자를 입력하세요. 입력을 중단하려면 -1을 입력하세요:");

        //while 조건식 안에서는 표현식만 허용이 된다. 변수 선언 + 초기화로 하면 될 것 같지만 변수 선언 자체는 표현식이 아닌 문장이므로 int input = 이런식으로 하는건 안된다!
        while ((input = scanner.nextInt()) != -1) {
            sum += input;
            count++;
        }

        double average = (double) sum / count;
        System.out.println("입력한 숫자들의 합계: " + sum);
        System.out.println("입력한 숫자들의 평균: " + average);
    }
}
