package Section2;

import java.util.Scanner;

public class Section2_2 {
    public int solution(int num, int[] heightArray){

        int maxHeight = heightArray[0];
        int cnt = 1;

        for (int i = 1; i < heightArray.length; i++) {
            if(heightArray[i]>maxHeight){
                maxHeight = heightArray[i];
                cnt++;
            }
        }
        return cnt;
    }

    public static void main(String[] args) {

        Section2_2 T = new Section2_2(); // static method 에서 instance method 호출하려 하면 객체를 생성해야 함

        Scanner kb = new Scanner(System.in); // kb는 keyboard의 약자

        int num = kb.nextInt(); // 학생 수 받기

        int[] heightArray = new int[num]; // 키 배열 받기
        for (int i = 0; i < num; i++) {
            heightArray[i] = kb.nextInt();
        }

        System.out.println(T.solution(num,heightArray));
    }
}
