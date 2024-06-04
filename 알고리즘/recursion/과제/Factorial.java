package 과제;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Factorial {
    public static int func(int k) {
        if(k == 0) {
            return 1;
        } else {
            return k * func(k-1);
        }

    }

    public static void main (String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("숫자를 입력해주세요!");
        String input = br.readLine();

        int result = func(Integer.parseInt(input));
        System.out.println("팩토리얼의 결과는 : " +result);
    }
}
