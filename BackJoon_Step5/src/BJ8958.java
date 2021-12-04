import java.util.Scanner;

public class BJ8958 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		String[] OX = new String[N];
		
		for(int i=0;i<N;i++) {
			OX[i] = sc.next();
			
		}
		for(int i=0;i<N;i++) {
			int sum=0;
			int num=1;
			for(int j=0;j<OX[i].length();j++) {
				if(OX[i].charAt(j)=='O') {
					
					if(j!=0 && OX[i].charAt(j-1)=='O') {
						num++;
					}
					else num=1;
					sum = sum+num;
				}
			}
			System.out.println(sum);
		}
		
		
		
		
		
	}

}
