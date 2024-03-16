package Section1;

import java.util.Scanner;

public class Section1_12 {
    public String solution(int num, String str){

        String answer = "";

        for (int i = 0; i < num; i++) {
            String toBinary = str.substring(0,7).replace('#','1').replace('*','0'); // 주어진 문자열을 이진수로 변환
            int toDecimal = Integer.parseInt(toBinary,2); // 2진수를 10진수로 변환
            answer += (char)toDecimal; // answer에 10진수 정수를 아스키코드로 변환하여 추가
            str = str.substring(7); // 다음 순회를 위해 잘라냄
        }
        return answer;
    }

    public static void main(String[] args) {

        Section1_12 T = new Section1_12(); // static method 에서 instance method 호출하려 하면 객체를 생성해야 함

        Scanner kb = new Scanner(System.in); // kb는 keyboard의 약자

        int num = kb.nextInt();

        String str = kb.next();

        System.out.println(T.solution(num,str));

    }
}
