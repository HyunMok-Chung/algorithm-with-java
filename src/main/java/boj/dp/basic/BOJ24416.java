package boj.dp.basic;

import java.io.*;

public class BOJ24416 {

    // 알고리즘 수업 - 피보나치 수 1
    // 문제유형 : 수학, 다이나믹 프로그래밍
    private static int cnt1;
    private static int cnt2;
    private static int n;
    private static int[] dp;

    public static int fibo(int a) {
        if (a == 1 || a == 2) {
            cnt1++;
            return 1;
        } else {
            return fibo(a - 1) + fibo(a - 2);
        }
    }

    public static int fibonacci(int a) {
        dp[1] = 1;
        dp[2] = 1;
        for (int i = 3; i <= a; i++) {
            cnt2++;
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        return dp[a];
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        dp = new int[n + 1];
        cnt1 = 0;
        cnt2 = 0;
        fibo(n);
        fibonacci(n);
        StringBuilder sb = new StringBuilder();
        sb.append(cnt1).append(" ").append(cnt2).append("\n");
        System.out.print(sb);
    }
}
