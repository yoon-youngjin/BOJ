import java.util.Scanner;

public class BJ1316 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int count = N;
		boolean check = false;
		String[] st = new String[N];
		for(int i=0;i<N;i++) {
			st[i] = sc.next();
		}
		for(int i=0;i<N;i++) {
			if(st[i].length()==1) {
				break;
			}
			else {
				for(int j=0;j<st[i].length();j++) {
					if(check==true) {
						check = false;
						break;
					}
					char temp = st[i].charAt(j);
					for(int k=j+1;k<st[i].length();k++) {
						if(k!=j+1 && st[i].charAt(k)==temp && st[i].charAt(k-1)!=temp) {
							count--;
							check = true;
							break;
						}
						
					}
				}
			}
			
			
		}
		System.out.println(count);

	}

}
