package 연습;

// 이 함수는 무슨 함수일까?
// func(4) => 4+ func(3) => 4 + 3 + func(2) => 4 + 3 + 2 + func(1) => 4 + 3 + 2 + 1 +0 = 10
public class Code03 {

    public static void main(String[] args) {
        int result = func(4);
        System.out.println("답은 ? " + result);
    }

    public static int func(int k) {
        if(k == 0) {
            return 0;
        } else {
            return  k + func(k-1);
        }
    }
}
