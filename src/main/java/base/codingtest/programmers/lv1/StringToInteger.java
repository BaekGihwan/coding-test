package base.codingtest.programmers.lv1;

import java.util.Scanner;

public class StringToInteger {
    // 문자열을 정수로 바꾸기
    // https://school.programmers.co.kr/learn/courses/30/lessons/12925

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("문자열 값을 입력하세요 : ");
        String str = scanner.nextLine();

        int num = solution(str);
        System.out.println("answer is " + num);

        scanner.close();
    }

    /**
     * 짝수와 홀수
     * @param str 문자열
     * @return String -> int 변환 값
     */
    private static int solution(String str) {
        return Integer.parseInt(str);
    }
}
