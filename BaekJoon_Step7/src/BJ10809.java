import java.util.Scanner;

public class BJ10809 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		
		int[] alpha = new int[26];
		
		for(int i=0;i<26;i++) {
			alpha[i] = -1;
		}
		
		for(int i=0;i<a.length();i++) {
			int b = a.charAt(i)-97;
		
			if(alpha[b]!=-1) continue;
			alpha[b] = i;
			
		}
		
		for(int i=0;i<26;i++) {
			System.out.printf(alpha[i]+" ");
		}
		
		

	}

}
