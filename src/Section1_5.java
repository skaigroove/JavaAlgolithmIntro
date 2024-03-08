import java.util.Scanner;

public class Section1_5 {
    public String solution(String str) {

        String answer = "";
        char[] s = str.toCharArray();
        int lt = 0, rt = str.length() - 1;

        while (lt < rt) {

            if (!Character.isAlphabetic(s[lt])) lt++; // lt가 영문이 아니면 lt 증가
            else if (!Character.isAlphabetic(s[rt])) rt--; // rt가 영문이 아니면 rt 증가

            if(Character.isAlphabetic(s[lt]) && Character.isAlphabetic(s[rt])){ // lt,rt 모두 영문이라면 자리바꿈
                char tmp = s[lt];
                    s[lt] = s[rt];
                    s[rt] = tmp;
                lt++;
                rt--;
            }
        }

        answer = String.valueOf(s); // charArray를 String으로 변환
        return answer;
    }

    public static void main(String[] args) {

        Section1_5 T = new Section1_5(); // static method 에서 instance method 호출하려 하면 객체를 생성해야 함

        Scanner kb = new Scanner(System.in); // kb는 keyboard의 약자

        String str = kb.next(); // 문자열 하나를 받아옴

        System.out.println(T.solution(str)); // 솔루션 결과를 츌력

    }
}
