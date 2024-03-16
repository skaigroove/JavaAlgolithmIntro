package Section1;

import java.util.Scanner;

/** 회문 문자열
 * 앞에서 읽을 때나 뒤에서 읽을 때나 같은 문자열을 회문 문자열이라고 합니다.
 * 문자열이 입력되면 해당 문자열이 회문 문자열이면 "YES", 회문 문자열이 아니면 “NO"를 출력하는 프로그램을 작성하세요.
 * **/
public class Section1_7 {

    public boolean solution(String str){

        String s = str.toLowerCase();
        char[] c = s.toCharArray();
        int forward = 0, backward = c.length - 1;

        while(forward<backward){
            if (c[forward]==c[backward]){
                forward++;
                backward--;
            }
            else
                return false;
        }
        return true;
    }

    public static void main(String[] args) {

        Section1_7 T = new Section1_7(); // static method 에서 instance method 호출하려 하면 객체를 생성해야 함

        Scanner kb = new Scanner(System.in); // kb는 keyboard의 약자

        String str = kb.next();

        if(T.solution(str)) // if true
            System.out.println("YES");
        else
            System.out.println("NO");

    }
}
