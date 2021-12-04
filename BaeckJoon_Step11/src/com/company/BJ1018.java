package com.company;

import java.util.Scanner;

public class BJ1018 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int M = sc.nextInt();
		int min = 32;
		int count ;
		String[] board = new String[N];
		
		sc.nextLine();
		for(int i =0;i<N;i++) {
		
		board[i] = sc.nextLine();
		
		}
		
		for(int i = 0;i<N-7;i++) {
			for(int j = 0;j<M-7;j++) {
				
				count = find(board,i,j);
				
				if(min>count) {
					min = count;
				}
			}
		}
		
		System.out.println(min);
		
		
		
	}

	private static int find(String[] board, int i, int j) {
		
		char temp = board[i].charAt(j);
		int count1 = 0;
		int count2 = 0;
		String[] cBoard1 = {"BWBWBWBWBW","WBWBWBWBWB","BWBWBWBWBW","WBWBWBWBWB",
				"BWBWBWBWBW","WBWBWBWBWB","BWBWBWBWBW","WBWBWBWBWB"};
		String[] cBoard2 = {"WBWBWBWBWB","BWBWBWBWBW","WBWBWBWBWB",
				"BWBWBWBWBW","WBWBWBWBWB","BWBWBWBWBW","WBWBWBWBWB","BWBWBWBWBW"};
		
		
		
		
		for(int x = i;x<i+8;x++) {
			for(int y = j;y<j+8;y++) {
				if(board[x].charAt(y)!=cBoard1[x-i].charAt(y-j)) {
					count1++;
				}
				if(board[x].charAt(y)!=cBoard2[x-i].charAt(y-j)) {
					count2++;
				}
				
				
				
			}
		}
		
		
		if (count1 > count2) {
            return count2;
        }

        return count1;
	}

}
