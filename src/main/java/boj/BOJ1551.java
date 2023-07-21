package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class BOJ1551 {

    // 수열의 변화 (Bronze 1)
    // 문제유형: 수학, 구현, 문자열, 파싱
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        String str = br.readLine();

        String[] arrA = str.split(",");
        List<Integer> listA = new ArrayList<>();

        for (int i = 0; i < arrA.length; i++) {
            listA.add(Integer.parseInt(arrA[i]));
        }

        for (int i = 0; i < k; i++) {
            List<Integer> temp = new ArrayList<>();
            for (int j = 0; j < listA.size() - 1; j++) {
                temp.add(listA.get(j + 1) - listA.get(j));
            }
            listA = temp;
        }

        for (int i = 0; i < listA.size(); i++) {
            if (i == listA.size() - 1) {
                System.out.print(listA.get(i));
            } else {
                System.out.print(listA.get(i) + ",");
            }
        }
        System.out.println();
    }
}
