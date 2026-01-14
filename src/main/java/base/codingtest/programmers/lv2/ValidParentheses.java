package base.codingtest.programmers.lv2;

import java.util.Arrays;
import java.util.Scanner;

public class ValidParentheses {
    // 올바른 괄호
    // https://school.programmers.co.kr/learn/courses/30/lessons/12909

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("괄호문자열 s를 입력하세요: ");
        String s = scanner.nextLine();

        boolean result = solution(s);
        System.out.println("answer is " + result);

        scanner.close();
    }

    /**
     * x만큼 간격이 있는 n개의 숫자
     *
     * @param s 괄호 문자열
     * @return boolean 결과값
     */
    private static boolean solution(String s) {
        int sum = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                sum++;
            } else {
                sum--;

                if (sum < 0) {
                    return false;
                }
            }
        }

        return sum == 0;
    }
}
