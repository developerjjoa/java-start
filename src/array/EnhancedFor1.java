package array;

public class EnhancedFor1 {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};

        //일반 for문
        for (int i = 0; i < numbers.length; i++) {
            int number = numbers[i]; //numbers[i]를 꺼내서 number에 대입
            System.out.println(number);
        }

        System.out.println();

        //향상된 for문, for-each문
        for (int number : numbers) {
            System.out.println(number);
        }

        //for-each문을 사용할 수 없는 경우, 증가하는 index 값 필요할 때
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("number " + i + "번의 결과는 " + numbers[i]);
        }
    }
}
