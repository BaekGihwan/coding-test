package base.codingtest.programmers.lv1;

import java.util.Arrays;

public class RemoveSmallestNumber {
    // 제일 작은 수 제거하기
    // https://school.programmers.co.kr/learn/courses/30/lessons/12935

    public static void main(String[] args) {
        int[] arr = new int[]{4, 1, 2, 3};

        int[] result = solution(arr);
        System.out.println("result = " + Arrays.toString(result));
    }

    /**
     * 주어진 배열에서 제일 작은 수를 제거하여 반환한다.
     *
     * @param arr 입력 배열값
     * @return 제일 작을 수를 제거한 배열
     */
    private static int[] solution(int[] arr) {
        int min = Integer.MAX_VALUE;
        int minIndex = 0;
        int idx = 0;

        if (arr.length <= 1) {
            return new int[]{-1};
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
                minIndex = i;
            }
        }

        int[] result = new int[arr.length - 1];

        for (int i = 0; i < arr.length; i++) {
            if (i == minIndex) continue;
            result[idx++] = arr[i];
        }

        return result;
    }
}
