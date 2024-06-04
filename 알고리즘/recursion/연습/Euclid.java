package 연습;

// 최대공약수
public class Euclid {

    public static void main(String[] args) {
        int result = func( 10, 4);
        int result2 = func (20, 3);
        int result3 = func(6, 20);
        System.out.println("result : "+result);
        System.out.println("result2 : "+result2);
        System.out.println("result3 : "+result3);
    }

    public static int func(int k , int g) {
        if(k<g) {
            int tmp = g;
            int temp = k ;
            g = temp;
            k = tmp;
        }

        if ( k % g == 0) {
            return g;
        } else {
            return func(g, k%g);
        }
    }
}
