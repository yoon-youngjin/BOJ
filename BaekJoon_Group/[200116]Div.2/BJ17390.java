package yoon.hw;


import java.io.*;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.StringTokenizer;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class BJ17390 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(st.nextToken());
        int Q = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        int[] A = new int[N];

        for (int i = 0; i < N; i++) {
            A[i] = Integer.parseInt(st.nextToken());

        }

//        String[] arr = temp.split(" ");
//        int[] arr2 = Arrays.stream(arr).mapToInt(Integer::parseInt).toArray();

        Arrays.sort(A);
        int[] B = new int[N + 1];
        for(int i = 1; i <= N; i++){
            if(i == 1) B[i] = A[i - 1];
            else B[i] = A[i - 1] + B[i - 1];
        }
        for (int i = 0; i < B.length; i++) {
            System.out.println(B[i]);
        }

        for (int i = 0; i < Q; i++) {
            StringTokenizer st2 = new StringTokenizer(br.readLine());
            int first = Integer.parseInt(st2.nextToken())-1;
            int last = Integer.parseInt(st2.nextToken());

            int sum = B[last] - B[first];
//            int[] temparr = Arrays.copyOfRange(A, first, last);
//            int sum = Arrays.stream(temparr).sum();

            bw.write(sum+"\n");

        }

        bw.flush();
        br.close();
        bw.close();


    }
}
