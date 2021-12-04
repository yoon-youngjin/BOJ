import java.util.Scanner;

public class BJ1065 {
	
	public static int hansu(int N) {
		int num=0;
		for(int i=1;i<N+1;i++) {
			if((int)Math.log10(i)+1 ==1 || (int)Math.log10(i)+1 ==2) {
				num++;
			}
			else {
				int a = i%10;
				i = i / 10;
				int b = i%10;
				i = i / 10;
				int c = i%10;
				if(a-b == b-c) num++;
			}
		}
		
		
		return num;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int result = hansu(sc.nextInt());
		System.out.println(result);
	}

}
