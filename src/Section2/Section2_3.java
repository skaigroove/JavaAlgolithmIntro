package Section2;

import java.util.Scanner;

public class Section2_3 {
    public String[] solution(int game_num, int[] A, int[] B){

        String[] answer = new String[game_num];

        for (int i = 0; i < game_num; i++) {
            if (A[i]>B[i]){
                if(A[i]==3 && B[i]==1) answer[i]= "B";
                else answer[i]= "A";
            }
            else if (A[i]<B[i]) {
                if(A[i]==1 && B[i]==3) answer[i]= "A";
                else answer[i]= "B";
            }
            else answer[i]= "D"; // A[i]==B[i]
        }
        return answer;
    }

    public static void main(String[] args) {

        Section2_3 T = new Section2_3(); // static method 에서 instance method 호출하려 하면 객체를 생성해야 함

        Scanner kb = new Scanner(System.in); // kb는 keyboard의 약자

        int game_num = kb.nextInt(); // 게임 횟수 받기

        int[] A = new int[game_num]; // A 정보
        int[] B = new int[game_num]; // B 정보

        for (int i = 0; i < game_num; i++) { // A 정보 받아오기
            A[i] = kb.nextInt();
        }
        for (int i = 0; i < game_num; i++) { // B 정보 받아오기
            B[i] = kb.nextInt();
        }

        for (String x : T.solution(game_num,A,B)) { // for-each로 출력
            System.out.println(x);
        }
    }
}
