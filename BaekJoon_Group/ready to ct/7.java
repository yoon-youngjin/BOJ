package yoon.hw;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;


public class Main {


    // 북,동,남,서 -> 0,1,2,3
    public static int[] dx = {-1, 0, 1, 0};
    public static int[] dy = {0, 1, 0, -1};
    public static int[][] map;
    public static int dir;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        dir = Integer.parseInt(st.nextToken());
        map = new int[N][M];
        int count = 1;
        int turn_time = 0;
        map[A][B] = 1;
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < M; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        while (true) {
            turn_left();
            int nx = A + dx[dir];
            int ny = B + dy[dir];

            if (map[nx][ny] != 1) {
                map[nx][ny] = 1;
                A = nx;
                B = ny;
                count++;
                turn_time = 0;
            } else {
                turn_time++;
            }
            if (turn_time == 4) break;

        }
        System.out.println(count);

    }

    private static void turn_left() {
        dir -= 1;
        if (dir < 0) {
            dir = 3;
        }

    }

}
