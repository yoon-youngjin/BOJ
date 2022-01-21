
import java.io.*;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.StringTokenizer;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {


    public static void main(String[] args) throws IOException {
        int count = 0;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(br.readLine());
        for (int i = 0; i <= N; i++) {
            for (int j = 0; j < 60; j++) {
                for (int k = 0; k < 60; k++) {
                    if(String.valueOf(i).contains("3") || String.valueOf(j).contains("3") || String.valueOf(k).contains("3"))
                        count++;
                }
            }
        }
        System.out.println(count);

    }
}
