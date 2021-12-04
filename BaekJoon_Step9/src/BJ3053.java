import java.util.Scanner;

public class BJ3053 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double R = sc.nextDouble();
		System.out.println(String.format("%.6f", R*R*Math.PI));
		System.out.println(String.format("%.6f", ((2*R)*(2*R))/2));
		
	}

}
