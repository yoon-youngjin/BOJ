import java.util.Scanner;

public class BJ11720 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		String a  = sc.next();
		int sum=0;
		
		for(int i=0;i<N;i++) {
			sum += a.charAt(i) -'0';
		}
		
		System.out.println(sum);
		
		
		

	}

}
