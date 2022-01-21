

import java.io.*;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.StringTokenizer;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {
    public static int[] dx = {0, 0, -1, 1};
    public static int[] dy = {-1, 1, 0, 0}; // L,R,U,D

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        String[] move_types = {"L","R","U","D"};
        int N = Integer.parseInt(st.nextToken());
        int x = 1;
        int y = 1;


        String[] plans = br.readLine().split(" ");


        for (String plan : plans) {
            int nx = 0;
            int ny = 0;
            for (int i = 0; i < move_types.length; i++) {
                if(plan.equals(move_types[i])) {
                    nx = x + dx[i];
                    ny = y + dy[i];
                    break;
                }
            }
            if(nx < 1 || ny < 1 || nx > N || ny > N)
                continue;
            x = nx;
            y = ny;
        }
        System.out.println(x+" "+y);
    }
}
