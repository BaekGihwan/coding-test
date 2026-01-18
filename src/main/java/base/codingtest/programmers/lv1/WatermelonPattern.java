package base.codingtest.programmers.lv1;

import java.util.Scanner;

public class WatermelonPattern {
    // 수박수박수박수박수박수?
    // https://school.programmers.co.kr/learn/courses/30/lessons/12922

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("자연수 n를 입력하세요: ");
        int n = scanner.nextInt();

        String result = solution(n);
        System.out.println("result = " + result);

        scanner.close();
    }

    /**
     * 자연수 n만큼 수박수박수박... 문자열을 반환
     *
     * @param n 자연수
     * @return 반복된 수박.. 문자열
     */

    private static String solution(int n) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i <n; i++) {
            sb.append(i % 2 == 0 ? "수" : "박");
        }

        return sb.toString();
    }
}
