package base.codingtest.programmers.lv1;

public class DigitAddition {
    // 자릿수 더하기
    // https://school.programmers.co.kr/learn/courses/30/lessons/12931

    public static void main(String[] args) {
        int n = 123;

        int result = solution(n);
        System.out.println("answer is " + result);
    }

    /**
     * 자릿수 더하기
     * @param n 자연수
     * @return 각 자릿수의 합
     */
    private static int solution(int n) {
        int answer = 0;

        while (n > 0) {
            answer += n % 10;
            n /= 10;
        }

        return answer;
    }
}
