import java.util.Scanner;

public class Section1_8 {
    public String solution(String str){

        String answer = "NO";
        str = str.toUpperCase().replaceAll("[^A-Z]","");
        String cmp = new StringBuilder(str).reverse().toString();

        if(str.equals(cmp))
            answer = "YES";

        return answer;
    }

    public static void main(String[] args) {

        Section1_8 T = new Section1_8(); // static method 에서 instance method 호출하려 하면 객체를 생성해야 함

        Scanner kb = new Scanner(System.in); // kb는 keyboard의 약자
        String str = kb.nextLine();
        System.out.print(T.solution(str));

    }
}
