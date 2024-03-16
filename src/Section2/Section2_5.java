package Section2;

import java.util.Scanner;

public class Section2_5 {

    // 소수란? 약수가 1과 자기 자신밖에 없는 수
    // 어떤 수 X가 소수 인지를 판별하려면 X를 2부터 X보다 작은 수(X-1)까지 차례대로 나누어 떨어지는지 검사하면 된다.
    public int solution1(int num){

        int prime = num-1; // 1은 솟수가 아니고, 2는 솟수이므로 1만 빼준다.

        for (int i = 3; i <= num; i++) {
            int tmp;
            for (int j = 2; j < i; j++) {
                tmp = i%j;
                if(tmp==0) {
                    prime -= 1;
                    break;
                }
            }
        }
        return prime;
    }


    public int solution2(int num){ // 에라토스테네스 체

        int prime = 0;

        int[] ch = new int[num+1]; // 숫자를 20까지 저장해야 하므로, num+1 만큼의 공간을 만든다.

        for (int i = 2; i < num; i++) {
            if(ch[i]==0){
                prime+=1;
                for (int j = 0; j < num; j = j+i)
                    ch[j]=1;
            }
        }
        return prime;
    }

    public static void main(String[] args) {

        Section2_5 T = new Section2_5(); // static method 에서 instance method 호출하려 하면 객체를 생성해야 함

        Scanner kb = new Scanner(System.in); // kb는 keyboard의 약자

        int num = kb.nextInt();

        System.out.println(T.solution2(num));
    }
}
