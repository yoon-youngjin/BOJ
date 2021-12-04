import java.util.Scanner;

public class BJ2941 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		int count = 0;
		
		
		for(int i=0;i<a.length();i++) {
			if(i!=a.length()-1) {
			
			if(a.charAt(i) == 'l' && a.charAt(i+1) == 'j') {
				count++;
				i=i+1;
			}
			else if(a.charAt(i) == 'c' && a.charAt(i+1) == '=') {
				count++;
				i=i+1;
			}
			else if(a.charAt(i) == 'c' && a.charAt(i+1) == '-') {
				count++;
				i=i+1;
			}
			else if(a.charAt(i) == 'd' && a.charAt(i+1) == 'z' && a.charAt(i+2) == '=') {
				count++;
				i=i+2;
			}
			else if(a.charAt(i) == 'd' && a.charAt(i+1) == '-') {
				count++;
				i=i+1;
			}

			else if(a.charAt(i) == 'n' && a.charAt(i+1) == 'j') {
				count++;
				i=i+1;
			}
			else if(a.charAt(i) == 's' && a.charAt(i+1) == '=') {
				count++;
				i=i+1;
			}
			else if(a.charAt(i) == 'z' && a.charAt(i+1) == '=') {
				count++;
				i=i+1;
			}
			else count++;
			}
			else count++;
			
			
		}
		System.out.println(count);

	}

}
