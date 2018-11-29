package Chap05;

import java.util.Scanner;

// 패스란 정렬을 위해 한바퀴 돌면서 데이터 교환을 하는 행위(단위)
// 버블정렬중 교환이 없는 패스가 존재하면 그 배열은 정렬이 끝마친 상태라는것!

public class BubbleSort2 {
	// a[idx1]와 a[idx2]의 값을 바꿉니다.
		static void swap(int[] a, int idx1, int idx2) {
			int t = a[idx1];
			a[idx1] = a[idx2];
			a[idx2] = t;
		}

		// 버블 정렬
		static void bubbleSort(int[] a, int n) {
			for (int i = 0; i < n - 1; i++) {
				int exchg = 0;				// 패스의 교환 횟수를 기록합니다.
				for (int j = n - 1; j > i; j--) {
					if (a[j - 1] > a[j]) {
						swap(a, j - 1, j);
						exchg++;
					}
				}
				if(exchg == 0) {			// 패스의 교환 횟수가 0이라면 정렬중지!
					break;
				}
			}
		}

		public static void main(String[] args) {
			Scanner stdIn = new Scanner(System.in);
			
			System.out.println("버블 정렬(버전 1)");
			System.out.print("요솟수: ");
			int nx = stdIn.nextInt();
			int[] x = new int[nx];
			
			for(int i=0;i<nx;i++) {
				System.out.print("x[" + i + "] :");
				x[i] = stdIn.nextInt();
			}
			
			bubbleSort(x,nx);		// 배열 x를 버블 정렬합니다.
			
			System.out.println("오름차순으로 정렬했습니다.");
			for(int i=0;i<nx;i++) {
				System.out.println("x[" + i + "] = " + x[i]);
			}
		}
}
