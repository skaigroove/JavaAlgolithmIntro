import java.util.Scanner;

/** 숫자만 추출
 * 문자와 숫자가 섞여있는 문자열이 주어지면 그 중 숫자만 추출하여 그 순서대로 자연수를 만듭니다.
 * 만약 “tge0a1h205er”에서 숫자만 추출하면 0, 1, 2, 0, 5이고 이것을 자연수를 만들면 1205이 됩니다.
 * 추출하여 만들어지는 자연수는 100,000,000을 넘지 않습니다.
 */
public class Section1_9 {

    public int solution(String str){

        int answer = 0;
        String tmp = "";

        // 문자열을 charArray로 변환하여 차례대로 반복하여 접근하고 숫자면 tmp에 더한다
        char[] charArray = str.toCharArray();
        for (char x: charArray) {
            if(Character.isDigit(x)){
                tmp += x;
            }
        }
        answer = Integer.parseInt(tmp); // String을 int로 변환
        return answer;
    }

    public static void main(String[] args) {

        Section1_9 T = new Section1_9(); // static method 에서 instance method 호출하려 하면 객체를 생성해야 함

        Scanner kb = new Scanner(System.in); // kb는 keyboard의 약자

        String str = kb.next();

        System.out.println(T.solution(str));
    }
}
