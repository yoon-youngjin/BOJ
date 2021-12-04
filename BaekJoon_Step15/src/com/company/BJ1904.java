package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BJ1904 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        if(N==1) {
            System.out.println(1);
        }
        else if(N==2) {
            System.out.println(2);
        }
        else {
            Long[] arr = new Long[N+1];

            arr[1] = 1L;
            arr[2] = 2L;

            for(int i=3;i<=N;i++) {
                arr[i] = (arr[i - 1] + arr[i - 2])%15746;
            }
            System.out.println(arr[N]);
        }





    }
}
