package base.codingtest.programmers.lv2;

import java.util.Scanner;

public class FindMinAndMax {
    // 최댓값과 최솟값
    // https://school.programmers.co.kr/learn/courses/30/lessons/12939

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("문자열 s를 입력하세요: ");
        String s = scanner.nextLine();

        String result = solution(s);
        System.out.println("answer is " + result);

        scanner.close();
    }

    /**
     * 제공된 문자열 s의 최솟값과 최댓값을 찾아
     * "최솟값 최댓값" 형식으로 반환한다.
     *
     * @param s 공백으로 구분된 숫자 문자열
     * @return "min max" 형식의 문자열
     */
    private static String solution(String s) {
        String[] arr = s.split(" ");

        int min = Integer.parseInt(arr[0]);
        int max = Integer.parseInt(arr[0]);

        for (int i = 1; i < arr.length; i++) {
            int value = Integer.parseInt(arr[i]);
            min = Math.min(min, value);
            max = Math.max(max, value);
        }

        return min + " " + max;
    }
}
