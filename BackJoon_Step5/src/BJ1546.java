import java.util.Arrays;
import java.util.Scanner;

public class BJ1546 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		double sum =0;
		double[] num = new double[N];
		for(int i=0;i<N;i++) {
			num[i] = sc.nextInt();
		}

		Arrays.sort(num);
		double max = num[N-1];
		
	
		for(int i =0;i<N;i++) {
			num[i] = num[i]/max*100;
			sum += num[i];
		}
		System.out.println(sum/N);
	}

}
