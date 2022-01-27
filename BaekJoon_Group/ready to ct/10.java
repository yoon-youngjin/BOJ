package yoon.hw;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        Integer[] arr = new Integer[N];
        for (int i = 0; i <N ; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(arr,(o1,o2)-> {
            return o2-o1;
        });

        for (int temp:arr) {
            System.out.print(temp+" ");
        }


    }

}
