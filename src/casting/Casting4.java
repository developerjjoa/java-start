package casting;

public class Casting4 {
    public static void main(String[] args) {
        int div1 = 3 / 2; // int / int = int 1.5이지만 계산 결과가 int 라서 결과값 1 나옴
        System.out.println("div1 = " + div1);

        double div2 = 3 / 2;
        // int / int = int 인데 int -> doulbe에 대입해야 하기 때문에 (double)로 자동 형변환
        // double로 자동 형변환 되서 1.0
        System.out.println("div2 = " + div2);

        double div3 = 3.0 / 2; // double / int 이므로 double로 자동 형변환 1.5 나옴.
        System.out.println("div3 = " + div3);

        double div4 = (double) 3 / 2; // double / int 이므로 double로 자동 형변환 1.5 나옴.
        System.out.println("div4 = " + div4);

        int a = 3;
        int b = 2;
        double result = (double) a / b; // int -> double    double / int -> double
        System.out.println("result = " + result);
    }
}
