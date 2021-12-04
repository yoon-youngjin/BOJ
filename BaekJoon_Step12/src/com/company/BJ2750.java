package com.company;

import java.util.*;

public class BJ2750 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        ArrayList al = new ArrayList<Integer>();

        for (int i = 0; i < N; i++) {

            al.add(sc.nextInt());
        }


        Collections.sort(al);


        for(Object i : al) {
            System.out.println(i);

        }


    }
}
