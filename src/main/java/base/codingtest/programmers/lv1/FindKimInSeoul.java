package base.codingtest.programmers.lv1;

public class FindKimInSeoul {
    // 서울에서 김서방 찾기
    // https://school.programmers.co.kr/learn/courses/30/lessons/12919

    public static void main(String[] args) {
        String [] seoul = new String[] {"Jane", "Kim"};

        String answer = solution(seoul);
        System.out.println("answer is " + answer);

    }

    /**
     * 서울 배열에서 "Kim"의 위치를 찾아
     * "김서방은 x에 있다" 형식의 문자열을 반환한다.
     *
     * @param seoul 이름 배열
     * @return 김서방 위치 문자열
     */
    private static String solution(String[] seoul) {

        for (int i = 0; i < seoul.length; i++) {
            if ("Kim".equals(seoul[i])) {
                return "김서방은 " + i + "에 있다";
            }
        }

        return "";
    }
}
