package base.codingtest.programmers.lv1;

import java.util.Scanner;

public class FindRemainderOne {
    // 나머지가 1이 되는 수 찾기
    // https://school.programmers.co.kr/learn/courses/30/lessons/87389

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("자연수 n를 입력하세요: ");
        int n = scanner.nextInt();

        int result = solution(n);

        System.out.println("answer is " + result);

        scanner.close();
    }

    /**
     * 나머지가 1이 되는 수 찾기
     * @param n 자연수 값
     * @return 나머지가 1인 값
     */
    private static int solution(int n) {
        for (int i = 2; i < n; i++) {
            if (n % i == 1) {
                return i;
            }
        }
        return -1;
    }
}
