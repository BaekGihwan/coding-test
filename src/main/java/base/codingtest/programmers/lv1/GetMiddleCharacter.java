package base.codingtest.programmers.lv1;

import java.util.Scanner;

public class GetMiddleCharacter {
    // 가운데 글자 가져오기
    // https://school.programmers.co.kr/learn/courses/30/lessons/12903

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("문자열 s를 입력하세요: ");
        String s = scanner.nextLine();

        String result = solution(s);
        System.out.println("result = " + result);

        scanner.close();
    }

    /**
     * 문자열의 가운데 글자를 반환한다.
     * 길이가 짝수이면 가운데 두 글자를 반환한다.
     * 길이가 홀수면 가운데 한 글자를 반환한다.
     *
     * @param s 문자열
     * @return 가운데 한글자 또는 두글자
     */
    private static String solution(String s) {
        int len = s.length();
        int mid = len / 2;

        return len % 2 == 0
                ? s.substring(mid - 1, mid + 1)
                : s.substring(mid, mid + 1);
    }
}
