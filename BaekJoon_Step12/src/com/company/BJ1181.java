package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class BJ1181 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        ArrayList<st> al = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            al.add(new st(br.readLine()));
        }

        Collections.sort(al);
        Collections.reverse(al);

        for (int i = 0; i < N; i++) {

            String a1 = (al.get(i)).alpha;
            try {
                String a2 = (al.get(i + 1)).alpha;
                if(a1.equals(a2)) {
                    continue;
                }
            }
            catch (Exception e){}
            sb.append(a1).append('\n');
            }
        System.out.println(sb);

        }


    }


class st implements Comparable {
    String alpha;

    st(String temp) {
        this.alpha = temp;
    }

    @Override
    public int compareTo(Object o) {
        String a = ((st) o).alpha;
        if (this.alpha.length() == (a.length())) {
            int num = this.alpha.compareTo(a);
            if (num > 0)  return -1;
            else return 1;
        }

        if (this.alpha.length() < a.length()) return 1;
        else return -1;

    }
}
