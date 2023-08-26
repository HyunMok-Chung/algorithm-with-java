package boj.dp.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ14916 {

    // 거스름돈 (실버 5)
    // 문제유형 : 수학, DP, 그리디
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        br.close();

        int dp = 0;
        while (true) {
            if (n % 5 == 0) {
                sb.append(n / 5);
                break;
            }
            if (n == 0) {
                sb.append(0);
                break;
            }
            if (n < 0) {
                sb.append(-1);
                break;
            }
            n -= 2;
            dp++;

            if (n % 5 == 0) {
                dp += n/5;
                sb.append(dp);
                break;
            }
        }
        System.out.println(sb);
    }

}
