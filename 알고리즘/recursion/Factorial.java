//factorial
// 0! =1
// n! = n * (n-1)! n>0
// func(5) => 5 * func(4) => 5 * 4 * func(3) => 5 * 4 * 3 * func(2) => 5 * 4 * 3 * 2 * func(1) => 5 * 4 * 3 * 2 * 1 * 1 => 120
public class Factorial {

    public static void main(String [] args) {
        int result = func(5);
        System.out.println("factorial 예제입니다! 답은 ? "+result);
    }

    public static int func (int k) {
        if(k == 0) {
            return 1;
        } else {
            return k * func(k-1);
        }
    }
}
