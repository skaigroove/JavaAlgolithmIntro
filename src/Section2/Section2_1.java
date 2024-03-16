package Section2;

import Section1.Section1_1;

import java.util.ArrayList;
import java.util.Scanner;

public class Section2_1 {
    public ArrayList<Integer> solution(int[] intArray) {

        ArrayList<Integer> answer = new ArrayList<Integer>(); // 결과값의 길이가 정해지지 않았으므로 동적으로 할당시켜야한다.

        answer.add(intArray[0]);

        for (int i = 1; i < intArray.length; i++) {
            if (intArray[i] > intArray[i - 1]) {
                answer.add(intArray[i]);
            }
        }
        return answer;
    }

    public static void main(String[] args) {

        Section2_1 T = new Section2_1(); // static method 에서 instance method 호출하려 하면 객체를 생성해야 함
        Scanner kb = new Scanner(System.in); // kb는 keyboard의 약자
        int num = kb.nextInt();
        int[] intArray = new int[num];
        for (int i = 0; i < num; i++) {
            intArray[i] = kb.nextInt();
        }

        for (int x : T.solution(intArray)) { // ArrayList는 for-each로 출력 가능하다
            System.out.print(x + " ");
        }
    }
}
