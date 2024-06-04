package 과제;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Fibonacci {

    public static int func(int k) {
        if(k < 2) {
            return k;
        } else {
            return func(k-1) +func(k-2);
        }
    }

    public static void main(String [] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("숫자를 입력해주세요!");
        String input = br.readLine();

        int result = func(Integer.parseInt(input));

        System.out.println("피보나치의 결과는 : " + result);
    }
}
