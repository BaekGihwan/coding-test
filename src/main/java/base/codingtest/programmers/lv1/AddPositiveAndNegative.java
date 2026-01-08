package base.codingtest.programmers.lv1;

import java.util.Scanner;

public class AddPositiveAndNegative {
    // 음양 더하기
    // https://school.programmers.co.kr/learn/courses/30/lessons/76501

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 배열 길이 입력
        System.out.print("배열 길이를 입력하세요: ");
        int n = scanner.nextInt();

        int[] absolutes = new int[n];
        boolean[] signs = new boolean[n];

        System.out.print("절댓값 정수 배열값을 입력하세요: ");
        for (int i = 0; i < n; i++) {
            absolutes[i] = scanner.nextInt();
        }

        System.out.print("부호 배열값을 입력하세요 (true: 양수, false: 음수): ");
        for (int i = 0; i < n; i++) {
            signs[i] = scanner.nextBoolean();
        }

        int answer = solution(absolutes, signs);
        System.out.println("answer is " + answer);

        scanner.close();
    }

    /**
     * 절댓값 배열과 부호 배열을 이용해 실제 합을 계산한다.
     *
     * @param absolutes 절댓값 배열
     * @param signs 부호 배열 (true: 양수, false: 음수)
     * @return 계산된 합
     */
    public static int solution(int[] absolutes, boolean[] signs) {
        int sum = 0;

        for (int i = 0; i < absolutes.length; i++) {
            sum += signs[i] ? absolutes[i] : -absolutes[i];
        }

        return sum;
    }
}
