package base.codingtest.programmers.lv1;

public class DotProduct {
    // 내적
    // https://school.programmers.co.kr/learn/courses/30/lessons/70128

    public static void main(String[] args) {
        int[] a = new int[]{1, 2, 3, 4};
        int[] b = new int[]{-3, -1, 0, 2};

        long result = solution(a, b);
        System.out.println("result = " + result);
    }

    /**
     * 주어진 배열 a, b의 내적을 계산하여 반환한다.
     *
     * @param a, b 정수 배열
     * @return 내적 값
     */
    private static long solution(int[] a, int[] b) {
        long sum = 0;

        for (int i = 0; i < a.length; i++) {
            sum += a[i] * b[i];
        }

        return sum;
    }
}
