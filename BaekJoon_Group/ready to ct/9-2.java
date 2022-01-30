//BOJ 2667
package yoon.hw;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;


public class Main {
    public static int N;
    public static int[][] map;
    public static ArrayList<Integer> arr = new ArrayList();
    // 상,하,좌,우
    public static int[] dx = {-1, 1, 0, 0};
    public static int[] dy = {0, 0, -1, 1};

    public static class Point {
        int x;
        int y;

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        N = Integer.parseInt(br.readLine());
        map = new int[N][N];

        for (int i = 0; i < N; i++) {
            String temp = br.readLine();
            for (int j = 0; j < N; j++) {
                map[i][j] = Integer.parseInt(String.valueOf(temp.charAt(j)));
            }
        }
        int total = 0;

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if(BFS(i, j)){
                    total+=1;
                }
            }
        }

        System.out.println(total);
        Collections.sort(arr);
        for (int i = 0; i < arr.size(); i++) {
            System.out.println(arr.get(i));
        }

    }

    private static boolean BFS(int x,int y) {
        if(map[x][y] ==0) {
            return false;
        }
        int count = 0;
        Queue<Point> queue = new LinkedList();
        queue.add(new Point(x, y));
        while (!queue.isEmpty()) {
            Point p = queue.poll();
            int nx;
            int ny;
            for (int i = 0; i < 4; i++) {
                nx = p.x + dx[i];
                ny = p.y + dy[i];

                if (nx < 0 || ny < 0 || nx >= N || ny >= N) {
                    continue;
                } else if(map[nx][ny] == 1){
                    map[nx][ny] = 0;
                    queue.offer(new Point(nx, ny));
                    count++;
                }

            }
        }

        arr.add(count);
        return true;

    }


}
