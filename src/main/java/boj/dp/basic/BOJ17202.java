package boj.dp.basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class BOJ17202 {

    // 핸드폰 번호 궁합 (브론즈 1)
    // 문제유형 : 구현, 문자열, 다이나믹 프로그래밍
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String num1 = br.readLine();
        String num2 = br.readLine();

        // A, B 의 핸드폰 번호 저장 리스트
        ArrayList<Integer> num = new ArrayList<>();
        for (int i = 0; i < 8; i++) {
            // 핸드폰 번호를 차례차례 int 형으로 치환 후 리스트에 삽입
            num.add(num1.charAt(i) - '0');
            num.add(num2.charAt(i) - '0');
        }

        // 2개의 숫자가 남을때까지 반봅
        while (num.size() > 2) {
            // 임시 저장용 리스트
            ArrayList<Integer> temp = new ArrayList<>();
            // 앞의 숫자와 뒤의 숫자를 더한 후 10으로 나눈 나머지 값을 삽입
            for (int i = 0; i < num.size() - 1; i++) {
                int sum = num.get(i) + num.get(i + 1);
                temp.add(sum % 10);
            }
            // 계산이 완료된 temp 리스트를 num 리스트로 대치
            num = temp;
        }

        StringBuilder sb = new StringBuilder();
        sb.append(num.get(0)).append(num.get(1));
        System.out.println(sb);
    }
}
