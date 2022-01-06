package yoon.hw;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class BJ7785 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        HashMap<String, String> map = new HashMap<>();
        List<String> arr = new ArrayList();
        StringTokenizer st;
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            map.put(st.nextToken(),st.nextToken());
        }
        Iterator<String> it = map.keySet().iterator();
        while (it.hasNext()) {
            String temp = it.next();
            if(map.get(temp).equals("enter")) {
                arr.add(temp);
            }
        }

        arr.stream().sorted(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o2.compareTo(o1);
            }
        }).forEach(e->{
            System.out.println(e);
        });



    }
}
