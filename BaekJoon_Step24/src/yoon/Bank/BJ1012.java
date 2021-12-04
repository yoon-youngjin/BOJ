package yoon.Bank;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BJ1012 {
    static int node[][];
    static int check[][];
    static int bugNum = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        for (int i = 0; i < T; i++) {
            st = new StringTokenizer(br.readLine());

            int M = Integer.parseInt(st.nextToken());
            int N = Integer.parseInt(st.nextToken());
            int K = Integer.parseInt(st.nextToken());

            node = new int[N][M];
            check = new int[N][M];

            for (int j = 0; j < K; j++) {
                st = new StringTokenizer(br.readLine());
                int first = Integer.parseInt(st.nextToken());
                int second = Integer.parseInt(st.nextToken());
                node[second][first] = 1;
            }
//
            for (int k = 0; k < N; k++) {
                for (int j = 0; j < M; j++) {
                    if (node[k][j] == 1 && check[k][j] == 0) {// 1의값이면서 방문하지 않은 곳의 정보만 전달
                        dfs(k, j);// 지도의 (0,0)부터 전달
                        bugNum++;
                    }
                }
            }
            sb.append(bugNum + "\n");
            bugNum = 0;
        }
        System.out.println(sb);




    }

    private static void dfs(int x, int y) {
        check[x][y] = 1;

        if (y < node[x].length - 1 && node[x][y + 1] == 1 && check[x][y + 1] != 1) {
            dfs(x, y + 1);
        }
        if (x < node.length - 1 && node[x + 1][y] == 1 && check[x + 1][y] != 1) {
            dfs(x + 1, y);
        }
        if (y > 0 && node[x][y - 1] == 1 && check[x][y - 1] != 1) {
            dfs(x, y - 1);
        }
        if (x > 0 && node[x - 1][y] == 1 && check[x - 1][y] != 1) {
            dfs(x - 1, y);
        }
    }
}
