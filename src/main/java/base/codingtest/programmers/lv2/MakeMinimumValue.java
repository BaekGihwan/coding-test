package base.codingtest.programmers.lv2;

import java.util.Arrays;

public class MakeMinimumValue {
    // 최솟값 만들기
    // https://school.programmers.co.kr/learn/courses/30/lessons/12941

    public static void main(String[] args) {
        int[] a = new int[] {1, 4, 2};
        int[] b = new int[] {5, 4, 4};


        int result = solution(a, b);
        System.out.println("answer is " + result);

    }

    /**
     * 두 배열의 각 원소를 한 번씩 사용하여
     * 곱의 합이 최소가 되도록 계산한다.
     *
     * @param a 정수 배열
     * @param b 정수 배열
     * @return 최소 곱의 합
     */
    private static int solution(int[] a, int[] b) {
        Arrays.sort(a);
        Arrays.sort(b);

        long sum = 0;
        int n = a.length;

        // a는 작은 것부터, b는 큰 것부터 곱하기
        for (int i = 0; i < n; i++) {
            sum += (long) a[i] * b[n - 1 - i];
        }

        return (int) sum;
    }
}
