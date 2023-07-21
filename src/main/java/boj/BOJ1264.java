package boj;

import java.io.*;

public class BOJ1264 {

    // 모음의 개수 (Bronze 4)
    // 문제유형 : 구현
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        while (true) {
            int cnt = 0;
            String str = br.readLine();
            if (str.equals("#")) {
                break;
            }
            str = str.toLowerCase();
            for (int i = 0; i < str.length(); i++) {
                char temp = str.charAt(i);
                if (temp == 'a' || temp == 'e' || temp == 'i' || temp == 'o' || temp == 'u') {
                    cnt++;
                }
            }
            sb.append(cnt).append("\n");
        }
        br.close();
        bw.write(String.valueOf(sb));
        bw.flush();
        bw.close();
    }
}
