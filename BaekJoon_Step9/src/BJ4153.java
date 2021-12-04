import java.util.Arrays;
import java.util.Scanner;

public class BJ4153 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
		while(true) {
			
			int[] a = {sc.nextInt(),sc.nextInt(),sc.nextInt()};
			Arrays.sort(a);
			
			
			if(a[0]==0 && a[1]==0 && a[2]==0) break;
			if(a[2]*a[2] == a[1]*a[1]+a[0]*a[0]) System.out.println("right");
			else System.out.println("wrong");
			
		}

	}

}
