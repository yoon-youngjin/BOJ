import java.util.Scanner;

public class BJ2562 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int max = 0;
		int N = 0;
		int[] num = new int[9];
		for(int i=0;i<9;i++) {
			num[i] = sc.nextInt();
			if(max<num[i]) {
				max = num[i];
				N = i+1;
			}
		}
		
		System.out.println(max);
		System.out.println(N);
		

	}

}
