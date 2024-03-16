package Section2;

import java.util.Scanner;

public class Section2_7 {

    public int solution(int[] numArray){

        int answer = 0;
        int seq = 0;
        // int[] resultArray = new int[numArray.length];

        if(numArray[0]==1) {
            answer +=1;
            seq+=1;
            //resultArray[0] = seq;
        }

        for (int i = 1; i < numArray.length; i++) {
            if(numArray[i] ==1) {
                seq+=1;
                answer += seq;
                //resultArray[i] = seq;
            }
            else
                seq = 0;
        }

//        for (int x: resultArray) {
//            System.out.print(x + " ");
//        }

        return answer;
    }

    public static void main(String[] args) {

        Section2_7 T = new Section2_7(); // static method 에서 instance method 호출하려 하면 객체를 생성해야 함

        Scanner kb = new Scanner(System.in); // kb는 keyboard의 약자

        int num = kb.nextInt();

        int[] numArray = new int[num];

        for (int i = 0; i < num; i++) {
            numArray[i] = kb.nextInt();
        }

        System.out.println(T.solution(numArray));
    }
}
