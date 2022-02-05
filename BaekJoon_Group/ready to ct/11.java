package yoon.hw;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;


public class Main {

    public static class Student implements Comparable {
        public String name;
        public int score;

        @Override
        public int compareTo(Object o) {
            Student std = (Student) o;
            return this.score - std.score;
        }
    }


    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        Student[] arr = new Student[N];
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            arr[i] = new Student();
            arr[i].name = st.nextToken();
            arr[i].score = Integer.parseInt(st.nextToken());
        }


        Arrays.sort(arr);
        for (Student temp : arr) {
            System.out.print(temp.name + " ");
        }
    }

}
