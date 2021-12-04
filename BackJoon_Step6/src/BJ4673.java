
public class BJ4673 {
	
	public static int d(int a) {
		int sum = a;
		
		while(true) {
			if(a==0)break;
			sum = sum + (a%10);
			a = a/10;
		}
		
		
		return sum;
	}

	public static void main(String[] args) {
		boolean check[] = new boolean[100001];
		
		for(int i=1;i<10001;i++) {
			int n = d(i);
			
			if(n<10001) {
				check[n] = true;
			}
		}
		
		for(int i=1;i<10001;i++) {
			if(!check[i]) System.out.printf("%d\n",i);
			
		}
		
		

	}

}
