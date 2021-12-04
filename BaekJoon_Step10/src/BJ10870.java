import java.util.Scanner;

public class BJ10870 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int X = sc.nextInt();
		
		int sum = Fib(X);
		System.out.println(sum);

	}

	private static int Fib(int x) {
		if(x<=1) return x;
		return Fib(x-1) + Fib(x-2);
		
	}

}
