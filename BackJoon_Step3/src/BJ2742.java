import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BJ2742 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		for(int i=N;i>=1;i--) {
			System.out.println(i);
		}

	}

}
