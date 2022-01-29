package yoon.hw;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;


public class Main {
    public static int[][] map;
    public static int[][] visited;

    public static int N;
    public static int M;

    // 북, 남, 서, 동
    public static int[] dx = {-1, 1, 0, 0};
    public static int[] dy = {0, 0, -1, 1};

    static class Point {
        public int x;
        public int y;

        Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        int count = 0;
        map = new int[N][M];
        visited = new int[N][M];

        for (int i = 0; i < N; i++) {
            String temp = br.readLine();
            for (int j = 0; j < M; j++) {
                map[i][j] = Integer.parseInt(String.valueOf(
                        temp.charAt(j)));
                visited[i][j] = Integer.parseInt(String.valueOf(
                        temp.charAt(j)));
            }
        }


        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                count += DFS(i, j);
            }
        }


        System.out.println(count);

    }

    private static int DFS(int i, int j) {

        if (visited[i][j] == 1) {
            return 0;
        }

        Stack<Point> stack = new Stack();
        stack.push(new Point(i, j));
        visited[i][j] = 1;

        while (!stack.isEmpty()) {

            Point p = stack.peek();

            for (int k = 0; k < 4; k++) {
                int nx = p.x + dx[k];
                int ny = p.y + dy[k];
                if (nx < 0 || nx >= N || ny < 0 || ny >= M) {
                    if(k==3) stack.pop();
                    continue;
                }

//                if(visited[nx][ny] == 1) continue;
                if (map[nx][ny] == 0 && visited[nx][ny] == 0) {
                    stack.push(new Point(nx, ny));
                    visited[nx][ny] = 1;
                    break;
                }
                if(k==3) stack.pop();
            }
        }
        return 1;


    }

    private static boolean BFS(int i, int j) {

        if (i <= -1 || i >= N || j <= -1 || j >= M) {
            return false;
        }
        if (map[i][j] == 0) {
            map[i][j] = 1;
            DFS(i - 1, j);
            DFS(i, j - 1);
            DFS(i + 1, j);
            DFS(i, j + 1);
            return true;
        }
        return false;
    }


}
