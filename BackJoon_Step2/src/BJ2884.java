import java.util.Scanner;

public class BJ2884 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		if(b-45>0) {
			b = b-45;
			System.out.println(a + " " + b);
			
		}
		else {
			a--;
			b = 60 - (45-b);
			if(a<0) {
				a = 23;
			}
			System.out.println(a +" "+b);
		}
		
		
		
	}

}
