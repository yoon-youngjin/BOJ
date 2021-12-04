package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BJ9461 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        Long[] arr = new Long[101];

        arr[1] = 1L;
        arr[2] = 1L;
        arr[3] = 1L;
        arr[4] = 2L;
        arr[5] = 2L;
        arr[6] = 3L;
        arr[7] = 4L;
        arr[8] = 5L;
        arr[9] = 7L;
        arr[10] = 9L;

        for (int i = 11; i <= 100; i++) {
            arr[i] = arr[i - 1] + arr[i - 5];
        }
        for (int i = 0; i < T; i++) {
            int N = Integer.parseInt(br.readLine());
            sb.append(arr[N]).append('\n');
        }

        System.out.print(sb);


    }


}

