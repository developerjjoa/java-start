package operator;

public class OperatorAdd1 {
    public static void main(String[] args) {
        int a = 0;

        // 변수 a의 값을 하나 증가하려면 a = a + 1 연산을 수행해야 한다.
        // 자기 자신에 1을 더하고 그 결과를 자신에게 다시 저장해야 한다.

        a = a + 1;
        System.out.println("a = " + a); //1
        
        a = a + 1;
        System.out.println("a = " + a); //2

        //증감 연산자 ++a(증가), --a(감소)
        ++a; // a = a + 1
        System.out.println("a = " + a); //3
        ++a; // a = a + 1
        System.out.println("a = " + a); //4

        --a;
        System.out.println("a = " + a); //3
    }
}
