package 과제;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

//https://www.acmicpc.net/problem/1654

public class Tree1654 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int K = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());

        int list [] = new int [K];

        for(int i =0; i<list.length;i++){
            list[i]= Integer.parseInt(br.readLine());
        }
        Arrays.sort(list);
        long max = list[K-1];


        long mid = 0;
        long min = 0;

        while(min<max) {
            mid = (min+max)/2;
            long cnt =0;

            for(int i =0; i<list.length;i++){
                cnt += list[i]/mid;
            }

            if(cnt < N) {
				max = mid;
			}
			else {
				min = mid + 1;
			}
        }
        System.out.println(min-1);
    }


}
