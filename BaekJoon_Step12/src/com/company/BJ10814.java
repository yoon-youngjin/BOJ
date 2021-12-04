package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class BJ10814 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Member> al = new ArrayList<>();
        StringTokenizer st;

        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            al.add(new Member(Integer.parseInt(st.nextToken()), st.nextToken()));
        }


        Collections.sort(al);

        for (Member m : al) {
            System.out.println(m);
        }


    }
}

class Member implements Comparable {
    String person;
    int age;

    Member(int a, String p) {
        this.person = p;
        this.age = a;
    }

    @Override
    public String toString() {
        return this.age + " " + this.person;
    }

    @Override
    public int compareTo(Object o) {
        int temp = ((Member) o).age;

        if (this.age == temp) return 0;

        if (this.age > temp) return 1;

        return -1;
    }
}
