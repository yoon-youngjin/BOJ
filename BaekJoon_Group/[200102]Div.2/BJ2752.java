package yoon.hw;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.StringTokenizer;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(st.nextToken());

        ArrayList<Integer> arr = new ArrayList<Integer>();

        arr.add(A);
        arr.add(B);
        arr.add(C);

        Stream<Integer> stream = arr.stream();
        List arr2 = stream.sorted(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1-o2;
            }
        }).collect(Collectors.toList());

        Stream<Integer> stream2 = arr2.stream();
        stream2.forEach(e -> {
            System.out.print(e+" ");
        });



    }
}
