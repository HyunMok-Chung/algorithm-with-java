package boj.basic.dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ2748 {

    // 피보나치 수 2 (브론즈 1)
    // 문제유형 : 수학, 다이나믹 프로그래밍
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int number = Integer.parseInt(br.readLine());
        // 문제의 조건에 90보다 작거나 같다는 조건을 따라 배열 크기 설정
        long[] dp = new long[91];
        dp[1] = 1;
        dp[2] = 1;
        for (int i = 3; i <= number; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        StringBuilder sb = new StringBuilder();
        sb.append(dp[number]);
        System.out.println(sb);
    }
}
