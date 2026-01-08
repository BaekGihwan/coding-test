package base.codingtest.programmers.lv1;

import java.util.Scanner;

public class CountPandY {
    // 문자열 내 p와 y의 개수
    // https://school.programmers.co.kr/learn/courses/30/lessons/12916

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("문자열 s를 입력하세요: ");
        String s = scanner.nextLine();

        boolean answer = solution(s);
        System.out.println("answer is " + answer);

        scanner.close();
    }

    /**
     * 주어진 문자열에서 p와 y의 개수를 비교하여
     * 두 문자의 개수가 같으면 true, 다르면 false를 반환한다.
     *
     * @param s 입력 문자열
     * @return p와 y의 개수 비교 결과
     */
    public static boolean solution(String s) {
        int countP = 0;
        int countY = 0;

        for (int i = 0; i < s.length(); i++) {
            char c = Character.toUpperCase(s.charAt(i));

            if (c == 'P') {
                countP++;
            } else if (c == 'Y') {
                countY++;
            }
        }

        return countP == countY;
    }
}
