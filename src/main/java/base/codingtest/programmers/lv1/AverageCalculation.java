package base.codingtest.programmers.lv1;

public class AverageCalculation {
    // 평균 구하기
    // https://school.programmers.co.kr/learn/courses/30/lessons/12944

    public static void main(String[] args) {
        int[] arr = new int[] {1,2,3,4};

        double result = solution(arr);
        System.out.println("answer is " + result);
    }

    /**
     * 평균 구하기
     * @param arr 입력값
     * @return 평균 값
     */
    private static double solution(int[] arr) {
        double sum = 0;

        for (int num : arr) {
            sum += num;
        }

        return sum / arr.length;
    }
}
