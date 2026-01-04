package base.codingtest.programmers.lv1;

import java.util.Arrays;
import java.util.Scanner;

public class GenerateSequence {
    // x만큼 간격이 있는 n개의 숫자
    // https://school.programmers.co.kr/learn/courses/30/lessons/12954

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("시작값 x를 입력하세요: ");
        int x = scanner.nextInt();

        System.out.print("자연수 n를 입력하세요: ");
        int n = scanner.nextInt();

        long[] result = solution(x, n);
        System.out.println("answer is " + Arrays.toString(result));

        scanner.close();
    }

    /**
     * 짝수와 홀수
     * @param x 시작값
     * @param n 증가 갯수값
     * @return array 결과값
     */
    private static long[] solution(int x, int n) {
        long[] arr = new long[n];
        arr[0] = x;

        for (int i = 1; i < n; i++) {
            arr[i] = arr[i - 1] + x;
        }

        return arr;
    }
}
