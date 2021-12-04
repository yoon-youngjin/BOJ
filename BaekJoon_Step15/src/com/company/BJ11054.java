package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BJ11054 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N + 1];
        int[] dp = new int[N + 1];
        int[] dp1 = new int[N + 1];
        int[] dp2 = new int[N + 1];
        dp1[1] = 1;
        dp2[N] = 1;

        st = new StringTokenizer(br.readLine());
        for (int i = 1; i <= N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        for (int i = 2; i <= N; i++) {
            if (dp1[i] == 0) dp1[i] = 1;
            for (int j = 1; j < i; j++) {
                if (arr[i] > arr[j]) {
                    if (dp1[i] < dp1[j] + 1) dp1[i] = dp1[j] + 1;
                }

            }
        }
        for (int i = N-1; i >= 1; i--) {
            if (dp2[i] == 0) dp2[i] = 1;
            for (int j = N; j > i; j--) {
                if (arr[i] > arr[j]) {
                    if (dp2[i] < dp2[j] + 1) dp2[i] = dp2[j] + 1;
                }
            }
        }


        for (int i = 1; i <= N; i++) {
            dp[i] = dp1[i] + dp2[i];
        }

        int max = 0;
        for (int i : dp) {
            max = Math.max(max, i);
        }
        System.out.println(max-1);

    }
}
