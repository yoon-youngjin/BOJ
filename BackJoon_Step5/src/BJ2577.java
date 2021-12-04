import java.util.Scanner;

public class BJ2577 {

	public static void main(String[] args) {
		int a,b,c;
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		int mul = a*b*c;
		int length = (int)Math.log10(mul)+1;
		int[] num = new int[10];
		
		for(int i=0;i<10;i++) {
			num[i] =0;
		}
		
		for(int i=0;i<length;i++) {
			num[mul%10]++;
			mul = mul/10;
		}
		for(int i=0;i<10;i++) {
			System.out.println(num[i]);
		}

	}

}
