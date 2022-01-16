

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class BJ10799 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] temp = br.readLine().split("");
        Stack<Integer> stack = new Stack<>();
        int result = 0;
        for (int i = 0; i < temp.length; i++) {

            String n = temp[i];
            if(n.equals("(")) stack.push(i);
            else {
                if(stack.peek()==i-1) {
                    stack.pop();
                    result += stack.size();
                }
                else {
                    stack.pop();
                    result+=1;
                }

            }

        }
        System.out.println(result);


    }
}
