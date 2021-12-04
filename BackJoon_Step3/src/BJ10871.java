import java.util.ArrayList;
import java.util.Scanner;

public class BJ10871 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int X = sc.nextInt();
		ArrayList a = new ArrayList();
		
		for(int i=0;i<N;i++) {
			int temp = sc.nextInt();
			if(X>temp) {
				a.add(temp);

				
			}
			
		}
		for(int i=0;i<a.size();i++) {
			System.out.println(a.get(i));
		}

	}

}
