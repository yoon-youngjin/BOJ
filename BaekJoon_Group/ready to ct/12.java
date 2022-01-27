package yoon.hw;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;


public class Main {


    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st1 = new StringTokenizer(br.readLine());
        StringTokenizer st2;
        int result = 0;


        int N = Integer.parseInt(st1.nextToken());
        int K = Integer.parseInt(st1.nextToken());
        Integer[] arr1 = new Integer[N];
        Integer[] arr2 = new Integer[N];

        st1 = new StringTokenizer(br.readLine());
        st2 = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            arr1[i] = Integer.parseInt(st1.nextToken());
            arr2[i] = Integer.parseInt(st2.nextToken());

        }

        Arrays.sort(arr1);
        Arrays.sort(arr2,Collections.reverseOrder());
        for (int i = 0; i < K; i++) {
            if(arr1[i] < arr2[i]) {
                arr1[i] = arr2[i];
            }else {
                continue;
            }
        }
        for (int i = 0; i < N; i++) {
            result += arr1[i];
        }
        System.out.println(result);

    }

}
