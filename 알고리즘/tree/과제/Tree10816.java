package 과제;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Tree10816 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int [] arr = new int [N];

        for(int i = 0; i<N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        System.out.println("가지고 있는 카드 배열 : "+Arrays.toString(arr));

        int M = Integer.parseInt(br.readLine());

        st = new StringTokenizer(br.readLine(), " ");

        int [] ans = new int [M];

        for(int i = 0; i<M; i++) {
            int cnt = 0;
            int a = Integer.parseInt(st.nextToken());
            for ( int j =0; j<N; j++) {
                if(a == arr[j]){
                    cnt++;
                }
            }
            ans[i] = cnt;
        }

        for(int i = 0; i<M; i++) {
            System.out.print(ans[i]+ " ");
        }
    }



}
