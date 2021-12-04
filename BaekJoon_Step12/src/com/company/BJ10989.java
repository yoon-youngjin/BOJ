package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BJ10989 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        int[] al = new int[N];

        for (int i = 0; i < N; i++) {
            al[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(al);


        for(int i : al) {
            sb.append(i).append('\n');
        }
        System.out.println(sb);


    }
}
