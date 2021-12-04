import java.util.Scanner;

public class BJ2581 {

	static int sum = 0;
	
	static int min = 999999;
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int X = sc.nextInt();
		int Y = sc.nextInt();
		
		for(int i=X;i<=Y;i++) {
			prime(i);
	
		}
		if(sum!=0) {
		System.out.println(sum);
		System.out.println(min);
		}
		else {
			System.out.println(-1);
		}
		
		

	}

	private static void prime(int x) {
		if(x<2) return;
		
		if(x==2) {
			sum += x;
			min = 2;
			return;
		}
		for(int j=2;j<x;j++) {
			if(x % j==0) {
				return;
			}
		}
		if(x<min) min = x;
		sum+=x;
		
		
		
	}

}
