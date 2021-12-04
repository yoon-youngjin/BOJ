import java.util.Scanner;

public class BJ1002 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N =sc.nextInt();
		
		for(int i=0;i<N;i++) {
			double x1 = sc.nextDouble();
			double y1 = sc.nextDouble();
			double r1 = sc.nextDouble();
			double x2 = sc.nextDouble();
			double y2 = sc.nextDouble();
			double r2 = sc.nextDouble();
			
			if(x1==x2 && y1 == y2 && r1 == r2) {
				System.out.println(-1);
			}
			else if(Math.pow(x2-x1, 2)+Math.pow(y2-y1,2)>Math.pow(r1+r2, 2)) 
				System.out.println(0);
			else if(Math.pow(x2-x1, 2)+Math.pow(y2-y1,2)<Math.pow(r2-r1, 2))
				System.out.println(0);
			else if(Math.pow(x2-x1, 2)+Math.pow(y2-y1,2)==Math.pow(r2-r1, 2))
				System.out.println(1);
			else if(Math.pow(x2-x1, 2)+Math.pow(y2-y1,2)==Math.pow(r2+r1, 2))
				System.out.println(1);
			else {
				System.out.println(2);
			}
		}

	}

}
