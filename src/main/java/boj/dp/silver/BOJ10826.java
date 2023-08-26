package boj.dp.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class BOJ10826 {

    // 피보나치 수 4
    // DP, 큰 수 연산
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        if (n == 0) {
            sb.append(0);
        } else if (n == 1 || n == 2) {
            sb.append(1);
        } else {
            BigInteger[] dp = new BigInteger[n + 1];
            dp[1] = BigInteger.valueOf(1);
            dp[2] = BigInteger.valueOf(1);
            for (int i = 3; i <= n; i++) {
                dp[i] = dp[i - 1].add(dp[i - 2]);
            }
            sb.append(dp[n]);
        }

        System.out.println(sb);
    }
}
