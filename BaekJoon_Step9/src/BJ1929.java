import java.util.Scanner;

public class BJ1929 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int X = sc.nextInt();
		int Y = sc.nextInt();
		
		for(int i=X;i<=Y;i++) {
			prime(i);
	
		}

	}

	private static void prime(int x) {
		if(x<2) return;
		
		if(x==2) {
			System.out.println(2);
			return;
		}
		for(int j=2;j<=Math.sqrt(x);j++) {
			if(x % j == 0) {
				return;
			}
		}
		System.out.println(x);
		
	}

}
