package base.codingtest.programmers.lv1;

import java.util.Scanner;

public class BasicStringValidation {
    // 문자열 다루기 기본
    // https://school.programmers.co.kr/learn/courses/30/lessons/12918

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("문자열 s를 입력하세요: ");
        String s = sc.nextLine();

        boolean result = solution(s);
        System.out.println("result -> " + result);

        sc.close();
    }

    /**
     * 문자열이 숫자로만 이루어져 있고
     * 길이가 4 또는 6이면 true를 반환한다.
     *
     * @param s 검사할 문자열
     * @return 조건을 만족하면 true, 아니면 false
     */
    private static boolean solution(String s) {
        int len = s.length();
        if (len != 4 && len != 6) {
            return false;
        }

        for (char c : s.toCharArray()) {
            if (!Character.isDigit(c)) {
                return false;
            }
        }

        return true;
    }
}
