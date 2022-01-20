package yoon.Bank;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class BJ2178 {
    static int node[][]; // 아파트 단지 배열
    static boolean check[][]; // 각 아파트 단지 방문여부 배열
    static int N;
    static int M;
    static int[] dx = {-1, 1, 0, 0}; // 상,하
    static int[] dy = {0, 0, 1, -1}; // 좌,우

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        node = new int[N][M];
        check = new boolean[N][M];
        for (int i = 0; i < node.length; i++) {
            String row = br.readLine();
            for (int j = 0; j < node[i].length; j++) {
                node[i][j] = row.charAt(j) - '0';
            }
        }
        check[0][0] = true;

        bfs(0, 0);
        System.out.println(node[N - 1][M - 1]);


    }

    private static void bfs(int x, int y) {
        Queue<int[]> q = new LinkedList<>();
        q.offer(new int[]{x, y});

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if (node[i][j] == 1)
                    //익은 토마토가 있는 모든 위치를 큐에 담는다.
                    q.add(new int[]{i, j});
            }
        }
        while (!q.isEmpty()) {
            int now[] = q.poll();
            int nowX = now[0];
            int nowY = now[1];

            for (int i = 0; i < 4; i++) {
                int nextX = nowX + dx[i];
                int nextY = nowY + dy[i];

                if (nextX < 0 || nextY < 0 || nextX >= N || nextY >= M) {
                    continue;

                }
                if (node[nextX][nextY] != 0) continue;


                q.add(new int[]{nextX, nextY});
                node[nextX][nextY] = node[nowX][nowY] + 1;
                check[nextX][nextY] = true;
            }

        }

        int max = 0;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if (node[i][j] == 0) {
                    //토마토가 모두 익지 못한 상황이라면 -1.java 을 출력한다.
                    System.out.println(-1);
                    return;
                }
        }
        //그렇지 않다면 최대값을 출력한다.
        System.out.println(max - 1);
    }



    }
}
