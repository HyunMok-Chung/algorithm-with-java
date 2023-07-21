public class testCode {

    public static void main(String[] args) {
        // 2진수 <-> 10진수
        // 다른 진법들도 동일한 방법으로 변환 가능
        int num = 10;
        String binary = Integer.toBinaryString(num);
        System.out.println("10진수 -> 2진수: " + binary);

        int binaryToDecimal = Integer.parseInt(binary, 2);
        System.out.println("2진수 -> 10진수: " + binaryToDecimal);
    }
}
