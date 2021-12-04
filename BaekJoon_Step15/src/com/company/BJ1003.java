package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BJ1003 {



    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            int n = Integer.parseInt(br.readLine());
            int[][] arr = new int[n + 1][2];

            if (n == 0) {
                sb.append(1 + " " + 0).append('\n');
            }

            if (n == 1) {
                sb.append(0 + " " + 1).append('\n');
            }


            else if(n!=0 && n!=1){

                arr[0][0] = 1;
                arr[1][1] = 1;
                for (int j = 2; j <= n; j++) {
                    arr[j][0] = arr[j - 1][0] + arr[j - 2][0];
                    arr[j][1] = arr[j - 1][1] + arr[j - 2][1];
                }
                sb.append(arr[n][0] + " " + arr[n][1]).append('\n');
            }




        }
        System.out.print(sb);


    }
}
