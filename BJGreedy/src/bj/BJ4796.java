package bj;

import java.util.Scanner;

public class BJ4796 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = 1 ;
		while(true) {
			int sum = 0;
			int L = sc.nextInt();
			int P = sc.nextInt();
			int V = sc.nextInt();
			if(L==0 && P==0 && V==0) break;
		
			while(true) {
				int before = V;
				V -= P;
				if(V>0) {
					
					sum += L;
					
				}
				else {
					if(before>L) {
						sum += L;
						break;
					}
					sum += before;
					break;
				}
				
			}
			System.out.println("Case "+n+": "+sum);
			n++;
		}
	}

}
