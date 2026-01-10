package base.codingtest.programmers.lv1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DivisibleNumberArray {
    // 나누어 떨어지는 숫자 배열
    // https://school.programmers.co.kr/learn/courses/30/lessons/12910

    public static void main(String[] args) {
        int[] arr = new int[]{5, 9, 7, 10};
        int divisor = 5;

        int[] answer = solution(arr, divisor);
        System.out.println("answer is " + Arrays.toString(answer));
    }

    private static int[] solution(int[] arr, int divisor) {
        List<Integer> list = new ArrayList<>();

        for (int num : arr) {
            if (num % divisor == 0) {
                list.add(num);
            }
        }

        if (list.isEmpty()) {
            return new int[]{-1};
        }

        int[] result = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            result[i] = list.get(i);
        }

        Arrays.sort(result);
        return result;
    }
}
