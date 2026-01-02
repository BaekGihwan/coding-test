package base.codingtest.programmers.lv1;

import java.util.Scanner;

public class EvenAndOddNumbers {
    // 짝수와 홀수
    // https://school.programmers.co.kr/learn/courses/30/lessons/12937

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("숫자를 입력하세요: ");
        int num = scanner.nextInt();

        String result = solution(num);
        System.out.println("answer is " + result);

        scanner.close();
    }

    /**
     * 짝수와 홀수
     * @param num 자연수
     * @return 짝수 홀수 구분
     */
    public static String solution(int num) {
        return (num % 2 == 0) ? "even" : "odd";
    }
}
