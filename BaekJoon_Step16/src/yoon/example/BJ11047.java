package yoon.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BJ11047 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        int j = 0;
        Label:
        for (int i = N - 1; i >= 0; i--) {


            if (K < arr[i]) continue;
            while (true) {
                if (K - arr[i] == 0) {
                    j++;
                    break Label;
                }
                if (K - arr[i] < 0) break;
                K -= arr[i];
                j++;

            }
        }


        System.out.println(j);


    }
}
