package boj.dp.basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ2775 {

    // 부녀회장이 될테야 (브론즈 1)
    // 문제유형 : 수학, 구현, 다이나믹 프로그래밍
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        // 입주 가능 인원 수 저장 배열
        // 행 : 층 수, 열 : 호 수
        int[][] dpApt = new int[15][15];

        int t = Integer.parseInt(br.readLine());

        // 아파트 생성
        for (int i = 0; i < 15; i++) {
            // 0층의 i 호는 i 명 입주 가능
            dpApt[0][i] = i;
            // i 층의 1호는 1명 입주 가능
            dpApt[i][1] = 1;
        }

        for (int i = 1; i < 15; i++) {
            for (int j = 2; j < 15; j++) {
                dpApt[i][j] = dpApt[i][j - 1] + dpApt[i - 1][j];
            }
        }

        for (int i = 0; i < t; i++) {
            int k = Integer.parseInt(br.readLine());
            int n = Integer.parseInt(br.readLine());

            sb.append(dpApt[k][n]).append("\n");
        }

        System.out.print(sb);
    }
}
