import java.util.Scanner;

public class BJ1152 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a = sc.nextLine();
		
		String[] c = a.split(" ");
		
		if (a.isEmpty()) {
            System.out.println(0);
        } else {
            System.out.println(a.split(" ").length);
        }
		

	}

}
