package com.company;

import java.util.Scanner;

public class BJ2231 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n = sc.nextInt();
		
			int sum = 0;
			int i ;
			for(i=1;i<n;i++) {
				if(sub(i) + i == n) {
					System.out.println(i);
					break;
				}
			}
			if(i==n) System.out.println(0);
		
	}

	private static int sub(int i) {
		int sum =0;
		while(i!=0) {
			sum += i%10;
			
			i/=10;
		}
		
		return sum;
		
	}

}
