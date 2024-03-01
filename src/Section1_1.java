import java.util.Scanner;

public class Section1_1 {

    /* non-static 인 instance method로 solution method 선언*/
    public int solution1(String str, char t){

        int answer = 0; // answer은 0으로 초기화

        for(int i = 0; i< str.length(); i++){ // 글자의 길이 수 만큼 반복
            char c = str.charAt(i); // 앞에서부터 한 글자씩 같은지 확인
            if(t==c || t==c+32 || t == c-32) // 같으면 answer을 1만큼 증가(대소문자 구분 없이)
                answer++;
        }

        return answer;
    }

    public int solution2(String str, char t){

        int answer = 0; // answer은 0으로 초기화
        str = str.toUpperCase();
        t= Character.toUpperCase(t);
        for(char x : str.toCharArray()){ // iterator
            if(x==t)
                answer++;
        }
        return answer;
    }

    public static void main(String[] args) {

        Section1_1 T = new Section1_1(); // static method 에서 instance method 호출하려 하면 객체를 생성해야 함

        Scanner kb = new Scanner(System.in); // kb는 keyboard의 약자
        String str = kb.next(); // next()는 콘솔로 문자열 하나를 읽어들임
        char c = kb.next().charAt(0); // 일단 kb.next()로 문자열을 읽어들이고, 그 읽어들인 문자열의 0번째 char만 가져와라

        System.out.println(T.solution2(str,c));
    }
}