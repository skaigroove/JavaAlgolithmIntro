package Section1;

import java.util.ArrayList;
import java.util.Scanner;

public class Section1_6 {

    public String solution1(String str){

        String answer = "";
        ArrayList<Character> duplicatedList = new ArrayList<>();
        ArrayList<Character> answerList = new ArrayList<>();
        char[] charArray = str.toCharArray();

        for(char x: charArray){
            if(!duplicatedList.contains(x)){   // duplicatedArray에 해당 문자가 없다면?
            duplicatedList.add(x);
            answerList.add(x);
            }
        }

        // StringBuilder를 사용하여 문자열로 변환
        StringBuilder stringBuilder = new StringBuilder(answerList.size());
        for (char c : answerList) {
            stringBuilder.append(c);
        }

        // 문자열로 변환
        answer = stringBuilder.toString();

        return answer;
    }

    // indexOf()를 활용한 구현방식
    // indexOf()는, 해당 문자열에서 "처음" 나오는 문자의 인덱스를 반환한다.
    public String solution2(String str){

        String answer = "";

        for (int i = 0; i < str.length(); i++) {
           //  System.out.println(str.charAt(i) + " " +  i + " " + str.indexOf(str.charAt(i)));
            if(str.indexOf(str.charAt(i))== i)
                answer += str.charAt(i);
        }
        return answer;
    }

    public static void main(String[] args) {

        Section1_6 T = new Section1_6(); // static method 에서 instance method 호출하려 하면 객체를 생성해야 함

        Scanner kb = new Scanner(System.in); // kb는 keyboard의 약자

        String str = kb.next(); // 문자열 하나를 받아옴

        System.out.println(T.solution2(str)); // 솔루션 결과를 츌력
    }
}
