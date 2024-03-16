package Section2;

import java.util.ArrayList;
import java.util.Scanner;

public class Section2_6 {
    public ArrayList<Integer> solution(String[] StringArray){

        ArrayList<Integer> answer = new ArrayList<Integer>();

        // StringArray[i]를 reverse한 후 intArray로 변환
        for (String x: StringArray) {
            String t = new StringBuilder(x).reverse().toString();
            int tmp = Integer.parseInt(t);
            boolean isPrime = true;
            for (int i = 2; i < tmp; i++) {
                if ((tmp % i == 0)) { // 0으로 나누어 떨어지면 소수가 아님
                    isPrime = false;
                    break; // 다음 검증으로
                }
            }
            if(isPrime && tmp!=1) answer.add(tmp); // 소수이면 정답 배열에 넣는다. 단, tmp가 1이면 소수가 아니니 예외.
        }

        return answer;
    }

    public static void main(String[] args) {

        Section2_6 T = new Section2_6(); // static method 에서 instance method 호출하려 하면 객체를 생성해야 함

        Scanner kb = new Scanner(System.in); // kb는 keyboard의 약자

        int num = kb.nextInt();

        String[] stringArray = new String[num];

        for (int i = 0; i < num; i++) {
            stringArray[i] = kb.next();
        }

        for (int x: T.solution(stringArray)) {
            System.out.print(x + " ");
        }
    }
}
