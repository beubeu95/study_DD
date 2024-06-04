// 피보나치
// f0 = 0
// f1 = 1
// fn = fn-1 + fn-2 n>1
// func(10) => func(9) + func (8) => func(8) + func(7) + func(7) + func(6) => .......
// => 55
public class Fibonacci {

    public static void main(String [] args) {
        int result = func(10);
        System.out.println("피보나치 예시입니다. 답은 ?" + result);
    }

    public static int func(int k) {
        if ( k <2 ) {
            return k;
        } else {
            return func(k-1) + func(k-2);
        }
    }
}
