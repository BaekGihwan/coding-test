package base.codingtest.programmers.lv1;

public class SumMissingNumbers {
    // 없는 숫자 더하기
    // https://school.programmers.co.kr/learn/courses/30/lessons/86051

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 6, 7, 8, 0};

        int answer = solution(numbers);
        System.out.println("answer is " + answer);
    }

    /**
     * 0부터 9까지의 숫자 중 주어진 배열에 없는 숫자의 합을 반환한다.
     *
     * @param numbers 입력 숫자 배열
     * @return 없는 숫자의 합
     */
    private static int solution(int[] numbers) {
        int sum = 45;

        for (int number : numbers) {
            sum -= number;
        }

        return sum;
    }
}
