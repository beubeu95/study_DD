package 연습;

// x ^ n
// x^0 = 1
//x^n = x* x^n-1 if n>0
// func (5, 4) => 5 * func(5, 3) => 5 * 5 * func(5,2) => 5 * 5 * 5 * func(5,1) => 5 * 5 * 5 * 5 * 1 => 635.0
public class Square {

    public static void main(String [] args) {
        double result = func(5 , 4);
        System.out.println("제곱 예시입니다. 답은 ? "+ result);
    }

    public static double func( double k, int g ) {
        if( g == 0 ) {
            return 1;
        } else {
            return k * func(k, g-1);
        }
    }
}
