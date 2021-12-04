package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class BJ18870 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        ArrayList<Integer> al = new ArrayList();
        HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            al.add(Integer.parseInt(st.nextToken()));
        }

        ArrayList<Integer> al2 = new ArrayList(al);
        Collections.sort(al);

        int cnt = 0;
        for (int i = 0; i < N; i++) {
            if (!hm.containsKey(al.get(i)))
                hm.put(al.get(i), cnt++);
        }

        for (int i = 0; i < N; i++) {
            int temp = al2.get(i);
            al2.set(i,hm.get(temp));
        }
        for (int i : al2) {
            sb.append(i + " ");
        }
        System.out.print(sb);



    }
}



