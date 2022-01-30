// BOJ 2606
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int N = Integer.parseInt(br.readLine());
        int T = Integer.parseInt(br.readLine());

        int[][] check = new int[101][101];
        boolean[] checked = new boolean[101];

        for (int i = 0; i < T; i++) {
            st = new StringTokenizer(br.readLine());
            int first = Integer.parseInt(st.nextToken());
            int second = Integer.parseInt(st.nextToken());
            check[first][second] = check[second][first] = 1;
        }

        checked[1] = true;
        Queue<Integer> q = new LinkedList<>();
        int count = 0;
        q.offer(1);
        while (!q.isEmpty()) {
            int temp = q.poll();
            for (int i = 1; i <= N; i++) {
                if(check[temp][i]==1 && checked[i] == false) {
                    checked[i] = true;
                    count++;

                    q.offer(i);
                }

            }
        }
        System.out.println(count);



    }
}