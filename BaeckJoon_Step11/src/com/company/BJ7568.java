package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class BJ7568 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();

		class AVC {
			
			
			int weight;
			int tall;
			int num = 1;
			
			AVC(int w, int t) {
				this.weight = w;
				this.tall = t;
			}

			public void comp(AVC a) {
				if (this.tall < a.tall && this.weight < a.weight)
					this.num++;

			}

		}

		ArrayList al = new ArrayList<AVC>();

		for (int i = 0; i < N; i++) {
			al.add(new AVC(sc.nextInt(), sc.nextInt()));
		}
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				if (i == j)
					continue;
				AVC temp = (AVC) al.get(i);
				AVC temp2 = (AVC) al.get(j);
				temp.comp(temp2);

			}
		}

		for (int i = 0; i < N; i++) {
			AVC temp = (AVC) al.get(i);
			System.out.print(temp.num + " ");
		}

	}

}
