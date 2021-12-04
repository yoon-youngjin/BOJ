import java.util.Scanner;

public class BJ10872 {
	static int sum = 1;

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int N = sc.nextInt();
		
		int sum = factorial(N);
		System.out.println(sum);

	}

	private static int factorial(int n) {
		
		if(n<=1) {
			return 1;
		}
		
		return n*factorial(n-1);
		
	}

}
