
import java.util.Scanner;

public class BJ1978 {
	static int count = 0;
	public static void main(String[] args){
		Scanner sc =  new Scanner(System.in);
		int N = sc.nextInt();
		
		for(int i=0;i<N;i++) {
			
			int X = sc.nextInt();
			
			prime_number(X);
		}
		System.out.println(count);
	}

	private static void prime_number(int x) {
		if(x < 2) {
			return;
		}
		if(x == 2) {
			count++;
			return;
		}
		
		for(int i =2;i<x;i++) {
			if(x % i == 0) {
				return;
			}
		}
		count++;
		return;
		
		
	}

}
