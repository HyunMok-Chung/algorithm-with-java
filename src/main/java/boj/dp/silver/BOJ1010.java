package boj.dp.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ1010 {

    // 다리 놓기 (실버 5)
    // 문제유형 : 수학, 조합론, 다이나믹 프로그래밍
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = null;
        int t = Integer.parseInt(br.readLine());
        int[][] dp = new int[30][30];
        for(int i=0;i<30;i++){
            dp[i][i] = 1;
            dp[i][0] = 1;
        }
        for(int i=2;i<30;i++){
            for(int j=1;j<30;j++){
                dp[i][j] = dp[i-1][j-1] + dp[i-1][j];
            }
        }
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<t;i+금+){
            st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());
            sb.append(dp[m][n]).append("\n");
        }
        System.out.print(sb);
    }

}
