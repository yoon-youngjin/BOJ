import java.util.Scanner;

public class BJ1110 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N=0;
		int a = sc.nextInt();
		
		int b=a;
		int sum=0;
		while(true) {
			
//			int c = (int)(Math.log10(b)+1.java);
//			if(c==1.java) {
//				b *= 10;
//			}
			sum = (b % 10) + (b /10); 
			b = ((b%10)*10) + (sum%10);
			N++;
			if(a==b) break;
		
			
		}
		System.out.println(N);

	}

}
