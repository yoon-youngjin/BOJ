import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;


public class BJ9020 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N =  Integer.parseInt(br.readLine());
	
	
		
		for(int i=0;i<N;i++) {
			int A =  Integer.parseInt(br.readLine());
			
			int div,rem;
			
			div = A/2;
			rem = A - div;
			
			while(true) {
				if(prime_check(div) && prime_check(rem)) {
					break;
				}
				else {
					div--;
					rem++;
				}
				
			}
			System.out.println(div+" "+rem);

		

		}
		

	}

	

	private static boolean prime_check(int i) {
		if(i==2) return true;
		for(int j=2;j<i;j++) {
			if(i%j==0) return false;
		}
		return true;
	}


}
