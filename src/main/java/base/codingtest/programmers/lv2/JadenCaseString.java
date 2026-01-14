package base.codingtest.programmers.lv2;

import java.util.Scanner;

public class JadenCaseString {
    // JadenCase 문자열 만들기
    // https://school.programmers.co.kr/learn/courses/30/lessons/12951

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("문자열 s를 입력하세요: ");
        String s = scanner.nextLine();

        String result = solution(s);
        System.out.println("answer is " + result);

        scanner.close();
    }

    /**
     * 문자열을 JadenCase 형식으로 변환한다.
     *
     * @param s 입력 문자열
     * @return JadenCase로 변환된 문자열
     */
    private static String solution(String s) {
        StringBuilder sb = new StringBuilder();
        boolean isEmpty = true;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (c == ' ') {
                sb.append(c);
                isEmpty = true;
            } else {
                if (isEmpty) {
                    sb.append(Character.toUpperCase(c));
                    isEmpty = false;
                } else {
                    sb.append(Character.toLowerCase(c));
                }
            }
        }

        return sb.toString();
    }
}
