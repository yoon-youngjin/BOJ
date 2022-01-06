package yoon.hw;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class BJ20301 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        Deque<Integer> deque = new LinkedList<>();
        boolean check = false;
        int count = 0;

        for (int i = 1; i <= N; i++) {
            deque.add(i);
        }

        while (!deque.isEmpty()) {

            if(!check) {
                for (int i = 0; i < K - 1; i++) {
                    deque.addLast(deque.removeFirst());
                }
                System.out.println(deque.removeFirst());
            }
            else {
                for (int i = 0; i < K - 1; i++) {
                    deque.addFirst(deque.removeLast());
                }
                System.out.println(deque.removeLast());

            }
            count++;
            if(count %M==0) check = !check;

        }


    }
}
