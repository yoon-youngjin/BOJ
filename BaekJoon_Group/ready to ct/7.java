package yoon.hw;


import java.io.*;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.StringTokenizer;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {

    // 북, 동, 남, 서
    static int[] dx = {-1, 0, 1, 0};
    static int[] dy = {0, 1, 0, -1};
    static int x;
    static int y;
    static int direction;


    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int[][] map = new int[N][M];
        boolean[][] visit = new boolean[N][M];

        st = new StringTokenizer(br.readLine());
        x = Integer.parseInt(st.nextToken());
        y = Integer.parseInt(st.nextToken());
        direction = Integer.parseInt(st.nextToken());

        visit[x][y] = true;

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < M; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        int count = 1;
        int turn_time = 0;

        while (true) {
            turn_left();
            int nx = x + dx[direction];
            int ny = y + dy[direction];

            if (visit[nx][ny] == false && map[nx][ny] != 1) {
                visit[nx][ny] = true;
                x = nx;
                y = ny;
                count += 1;
                turn_time = 0;
                continue;

            } else {
                turn_time += 1;
            }

            if (turn_time == 4) {
                nx = x - dx[direction];
                ny = y - dy[direction];

                if (map[nx][ny] != 1) {
                    x = nx;
                    y = ny;
                }else {
                    break;
                }
                turn_time = 0;
            }
        }
        System.out.println(count);
    }

    private static void turn_left() {
        direction -= 1;
        if (direction < 0) {
            direction = 3;
        }

    }
}
