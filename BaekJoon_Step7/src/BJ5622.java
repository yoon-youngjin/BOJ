import java.util.Scanner;

public class BJ5622 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		int sum =0;
		int[] num = new int[a.length()];
		for(int i=0;i<a.length();i++) {
			char b = a.charAt(i);
			
			switch(b) {
			
			case 'A': case 'B':case 'C' :
				num[i] = 3;
				break;
			case 'D': case 'E':case 'F' :
				num[i] = 4;
				break;
			case 'G': case 'H':case 'I' :
				num[i] = 5;
				break;
			case 'J': case 'K':case 'L' :
				num[i] = 6;
				break;
			case 'M': case 'N':case 'O' :
				num[i] = 7;
				break;
			case 'P': case 'Q':case 'R':case 'S':
				num[i] = 8;
				break;
			case 'T': case 'U':case 'V' :
				num[i] = 9;
				break;
			case 'W': case 'X':case 'Y':case 'Z':
				num[i] = 10;
				break;
				
				
					
			}
		}
			
			for(int i=0;i<num.length;i++) {
				sum += num[i];
			}
			System.out.println(sum);
			
			
			
		
	}
}
