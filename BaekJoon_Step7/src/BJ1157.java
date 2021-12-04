import java.util.Scanner;

public class BJ1157 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String a = sc.next();
		a = a.toLowerCase();
		int temp=0;
		int k=0;
		int[] alpha = new int[26];
		int max = 0;
		for(int i=0;i<26;i++) {
			alpha[i] = 0;
		}
		
		for(int i=0;i<a.length();i++) {
			int b = a.charAt(i)-97;
			alpha[b]++;
			
		}
		
		for(int i=0;i<26;i++) {
			if(alpha[i]>max) {
				k = alpha[i];
				max= alpha[i];
				temp = i;
			}
			
			
		}
		for(int i = 0;i<26;i++) {
			if(alpha[i]==k && i!=temp) {
				System.out.println("?");
				break;
			}
			if(i==25) {
				char max2 = (char)(temp+97-32); 
				System.out.println(max2);
			}
			
		}

	}

}
