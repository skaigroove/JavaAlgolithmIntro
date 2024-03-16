package Section2;

import java.util.Scanner;

// fibonacci
public class Section2_4 {
    public int[] solution1(int num){

        int[] answer = new int[num];

        answer[0]=1;
        answer[1]=1;

        for (int i = 2; i < num ; i++) {
            answer[i] = answer[i-1] + answer[i-2];
        }
        return answer;
    }

    public int[] solution2(int num){

        int[] answer = new int[num];

        answer[0]=1;
        answer[1]=1;

        for (int i = 2; i < num ; i++) {
            answer[i] = fibo(i);
        }
        return answer;
    }

    public int fibo(int n){
        if(n==0)
            return 1;
        else if (n==1)
            return 1;
        else
            return fibo(n-1) + fibo(n-2);
    }

    public static void main(String[] args) {

        Section2_4 T = new Section2_4(); // static method 에서 instance method 호출하려 하면 객체를 생성해야 함

        Scanner kb = new Scanner(System.in); // kb는 keyboard의 약자

        int num = kb.nextInt(); // 피보나치 수열 길이 받기

        for (int x: T.solution2(num)) {
            System.out.print(x + " ");
        }
    }
}
