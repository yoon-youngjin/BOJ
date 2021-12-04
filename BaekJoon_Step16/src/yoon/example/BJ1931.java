package yoon.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BJ1931 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int N = Integer.parseInt(br.readLine());
        temp[] ts = new temp[N];


        for (int i = 0; i <N; i++) {
            st = new StringTokenizer(br.readLine());
            ts[i] = new temp(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()));
        }
        Arrays.sort(ts);


        int i = 0;
        int j = 1;
        int count = 1;

        while (j!=N) {

            if(ts[i].end > ts[j].start) {
                j++;
                continue;
            }
            else {

                i=j;
                j++;
                count++;
            }
        }
        System.out.println(count);
    }
}

class temp implements Comparable{
    int start;
    int end;

    public temp(int s, int e) {
        start = s;
        end = e;
    }

    @Override
    public int compareTo(Object o) {
        temp t = (temp)o;


        if(this.end == t.end) return this.start - t.start;

        return this.end - t.end;

    }
}
