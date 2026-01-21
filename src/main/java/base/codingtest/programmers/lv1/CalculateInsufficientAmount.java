package base.codingtest.programmers.lv1;

import java.util.Scanner;

public class CalculateInsufficientAmount {
    // 부족한 금액 계산하기
    // https://school.programmers.co.kr/learn/courses/30/lessons/82612

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("가격을 입력하세요: ");
        int price = sc.nextInt();

        System.out.print("가지고 있는 금액을 입력하세요: ");
        int money = sc.nextInt();

        System.out.print("횟수를 입력하세요: ");
        int count = sc.nextInt();

        long result = solution(price, money, count);
        System.out.println("result -> " + result);

        sc.close();
    }

    /**
     * 이용 요금의 총합과 현재 금액을 비교해
     * 부족한 금액을 반환한다.
     * 부족하지 않으면 0을 반환한다.
     *
     * @param price 1회 이용 요금
     * @param money 현재 보유 금액
     * @param count 이용 횟수
     * @return 부족한 금액 또는 0
     */
    private static long solution(int price, int money, int count) {
        long totalCost = (long) price * count * (count + 1) / 2;

        return Math.max(0, totalCost - money);
    }
}
