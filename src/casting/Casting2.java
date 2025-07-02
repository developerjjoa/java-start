package casting;

public class Casting2 {
    public static void main(String[] args) {
        double doubleValue = 1.5;
        int intValue = 0;

        // intValue = doubleValue; //컴파일 오류
        // 소수 날아가도 된다고 내가 허락할테니까 강제로 바꿔!
        intValue = (int) doubleValue;// 형변환(캐스팅)
        System.out.println(intValue);// 결과값 : 1 소수점 날아감

        int z = (int) 10.5;
        System.out.println(10.5);//10,5
        System.out.println("z = " + z);//10
        System.out.println("doubleValue = " + doubleValue); //그대로 유지
    }
}
