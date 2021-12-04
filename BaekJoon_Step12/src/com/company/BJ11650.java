package com.company;


import java.io.BufferedReader;
import java.io.IOException;

import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.StringTokenizer;

public class BJ11650 {
    static class point implements Comparable{
        int x;
        int y;
        point(int x,int y) {
            this.x = x;
            this.y = y;

        }

        @Override
        public String toString() {
            return x+" "+y ;
        }

        @Override
        public int compareTo(Object o) {
            if(this.x==((point)o).x) {
                if(this.y>((point)o).y) return 1;
                else return -1;
            }
            if(this.x>((point)o).x) return 1;

            return -1;
        }
    }
    public static void main(String[] args) throws IOException {


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st;
        ArrayList<point> al = new ArrayList();

        for (int i = 0;i < N;i++ ) {
            st = new StringTokenizer(br.readLine());
            al.add(new point(Integer.parseInt(st.nextToken()),Integer.parseInt(st.nextToken())));
        }
        Collections.sort(al);

        for(point p :al) {
            sb.append(p).append('\n');
        }
        System.out.println(sb);






    }
}
