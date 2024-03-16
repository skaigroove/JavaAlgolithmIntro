package Section1;

import java.util.Scanner;

public class Section1_11 {
    public String solution(String str){

        String answer = ""; // 빈 공간 answer 생성
        str = str + " "; // str
        char cmp = str.charAt(0);
        int cnt = 1;

        for(int i = 1; i < str.length() ; i++){
            if(cmp==str.charAt(i)){
                cnt++;
            }
            else {
                answer += cmp + (cnt>1 ? String.valueOf(cnt) : "");
                cmp=str.charAt(i);
                cnt=1;
            }
        }

        return answer;
    }

    public static void main(String[] args) {

        Section1_11 T = new Section1_11(); // static method 에서 instance method 호출하려 하면 객체를 생성해야 함

        Scanner kb = new Scanner(System.in); // kb는 keyboard의 약자

        String str = kb.next();

        System.out.println(T.solution(str));
    }
}
