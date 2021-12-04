package bj;

import java.util.ArrayList;
import java.util.Scanner;

public class BJ13305 {

	public static void main(String[] args) {
		long sum = 0L;
		int k = 0;
		int i = 0;
		
		Scanner sc = new Scanner(System.in);
		ArrayList aList1 =new ArrayList<Long>();
		ArrayList aList2 =new ArrayList<Long>();
		
		int n =sc.nextInt();
		
		for(int j=0;j<n-1;j++) {
			aList1.add(sc.nextLong());
		}
		for(int j=0;j<n;j++) {
			aList2.add(sc.nextLong());
		
	}
		
		long first = (Long)aList1.get(0) * (Long)aList2.get(0);
		
		while(true) {
			
			if(i==n-2) {
				break;
			}
			if((Long)aList2.get(k) < (Long)aList2.get(i+1)) {
				i++;
				sum += (Long)aList2.get(k) * (Long)aList1.get(i);
			}
			else {
				k=i+1;
				i++;
				sum += (Long)aList2.get(k) * (Long)aList1.get(i);	
				
			}
		
		}
		System.out.println(first+sum);
		
		
		
		

	}
}
