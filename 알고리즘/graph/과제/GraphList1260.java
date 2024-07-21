package 과제;

import java.util.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GraphList1260 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        //N : 노드 수 M : 에지 수 V : 시작점
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int V = Integer.parseInt(st.nextToken());

        ArrayList<Integer> [] arr = new ArrayList[N+1];
        boolean visited = new boolean [N+1];

        for(int i=0; i<=N;i++) {
            arr[i] = new ArrayList<>();
        }
        
        for(int i=0;i<M;i++){
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            arr[a].add(b);
            arr[b].add(a);
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
            for(int i=0; i< arr[a].size();i++) {
                int next = arr[a].get(i);
                if(visited[next] == false) {
                    que.add(next);
                    visited[next] = true;
                    System.out.print(next + " ");
                }
            }
        }
    }

    public static void dfs(int node) {
        visited[node] = true;
        System.out.print(node + " ");

        for(int i=0; i<arr[node].size();i++) {
            int next = arr[node].get(i);
            if(visited[next] == false) {
                dfs(next);
            }
        }
    }



}