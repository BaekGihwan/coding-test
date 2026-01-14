package base.codingtest.programmers.lv2;

import java.util.Arrays;
import java.util.Scanner;

public class NextBiggerNumber {
    // 다음 큰 숫자
    // https://school.programmers.co.kr/learn/courses/30/lessons/12911

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("자연수 n를 입력하세요: ");
        int n = scanner.nextInt();

        int result = solution(n);
        System.out.println("answer is " + result);

        scanner.close();
    }

    /**
     * 다음 큰 숫자
     *
     * @param n 자연수
     * @return 다음큰 자연수 결과값
     */
    private static int solution(int n) {
        int nCount = Integer.bitCount(n);
        int next = n + 1;

        while (Integer.bitCount(next) != nCount) {
            next++;
        }

        return next;
    }
}

