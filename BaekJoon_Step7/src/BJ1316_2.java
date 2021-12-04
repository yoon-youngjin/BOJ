import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BJ1316_2 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		int result = 0;
		
		while(t-- > 0) {
			String input = br.readLine().trim();
			if(check(input)) {
				result++;
			}
		}
		System.out.println(result);

	}

	private static boolean check(String input) {
		boolean[] alpha = new boolean[26];
		int length = input.length();
		
		for(int i=0;i<length;i++) {
			char temp = input.charAt(i);
			if(alpha[temp-'a']) {
				return false;
			}
			else {
				if(i<length-1 &&temp !=input.charAt(i+1)) {
					alpha[temp-'a'] = true;
				}
			}
		}
		return true;
	}

}
