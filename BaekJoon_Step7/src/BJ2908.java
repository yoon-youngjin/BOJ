import java.util.Scanner;

public class BJ2908 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		String b = sc.next();
		
		StringBuffer sb = new StringBuffer(a);
		StringBuffer sb2 = new StringBuffer(b);
		
		String re = sb.reverse().toString();
		String re2 = sb2.reverse().toString();
		int f = Integer.parseInt(re);
		int g = Integer.parseInt(re2);
		int result = 0;
		if(f>g) result = f;
		else result = g;
		System.out.println(result);
	}
}
