package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class BJ1427 {
    
    public static void main(String[] args) throws  IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        int N = Integer.parseInt(br.readLine());
        int temp = N;
        ArrayList<Integer> al = new ArrayList<>();

        while(temp!=0) {
            al.add(temp%10);
            temp/=10;

        }

        Collections.sort(al);
        Collections.reverse(al);
        for(int i : al) {
            System.out.print(i);
        }
//        System.out.println(al);



    }
}