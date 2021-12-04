import java.util.Scanner;

public class BJ4948 {
	static int count = 0;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int X = sc.nextInt();
		
		while(X != 0) {
			for(int i=X+1;i<=X*2;i++) {
				prime(i);
		
			}
			System.out.println(count);
			X = sc.nextInt();
			count = 0;
		}

	}

	private static void prime(int x) {
		if(x<2) return;
		
		if(x==2) {
			count++;
			return;
		}
		for(int j=2;j<=Math.sqrt(x);j++) {
			if(x % j == 0) {
				return;
			}
		}
		System.out.println(x);
		count++;
		
	}


}
