import java.util.Scanner;

public class BJ2675 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		for(int i=0;i<N;i++) {
			int n = sc.nextInt();
			String a = sc.next();
			
			for(int j =0;j<a.length();j++) {
			
				char h = (char)a.charAt(j);
				for(int k=0;k<n;k++) {
					System.out.print(h);
				}
				
			}
			System.out.println();
			
		}
		

	}

}
