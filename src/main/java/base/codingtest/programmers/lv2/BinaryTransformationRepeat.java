package base.codingtest.programmers.lv2;

import java.util.Arrays;
import java.util.Scanner;

public class BinaryTransformationRepeat {
    // 이진 변환 반복하기
    // https://school.programmers.co.kr/learn/courses/30/lessons/70129

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("문자열 s를 입력하세요: ");
        String s = scanner.nextLine();

        int[] result = solution(s);
        System.out.println("answer is " + Arrays.toString(result));

        scanner.close();
    }

    /**
     * 이진 변환 반복하기
     *
     * @param s 이진 문자열
     * @return [변환 횟수, 제거된 0의 개수]
     */
    private static int[] solution(String s) {
        int count = 0;
        int removeZerosCount = 0;

        while(!"1".equals(s)) {
            int oneCount = 0;

            for(int i = 0; i < s.length(); i++) {
                if('1' == s.charAt(i)) {
                    oneCount++;
                }
            }

            count++;
            removeZerosCount += s.length() - oneCount;
            s = Integer.toBinaryString(oneCount);
        }

        return new int[] {count, removeZerosCount};
    }
}