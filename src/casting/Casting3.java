package casting;

public class Casting3 {
    public static void main(String[] args) {
        long maxIntValue = 2147483647; //int 최고값
        // long maxIntOver = 2147483648; //int 최고값 + 1(초과) java: integer number too large
        long maxIntOver = 2147483648L; //int 최고값 + 1(초과), L 붙여서 long 타입으로 해준다.
        int intValue = 0;

        intValue = (int) maxIntValue; //형변환
        System.out.println("maxIntValue casting = " + intValue); //2147483647

        intValue = (int) maxIntOver; //형변환
        System.out.println("maxIntOver casting = " + intValue); //-2147483648(오버플로우, int의 최저값)

        intValue = (int) 2147483650L; //형변환
        System.out.println("maxIntOver casting = " + intValue); //-2147483646(오버플로우)
    }
}
