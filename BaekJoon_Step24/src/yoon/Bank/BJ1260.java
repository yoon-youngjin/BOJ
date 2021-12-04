package yoon.Bank;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class BJ1260 {
    static int N;
    static int M;
    static int V;
    static int[][] check = new int[1001][1001];
    static boolean[] checked = new boolean[1001];
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        V = Integer.parseInt(st.nextToken());

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int first = Integer.parseInt(st.nextToken());
            int second = Integer.parseInt(st.nextToken());
            check[first][second] = check[second][first] = 1;
        }

        dfs(V);
        checked = new boolean[1001];
        sb.append("\n");
        bfs(V);
        System.out.println(sb);


    }

    private static void bfs(int v) {
        Queue<Integer> q = new LinkedList<>();
        q.offer(v);
        sb.append(v + " ");

        checked[v] = true;
        while (!q.isEmpty()) {
            int temp = q.poll();
            for (int i = 1; i <= N; i++) {
                if(check[temp][i] == 1 && checked[i] == false) {
                    q.offer(i);
                    checked[i] = true;
                    sb.append(i + " ");

                }

            }
        }


    }

    private static void dfs(int v) {
        sb.append(v+" ");
        checked[v] = true;
        for (int i = 1; i <= N; i++) {

            if (check[v][i] == 1 && checked[i] == false) {

                dfs(i);
            }
        }
    }
}
