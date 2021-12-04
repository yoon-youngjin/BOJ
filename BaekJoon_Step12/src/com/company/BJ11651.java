package com.company;

import java.io.IOException;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class BJ11651 {
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
            if(this.y==((point)o).y) {
                if(this.x>((point)o).x) return 1;
                else return -1;
            }
            if(this.y>((point)o).y) return 1;

            return -1;
        }
    }
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = sc.nextInt();
        ArrayList<point> al = new ArrayList();

        for (int i = 0;i < N;i++ ) {
            al.add(new point(sc.nextInt(),sc.nextInt()));

        }
        Collections.sort(al);

        for(point p :al) {
            System.out.println(p);
        }






    }
}
