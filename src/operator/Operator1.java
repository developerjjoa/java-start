package operator;

public class Operator1 {
    public static void main(String[] args) {
        //변수 초기화
        int a = 5;
        int b = 2;

        //덧셈
        int sum = a + b;
        System.out.println("a + b = " + sum); //출력 a + b = 7

        //뺄셈
        int diff = a - b;
        System.out.println("a - b = " + diff); //출력 a - b = 3

        //곱셈
        int multi = a * b;
        System.out.println("a * b = " + multi); //출력 a * b = 10

        //나눗셈
        int div = a / b;
        System.out.println("a / b = " + div); //출력 a / b = 2
        //결과는 2.5 이지만 자바에서는 같은 int 형끼리 계산하면 계산 결과도 같은 int형으로 나온다.
        //int 형은 정수이기 때문에 소수점 이하를 포함할 수 없다.

        //나머지(나머지 연산자는 실무와 알고리즘 모두 종종 사용되므로 잘 기억해두기)
        int mod = a % b; // 5 / 2 몫 : 2, 나머지 : 1
        System.out.println("a % b = " + mod); //출력 a % b = 1

        /*

        주의! 0으로 나누기

        10 / 0 과 같이 숫자는 0으로 나눌 수 없다.(수학에서 허용하지 않음)

        실행하면 다음과 같은 예외를 확인할 수 있다.
        Exception in thread "main" java.lang.ArithmeticException: / by zero
        예외가 발생하면 해당 시점 이후의 결과가 출력되지 않고 프로그램이 종료된다. 예외에 대한 자세한 부분은 예외 처리에서 다룬다.
         */
    }
}
