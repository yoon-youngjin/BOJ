package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class BJ2108 {

    private static int[] count = new int[8001];

    public static void main(String[] args) throws IOException {
        double sum = 0d;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());

        ArrayList<Integer> al = new ArrayList<>();


        for(int i=0;i<N;i++) {
            int temp = Integer.parseInt(br.readLine());
            al.add(temp);
            count[temp + 4000]++;
            sum+=temp;
        }
        Collections.sort(al);

//        int MAX = 0;
//        int temp =0 ;
//        for(int i=0;i<N;i++) {
//            int fre = Collections.frequency(al, al.get(i));
//            if(fre>MAX) {
//                MAX = fre;
//                temp = al.get(i);
//                al2.add(al.get(i));
//                if(fre!=1) {
//                    al2.clear();
//                    al2.add(al.get(i));
//                }
//            }
//            if(fre==MAX && temp!=al.get(i)) {
//                if(!al2.contains(al.get(i))) {
//                    al2.add(al.get(i));
//                }
//
//            }
//        }
//
//
//        Collections.sort(al2);

        sb.append(Math.round((sum/N))).append('\n');
        sb.append(al.get(((N + 1) / 2)-1) ).append('\n');

        sb.append(mode()).append('\n');

//        if(al2.size()==1) {
//            sb.append(al2.get(0)).append('\n');
//        }
//        else if(N==1) sb.append(al.get(0)).append('\n');
//        else if(al2.size()!=1){
//            sb.append(al2.get(1)).append('\n');
//        }
        sb.append(al.get(N - 1) - al.get(0));
        System.out.println(sb);


    }

    private static int mode() {
        ArrayList<Integer> al2 = new ArrayList();

        int max = 0 ;
        for (int i = 1; i < count.length; i++) {
            if(count[i] == max) {
                al2.add(i - 4000);
            } else if(count[i] > max) {
                max = count[i];
                al2.clear();
                al2.add(i - 4000);
            }
        }

        if(al2.size() > 1) {
            Collections.sort(al2);
            System.out.println(al2);
            return al2.get(1);
        }else {
            return al2.get(0);
        }

    }
}
