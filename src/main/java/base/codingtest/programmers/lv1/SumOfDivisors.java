package base.codingtest.programmers.lv1;

import java.util.Scanner;

public class SumOfDivisors {
    // 약수의 합
    // https://school.programmers.co.kr/learn/courses/30/lessons/12928

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("정수 n를 입력하세요: ");
        int n = scanner.nextInt();

        int result = solution(n);
        System.out.println("answer is " + result);

        scanner.close();
    }

    /**
     * 약수의 합
     * @param n 정수 값
     * @return 합
     */
    private static int solution(int n) {
        int answer = 0;

        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                answer += i;
            }

        }
        return answer;
    }
}
