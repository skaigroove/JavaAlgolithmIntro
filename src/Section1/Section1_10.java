package Section1;

import java.util.ArrayList;
import java.util.Scanner;

/** 가장 짧은 문자거리
 * 한 개의 문자열 s와 문자 t가 주어질 때
 * 각 문자열 s의 각 문자가 문자 t와 떨어진 최소거리를 출력하는 프로그램을 작성하세요.
 */
public class Section1_10 {
    public ArrayList<Integer> solution(String str, char t) {

        ArrayList<Integer> answer = new ArrayList(); // 동적으로 할당 받아야하므로 ArrayList를 사용
        ArrayList<Integer> distArray = new ArrayList();
        int d ; // distance

        // 1. t가 str의 어느 위치에 있는지 모두 찾은 후, 각 위치에서 t와의 거리를 구한다.
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == t)
                distArray.add(i);
        }

        // 2. 그 중 최소값을 찾아 answer에 추가한다.
        for (int i = 0; i < str.length(); i++) {
            ArrayList<Integer> temp = new ArrayList<>();
            for (int j = 0; j < distArray.size(); j++) {
                // 구한 각 t들의 위치 - 현 문자의 위치
                d = distArray.get(j) - i;
                if (d < 0) d = -d; // 거리는 양수이므로, 음수일 경우 양수로 변환
                temp.add(d);
            }
            answer.add(temp.stream().min(Integer::compare).get()); // 최소값을 찾아서 추가
        }
        return answer;
    }

    public static void main(String[] args) {

        Section1_10 T = new Section1_10(); // static method 에서 instance method 호출하려 하면 객체를 생성해야 함

        Scanner kb = new Scanner(System.in); // kb는 keyboard의 약자

        String s = kb.next();
        char t = kb.next().charAt(0); // String의 첫 번째 문자를 반환하므로, String을 char로 형변환하는것이 됨.

        for (int x : T.solution(s, t)) {
            System.out.print(x + " ");
        }
    }
}
