package base.codingtest.programmers.lv1;

import java.util.Scanner;

public class SumByDivisorCount {
    // 약수의 개수와 덧셈
    // https://school.programmers.co.kr/learn/courses/30/lessons/77884

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("정수 left를 입력하세요: ");
        int left = scanner.nextInt();

        System.out.print("정수 right를 입력하세요: ");
        int right = scanner.nextInt();

        int result = solution(left, right);
        System.out.println("resutl = " +result);

        scanner.close();
    }

    /**
     * left부터 right까지의 정수 중에서
     * 약수의 개수가 짝수인 수는 더하고,
     * 약수의 개수가 홀수인 수는 빼서 최종 합을 반환한다.
     *
     * @param left 시작 정수
     * @param right 끝 정수
     * @return 약수 개수 기준으로 계산된 합
     */
    private static int solution(int left, int right) {
        int sum = 0;

        for (int i = left; i <= right; i++) {
            int sqrt = (int) Math.sqrt(i);
            boolean isSquare = (sqrt * sqrt == i);

            sum += isSquare ? -i : i;
        }

        return sum;
    }
}
