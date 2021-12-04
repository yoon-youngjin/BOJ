package com.company;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class BJ1932 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[][] arr = new int[N][];
        StringTokenizer st;

        for (int i = 0; i < N; i++) {
            arr[i] = new int[i + 1];
            st = new StringTokenizer(br.readLine());
            for(int j=0;j<=i;j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        for(int i = N-1;i>0;i--) {
            for(int j=0;j<i;j++) {
                arr[i-1][j] += Math.max(arr[i][j],arr[i][j+1]);
            }
        }
        System.out.println(arr[0][0]);
    }
}
