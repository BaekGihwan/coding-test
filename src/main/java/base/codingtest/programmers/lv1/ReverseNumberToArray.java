package base.codingtest.programmers.lv1;

import java.util.Scanner;

public class ReverseNumberToArray {
    // 자연수 뒤집어 배열로 만들기
    // https://school.programmers.co.kr/learn/courses/30/lessons/12932

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("자연수 n을 입력하세요: " );
        long n = scanner.nextLong();

        int[] arr = solution(n);
        for (int num : arr) {
            System.out.print(num + " ");
        }

        scanner.close();
    }

    /**
     * 자연수를 뒤집어서 배열 형태로 반환
     *
     * @param n 입력 자연수
     * @return 자릿수를 뒤집은 배열
     */
    private static int[] solution(long n) {
        String str = String.valueOf(n);
        int[] arr = new int[str.length()];

        for (int i = 0; i < str.length(); i++) {
            arr[i] = str.charAt(str.length() - 1 - i) - '0';
        }

        return arr;
    }
}
