
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class BJ15818 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        Queue<String> queue = new LinkedList<>();
        while (true) {
            String data = br.readLine();
            if(data.equals("-1.java")) break;
            if(data.equals("0")) {
                queue.remove();
                continue;
            }
            if(queue.size()==N) {
                continue;
            }

            queue.add(data);
        }
        if(queue.isEmpty()) {
            System.out.println("empty");
        }
        else {
            Stream<String> stream = queue.stream();
            stream.forEach(e-> {
                System.out.print(e+" ");
            });
        }

    }
}
