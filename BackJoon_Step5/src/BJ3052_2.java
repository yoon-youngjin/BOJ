import java.util.Scanner;
import java.util.HashSet;
 
public class BJ3052_2 {
 
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		HashSet<Integer> h = new HashSet<Integer>();
 
		for (int i = 0; i < 10; i++) {
			h.add(in.nextInt() % 42);
		//�Է¹��� ���� ������ ���� add�޼ҵ带 ���� HashSet�� ����
		}
        
		in.close();
		System.out.print(h.size());
	}
}