package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BJ2565 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());


        int[] arr = new int[501];
        int[] dp = new int[501];

        StringTokenizer st;
        int max = 0;
        int max3 = 0;
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine()," ");
            int temp = Integer.parseInt(st.nextToken());
            int temp2 = Integer.parseInt(st.nextToken());
            if(max < temp) max = temp;
            if(max3 <temp2) max3 = temp2;
            arr[temp] = temp2;
        }


        if(N==1) {
            System.out.println(0);
            return;
        }

        for (int i = 1; i <= Math.max(max,max3); i++) {
            if (arr[i] != 0) dp[i] = 1;
            for (int j = 1; j <= i; j++) {
                if (arr[i] > arr[j]) {
                    if (dp[i] < dp[j] + 1) dp[i] = dp[j] + 1;
                }
            }
        }

        int max2 = 0;
        for (int i : dp) {
            max2 = Math.max(max2, i);
        }
        System.out.println(N-max2);
    }
}
