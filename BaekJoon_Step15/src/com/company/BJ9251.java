package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BJ9251 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String n1 = br.readLine();
        String n2 = br.readLine();

        int[][] dp = new int[n1.length()+1][n2.length()+1];

        for (int i = 0; i <= n1.length(); i++) {
            dp[i][0] = 0;

        }
        for (int i = 0; i <= n2.length(); i++) {
            dp[0][i] = 0;
        }


        for (int i = 1; i <= n1.length(); i++) {
            for (int j = 1; j <= n2.length(); j++) {
                if(n1.charAt(i-1)==n2.charAt(j-1)) dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]) + 1;
                else dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);

            }


        }

//        int max =0;
//        for (int i = 1; i <= n1.length(); i++) {
//            for (int j = 1; j <=n2.length(); j++) {
//                if(max)
//
//            }
//
//        }


        System.out.println((dp[n1.length()][n2.length()]));



    }
}
