package 연습;

// 순환은 항상 무한루프에 빠질까?
// 답은 no~!~!
// 무한루프에 빠지지 않으려면?
// 1. Base case : 적어도 하나의 recursion에 빠지지 않는 경우가 존재해야 한다.
// 2. Recursive case : recursion을 반복하다보면 결국 base case로 수렴해야한다.
public class Code02 {

    public static void main(String[] args) {
        int k = 5;
        func(k);
    }

    public static void func(int n) {
        if(n<=0) {
            return;
        } else {
            System.out.println("Hello~!"+ n);
            func(n-1);
        }
    }
}
