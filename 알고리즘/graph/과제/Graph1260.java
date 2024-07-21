package 과제;

import java.util.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//https://www.acmicpc.net/problem/1260

public class Graph1260 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        //N : 노드 수 M : 에지 수 V : 시작점
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int V = Integer.parseInt(st.nextToken());

        int arr = new int [N+1][N+1];
        boolean visited = new boolean [N+1];

        for(int i=0; i<M;i++){
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            arr[a][b] = 1
        }

        dfs(V);
        System.out.println();
        visited = new boolean [N+1];
        bfs(V);


    }

    public static void bfs(int node) {

        Queue<Integer> que = new LinkedList<>();
        que.add(node);
        visited[node] = true;
        System.out.print(node + " ");

        while(!que.isEmpty()){
            int a = que.poll();
            for(int i=1; i<=N;i++) {
                if(arr[a][i] == 1 && visited[i] == false) {
                    que.add(i);
                    visited[i] = true;
                    System.out.print(i + " ");
                }
            }
        }
    }

    public static void dfs(int node) {
        visited[node] = true;
        System.out.print(node + " ");

        for(int i=1; i<=N;i++) {
            if(arr[node][i] == 1 && visited[i] == false) {
                dfs(i);
            }
        }
    }
}