package yoon.hw;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[] arr = new int[N];
        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr);

        int start = 0;
        int end = arr[N-1];
        int mid;
        int result=0;
        int total;
        while (start <= end) {
            total = 0;
            mid = (end + start) / 2;

            for(int t : arr) {

                if(t > mid) {
                    total += t - mid;
                }

            }
            if(total < M) {
                end = mid -1;
            }
            else {
                result = mid;
                start = mid + 1;
            }

        }
        System.out.println(result);


    }
}
