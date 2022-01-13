package yoon.hw;

import java.io.*;
import java.util.*;


public class BJ16173 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        class Pair {
            int cols;
            int rows;

            public Pair(int cols, int rows) {
                this.cols = cols;
                this.rows = rows;
            }
        }

        final int FIELD_SIZE = Integer.parseInt(br.readLine());
        boolean visited[][] = new boolean[FIELD_SIZE][FIELD_SIZE];

        int field[][] = new int[FIELD_SIZE][FIELD_SIZE];
        for (int i = 0; i < FIELD_SIZE; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < FIELD_SIZE; j++) {
                field[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        Queue<Pair> queue = new LinkedList<>();
        queue.add(new Pair(0, 0));

        boolean canFinish = false;
        while (!queue.isEmpty()) {
            Pair temp = queue.poll();
            if (visited[temp.cols][temp.rows]) {
                continue;
            }
            int jumpPower = field[temp.cols][temp.rows];
            if (jumpPower == -1) {
                canFinish = true;
                break;
            }
            visited[temp.cols][temp.rows] = true;
            if (temp.cols + jumpPower < FIELD_SIZE) {
                queue.add(new Pair(temp.cols + jumpPower, temp.rows));
            }

            if (temp.rows + jumpPower < FIELD_SIZE) {
                queue.add(new Pair(temp.cols, temp.rows + jumpPower));
            }
        }

        if (canFinish) {
            sb.append("HaruHaru");
        } else {
            sb.append("Hing");
        }
        sb.append("\n");

        bw.write(sb.toString());

        bw.flush();
        br.close();
        bw.close();

    }


}


