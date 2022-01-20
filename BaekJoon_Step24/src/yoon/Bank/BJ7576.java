package yoon.Bank;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class BJ7576 {
    static int M;
    static int N;
    static int node[][]; // 아파트 단지 배열
    static int[] dx = {-1, 1, 0, 0}; // 상,하
    static int[] dy = {0, 0, 1, -1}; // 좌,우
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st ;
        st = new StringTokenizer(br.readLine());

        M = Integer.parseInt(st.nextToken());
        N = Integer.parseInt(st.nextToken());

        node = new int[N][M];

        for (int i = 0; i < N; i++) {
            String row = br.readLine();
            String[] temp = row.split(" ");
            for (int j = 0; j < temp.length; j++) {
                int a = Integer.parseInt(temp[j]);
                node[i][j] = a;

            }

        }
        print(node, N, M);
        bfs();
        print(node, N, M);





    }
    private static void bfs() {
        Queue<int[]> q = new LinkedList<>();


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
                max = Math.max(max, node[i][j]);
            }
            //그렇지 않다면 최대값을 출력한다.

        }
        System.out.println(max - 1);



    }
    public static void print(int[][] arr, int N, int M) {
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

}
