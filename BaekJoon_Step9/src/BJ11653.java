import java.util.Scanner;

public class BJ11653 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int X = sc.nextInt();
		
		for(int i = 2;i<=X;i++) {
			while(X%i==0) {
				System.out.println(i);
				X = X / i;
			}
		}

	}

}
