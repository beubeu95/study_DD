package 과제;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Tree2805 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine(), " ");
        int list [] = new int [N];

        for(int i = 0; i< N; i++) {
            list [i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(list);
        System.out.println(Arrays.toString(list));

        for(int i = N;i>0;i--) {
            int sum = 0;
            for(int j=0; j<N;j++){
                int last = 0;
                if(list[i-1] < list[j]) {
                    last = list[j] - list[i-1];

                }
                sum+=last;
            }
            if(sum >= M) {

                System.out.println("나무 높이 : "+list[i-1]);
                break;
            }

        }

    }


}
