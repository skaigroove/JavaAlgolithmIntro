package Section1;

import java.util.Scanner;

public class Section1_3 {

    public String solution1(String input){

        String answer = ""; // 입력 중에서 가장 긴 단어를 저장할 공간
        int cmp = Integer.MIN_VALUE; // 앞 단어의 길이와 비교할 변수

        String[] split_input = input.split(" "); // 입력을 공백 단위로 잘라 문자열 배열에 저장

        for(String x : split_input){
            if(x.length()>cmp){ // 만약 앞 단어보다 길이가 길면
                cmp = x.length(); // 앞 단어 길이 변수 현재 단어 길이로 설정
                answer = x; // 답을 현재 단어로 설정
            }
        }
        return answer;
    }

    public String solution2(String input){

        String answer = ""; // 입력 중에서 가장 긴 단어를 저장할 공간
        int cmp = Integer.MIN_VALUE, pos; // 앞 단어의 길이와 비교할 변수, pos는 position의 축약

        while((pos = input.indexOf(" "))!= -1) {
            String tmp = input.substring(0, pos); // 공백 앞까지의 단어가 잘라져서 tmp에 저장된다.
            int len = tmp.length(); // 잘라진 단어의 길이를 저장
            if (len > cmp) { // 잘라진 단어의 길이가 앞 단어의 길이보다 크다면
                cmp = len; // 앞 단어의 길이를 잘라진 단어의 길이로 설정
                answer = tmp; // 반환값을 현재 단어로 설정
            }
            input = input.substring(pos+1); // endIndex를 비워두면 끝까지 자른다
        }
            if(input.length()>cmp) // 만약 마지막 단어가 이전 단어보다 길다면
                answer = input; // 마지막 단어를 반환값으로 설정
            return answer;
    }

    public static void main(String[] args) {

        Section1_3 T = new Section1_3(); // static method 에서 instance method 호출하려 하면 객체를 생성해야 함

        Scanner kb = new Scanner(System.in); // kb는 keyboard의 약자

        String input = kb.nextLine(); // 단어 하나가 아닌, 띄어쓰기가 있는 한 줄을 입력 받아야 하므로 nextLine()을 쓴다

        System.out.println(T.solution2(input));
    }
}
