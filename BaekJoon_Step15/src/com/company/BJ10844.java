package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class BJ10844 {
    static int n;

    static long dp[][];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        n = Integer.parseInt(br.readLine());
        dp = new long [n+1][10];

        for(int i=1;i<=9;i++) { // dp배열 초기상태
            dp[1][i] = 1;
        }

        for(int i=2;i<=n;i++) { // 2인 경우부터 N까지 반복
            for(int j=0;j<10;j++) {
                if(j==0) dp[i][j] = (dp[i-1][1]) % 1000000000; // 끝자리가 0일 경우는 1일 때만 고려
                else if(j==9) dp[i][j] = dp[i-1][8] % 1000000000 ; // 끝자리가 9일 경우는 8일 때만 고려
                else dp[i][j] = (dp[i-1][j-1] + dp[i-1][j+1])% 1000000000; // 나머지는 -1.java, +1.java 모두 고려
            }
        }
        long sum=0;
        for(int i=0;i<10;i++) {
            sum +=dp[n][i];
        }

        System.out.println(sum % 1000000000);



    }

}