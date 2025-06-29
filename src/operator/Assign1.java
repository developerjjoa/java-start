package operator;

public class Assign1 {
    public static void main(String[] args) {
        /*
        축약(복합) 대입 연산자
        연산자 종류 : +=, -=, *=, /=, %=

        i = i + 3 -> i += 3
        i = i * 4 -> i *= 4
        */

        int a = 5;
        a += 3; // 8 : a = a + 3
        a -= 2; // 6 : a = a - 2
        a *= 4; // 24 : a = a * 4
        a /= 3; // 8 : a = a / 3
        a %= 5; // 3 : a = a % 5
        System.out.println(a);
    }
}
