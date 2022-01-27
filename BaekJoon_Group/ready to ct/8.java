package yoon.hw;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static int N,M;
    public static int[][] map;

    public static void main(String[] args) throws IOException {
        // write your code here

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        map = new int[N][M];
        int count = 0;

        for (int i = 0; i < N; i++) {
            String line = br.readLine();
            for (int j = 0; j < M; j++) {
                map[i][j] = Integer.parseInt(String.valueOf(line.charAt(j)));
            }
        }

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if (DFS(i, j)) {
                    count+=1;
                }
            }
        }
        System.out.println(count);
    }

    public static boolean DFS(int x, int y) {
        if (x <= -1 || x >=N || y <= -1 || y >= M) {
            return false;
        }
        if(map[x][y] == 0) {
            map[x][y] = 1;
            DFS(x - 1, y);
            DFS(x, y - 1);
            DFS(x + 1, y);
            DFS(x, y + 1);
            return true;
        }
        return false;

    }
}
