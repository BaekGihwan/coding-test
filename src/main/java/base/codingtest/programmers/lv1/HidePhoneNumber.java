package base.codingtest.programmers.lv1;

import java.util.Scanner;

public class HidePhoneNumber {
    // 핸드폰 번호 가리기
    // https://school.programmers.co.kr/learn/courses/30/lessons/12948

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.printf("문자열 phone_number를 입력하세요: ");
        String phone_number = scanner.nextLine();

        String result = solution(phone_number);
        System.out.println("result = " +  result);

        scanner.close();
    }

    /**
     * 전화번호의 뒤 4자리를 제외한 나머지를 '*'로 가린다.
     *
     * @param phone_number 전화번호 문자열
     * @return 가려진 전화번호
     */
    private static String solution(String phone_number) {

        return "*".repeat(phone_number.length() - 4) + phone_number.substring(phone_number.length() - 4);
    }
}
