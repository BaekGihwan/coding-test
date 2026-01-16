package base.codingtest.programmers.lv1;

import java.util.Scanner;

public class CollatzConjecture {
    // 콜라츠 추측
    // https://school.programmers.co.kr/learn/courses/30/lessons/12943

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("자연수 n를 입력하세요: ");
        int num = scanner.nextInt();

        int result = solution(num);
        System.out.println("result = " + result);

        scanner.close();
    }

    /**
     * 주어진 수가 1이 될 때까지 콜라츠 추측을 반복한 횟수를 반환한다.
     * 500번을 초과하면 -1을 반환한다.
     *
     * @param num 자연수
     * @return 반복 횟수 또는 -1
     */
    private static int solution(int num) {
        long n = num;
        int count = 0;

        while (n != 1) {
            if (n % 2 == 0) {
                n /= 2;
            } else {
                n = (n * 3) + 1;
            }
            count++;

            if (count == 500){
                return -1;
            }
        }

        return count;
    }
}
