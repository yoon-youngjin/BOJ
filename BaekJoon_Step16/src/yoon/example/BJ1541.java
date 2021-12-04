package yoon.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class BJ1541 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        st = new StringTokenizer(br.readLine(), "-");
        int result = Integer.MAX_VALUE;
        while (st.hasMoreTokens()) {
            int temp = 0;

            StringTokenizer sub = new StringTokenizer(st.nextToken(), "-");

            while (sub.hasMoreTokens()) {
                temp += Integer.parseInt(sub.nextToken());
            }
            if(result==Integer.MAX_VALUE) {
                result = temp;
            }
            else {
                result -= temp;
            }
        }


        while(st.hasMoreTokens()) {
            String t = st.nextToken();

            if(t.contains("+"))
            {
                int temp = 0;
                String[] sd = t.split("\\+");
                for (int i = 0; i < sd.length; i++) {
                    temp += Integer.parseInt(sd[i]);
                }
                result -= temp;

            }
            else {

                result -= Integer.parseInt(t);
            }

        }
        System.out.println(result);






    }
}
