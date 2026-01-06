package base.codingtest.programmers.lv1;

import java.util.Scanner;

public class SquareRootChecker {
    // 정수 제곱근 판별
    // https://school.programmers.co.kr/learn/courses/30/lessons/12934

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("정수 n를 입력하세요: ");
        long n = scanner.nextLong();

        long result = solution(n);
        System.out.println("answer is " + result);

        scanner.close();
    }

    /**
     * 주어진 수가 어떤 정수의 제곱이면
     * 그 다음 정수의 제곱을 반환하고
     * 아니라면 -1을 반환
     *
     * @param n 입력 정수
     * @return 다음 제곱수 또는 -1
     */
    private static long solution(long n) {
        int sqrt = (int) Math.sqrt(n);

        if ((long) sqrt * sqrt == n) {
            return (long) (sqrt + 1) * (sqrt + 1);
        } else {
            return -1;
        }
    }
}
