package Section1;

import java.util.ArrayList;
import java.util.Scanner;

public class Section1_4 {

    /**
     * String 뒤집기는 3가지 방법이 있다.
     * 1. reverse() 메소드를 지원하는 StringBuilder, StringBuffer 클래스를 이용
     * 2. char[] 배열로 변환 후, 역순으로 새로운 char 배열에 저장하여 문자열로 변환
     * 3. List로 변환 후, Collections.reverse(List)를 이용
     */

    /* using reverse()*/
    public ArrayList<String> solution1(String[] str) {
        ArrayList<String> answer = new ArrayList<>();

        for (String x : str) {
            String tmp = new StringBuilder(x).reverse().toString();
            answer.add(tmp);
        }
        return answer;
    }

    /* using CharArray*/
    public ArrayList<String> solution2(String[] str) {
        ArrayList<String> answer = new ArrayList<>();
        for (String x : str) {
            char[] s = x.toCharArray();
            int lt = 0, rt = x.length() - 1;
            while (lt < rt) { // 중앙을 중심으로 두 개씩 짝지어서 자리를 바꿔줌
                char tmp = s[lt];
                s[lt] = s[rt];
                s[rt] = tmp;
                lt++;
                rt--;
            }
            String tmp = String.valueOf(s); // String.valueOf()는 charArray를 String으로 바꿔줌
            answer.add(tmp);
        }
        return answer;
    }


    public static void main(String[] args) {

        Section1_4 T = new Section1_4(); // static method 에서 instance method 호출하려 하면 객체를 생성해야 함
        Scanner kb = new Scanner(System.in); // kb는 keyboard의 약자

        int n = kb.nextInt();

        String[] str = new String[n];
        for (int i = 0; i < n; i++) {
            str[i] = kb.next();
        }

        for (String x : T.solution2(str)) {
            System.out.println(x);
        }
    }
}
