package 과제;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

//https://www.acmicpc.net/problem/2110

public class Tree2110 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int N = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(st.nextToken());

        int list [] = new int [N];

        for(int i =0; i<list.length;i++){
            list[i]= Integer.parseInt(br.readLine());
        }
        Arrays.sort(list);

        long max = list[N-1]- list[0];
        long mid = 0;
        long min = 0;

        while(min<max) {
            mid = (min+max)/2;
            long cnt =1;
            long set = list[0];

            for(int i =1; i<list.length;i++) {
                if(list[i]- set) {
                    cnt++;
                    set = list[i];
                }
                
            }


            //C보다 작다 => 거리가 너무 넓으면 max = mid -1
            //c보다 많다 => 거리가 너무 좁으면 min = mid+1
             if(cnt >= C) {
				max = mid;
			}
			else {
				min = mid - 1;
			}
        }
        System.out.println(mid);
    }


}
