import java.util.Scanner;

public class Section1_2 {
    public String solution1(String input) {

        String answer = "";

        for (int i = 0; i < input.length(); i++) {
            // 차례대로 대문자이면 소문자로 변환, 소문자이면 대문자로 변환
            if (Character.isUpperCase(input.charAt(i)))
                answer += Character.toLowerCase(input.charAt(i));
            else
                answer += Character.toUpperCase(input.charAt(i));
        }
        return answer;
    }

    public String solution2(String input) {

        String answer = "";

        for(char x : input.toCharArray()){ // iterator
            if(x>=97 && x<=122) answer+=(char)(x-32);
            else answer+=(char)(x+32);
        }
        return answer;
    }

    public static void main(String[] args) {

        Section1_2 T = new Section1_2(); // static method 에서 instance method 호출하려 하면 객체를 생성해야 함

        Scanner kb = new Scanner(System.in); // kb는 keyboard의 약자
        String input = kb.next(); // next()로 문자열 입력을 받아옴
        System.out.println(T.solution2(input));

    }
}
