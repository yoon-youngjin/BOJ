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
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int M = Integer.parseInt(br.readLine());
        int[] arr = new int[N];
        int[] arr2 = new int[M];
        int i = 0;
        while (st.hasMoreTokens()) {
            arr[i++] = Integer.parseInt(st.nextToken());
        }
        i=0;
        st = new StringTokenizer(br.readLine());
        while (st.hasMoreTokens()) {
            arr2[i++] = Integer.parseInt(st.nextToken());
        }

        for (int temp : arr2) {
            if(Arrays.binarySearch(arr, temp) < 0) {
                System.out.print("no ");
            }else {
                System.out.print("yes ");
            }

        }





    }
}
