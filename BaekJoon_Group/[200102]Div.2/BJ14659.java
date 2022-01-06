package yoon.hw;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BJ14659 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        ArrayList<Integer> temp = new ArrayList<>();
        int[] arr = new int[N];
        while (st.hasMoreTokens()) {
            temp.add(Integer.parseInt(st.nextToken()));
        }

        for (int i = 0; i < N; i++) {
            int a = temp.get(i);
            for (int j = i+1; j < N; j++) {
                if(a > temp.get(j)) arr[i]++;
                else {
                    break;
                }
            }
        }
        Arrays.sort(arr);
        System.out.println(arr[N-1]);

    }
}
