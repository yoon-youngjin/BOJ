package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Scanner;
import java.util.StringTokenizer;

public class BJ9184 {
    static HashMap<String, Integer> hm = new HashMap();

    static int fun(int a, int b, int c) {
        String temp = a + "," + b + "," + c;
        if (!hm.containsKey(temp)) {

            if (a <= 0 || b <= 0 || c <= 0) {
                hm.put(temp, 1);
                return 1;
            } else if (a > 20 || b > 20 || c > 20) {
                int temp4 = fun(20, 20, 20);
                hm.put("20,20,20", temp4);
                return temp4;
            } else if (a < b && b < c) {
                int temp1 = fun(a, b, c - 1);
                int temp2 = fun(a, b - 1, c - 1);
                int temp3 = fun(a, b - 1, c);
                hm.put(temp, temp1 + temp2 - temp3);
                return temp1 + temp2 - temp3;
            }
            else {
                int temp1 = fun(a - 1, b, c);
                int temp2 = fun(a - 1, b - 1, c);
                int temp3 = fun(a - 1, b, c - 1);
                int temp4 = fun(a - 1, b - 1, c - 1);
                hm.put(temp, temp1 + temp2 + temp3 - temp4);
                return temp1 + temp2 + temp3 - temp4;
            }
        } else return hm.get(temp);

    }

    public static void main(String[] args) throws IOException {
        // 타입 자동완성 : ctrl + alt + v
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();



        //ctrl+d : 자동 복사
        while (true) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());


            if (a == -1 && b == -1 && c == -1) break;

            int result = fun(a, b, c);
            sb.append("w" + "(" + a + ", " + b + ", " + c + ")" + " = ").append(result).append('\n');

        }
        System.out.println(sb);


    }


}
