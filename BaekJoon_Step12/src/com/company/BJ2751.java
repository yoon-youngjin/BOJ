package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class BJ2751 {

    public static void main(String[] args) throws IOException {
        //Scanner sc = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        ArrayList<Integer> al = new ArrayList();

        for (int i = 0; i < N; i++) {
            al.add(Integer.parseInt(br.readLine()));
        }


        Collections.sort(al);


        for(int i : al) {
            sb.append(i).append('\n');
        }
        System.out.println(sb);


    }
}
