
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class BJ21771 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int R = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        int R_g = Integer.parseInt(st.nextToken());
        int C_g = Integer.parseInt(st.nextToken());
        int R_p = Integer.parseInt(st.nextToken());
        int C_p = Integer.parseInt(st.nextToken());
        char[][] str = new char[R][C];
        int cnt = 0;

        for (int i = 0; i < R; i++) {
            st = new StringTokenizer(br.readLine());
            str[i] = st.nextToken().toCharArray();
        }
        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++) {
                if(str[i][j] == 'P') cnt++;
            }
        }

        System.out.println(cnt == R_p * C_p ? 0 : 1);



    }
}
