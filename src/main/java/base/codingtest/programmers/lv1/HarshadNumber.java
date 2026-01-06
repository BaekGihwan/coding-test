package base.codingtest.programmers.lv1;

import java.util.Scanner;

public class HarshadNumber {
    // 하샤드 수
    // https://school.programmers.co.kr/learn/courses/30/lessons/12947

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("정수 x를 입력하세요: ");
        int x = scanner.nextInt();

        boolean result = solution(x);
        System.out.println("answer is " + result);

        scanner.close();
    }

    /**
     * 하샤드 수
     * @param x 정수 값
     * @return boolean 값
     */
    private static boolean solution(int x) {
        int sum = 0;
        int temp = x;

        while (temp > 0) {
            sum += temp % 10;
            temp /= 10;
        }

        return x % sum == 0;
    }
}




