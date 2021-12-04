import java.util.Scanner;

public class BJ3052 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] num = new int[10];
		int N = 1;
		
		for(int i=0;i<10;i++) {
			num[i] = sc.nextInt();
			num[i] = num[i] % 42 ;
		}
		
		for(int i=0;i<10;i++) {
			for(int j=0;j<i;j++) {
				if(num[j]==num[i]) {
					break;
				}
				if(j==i-1) {
					N++;
				}
				
			}
			
		}
		System.out.println(N);

	}

}
