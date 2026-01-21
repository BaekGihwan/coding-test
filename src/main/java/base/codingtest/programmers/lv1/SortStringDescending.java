package base.codingtest.programmers.lv1;

import java.util.Arrays;
import java.util.Scanner;

public class SortStringDescending {
    // 문자열 내림차순으로 배치하기
    // https://school.programmers.co.kr/learn/courses/30/lessons/12917

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("문자열 s를 입력하세요: ");
        String s = scanner.nextLine();

        String result = solution(s);
        System.out.println("result = " + result);

        scanner.close();
    }

    /**
     * 문자열의 문자를 내림차순으로 정렬하여 반환한다.
     *
     * @param s 입력 문자열
     * @return 내림차순으로 정렬된 문자열
     */
    private static String solution(String s) {
        char[] arr = s.toCharArray();
        Arrays.sort(arr);

        StringBuilder sb = new StringBuilder(new String(arr));
        return sb.reverse().toString();
    }
}
