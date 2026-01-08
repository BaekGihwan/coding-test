package base.codingtest.programmers.lv1;

import java.util.Scanner;

public class SumBetween {
    // 두 정수 사이의 합
    // https://school.programmers.co.kr/learn/courses/30/lessons/12912

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("정수 a를 입력하세요: ");
        int a = scanner.nextInt();

        System.out.print("정수 b를 입력하세요: ");
        int b = scanner.nextInt();

        long answer = solution(a, b);
        System.out.println("answer is " + answer);

        scanner.close();
    }

    /**
     * 주어진 두 정수 a, b 사이(포함)의 모든 정수 합을 반환한다.
     *
     * @param a 입력 정수
     * @param b 입력 정수
     * @return 두 정수 사이의 합
     */
    public static long solution(int a, int b) {
        long min = Math.min(a, b);
        long max = Math.max(a, b);

        // 등차수열 합 공식: (첫항 + 끝항) * 항의 개수 / 2
        return (min + max) * (max - min + 1) / 2;
    }
}
