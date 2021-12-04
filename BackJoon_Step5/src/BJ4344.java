import java.util.Scanner;
 
public class BJ4344 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int[] arr;
		
		int testcase = in.nextInt();
		
		for(int i = 0 ; i < testcase ; i++) {
 
			int N = in.nextInt();	//�л� �� 
			arr = new int[N];
			
			double sum = 0;	// ���� ���� �� ���� 
			
			// ���� �Էºκ� 
			for(int j = 0 ; j < N ; j++) {
				int val = in.nextInt();	// ���� �Է� 
				arr[j] = val;
				sum += val;	// ���� ���� �� 
			}
			
			double mean = (sum / N) ;
			double count = 0; // ��� �Ѵ� �л� �� ���� 
			
			// ��� �Ѵ� �л� ���� ã�� 
			for(int j = 0 ; j < N ; j++) {
				if(arr[j] > mean) {
					count++;
				}
			}
			
			System.out.printf("%.3f%%\n",(count/N)*100);
			
	
		}
		in.close();
	}
	
}
