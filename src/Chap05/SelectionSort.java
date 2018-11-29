package Chap05;

import java.util.Scanner;

public class SelectionSort {

	// a[idx1]와 a[idx2]의 값을 바꿉니다.
	static void swap(int[] a, int idx1, int idx2) {
		int t = a[idx1];
		a[idx1] = a[idx2];
		a[idx2] = t;
	}
	
	//단순 선택 정렬
	static void selectionSort(int[] a, int n) {
		for (int i = 0; i < n - 1; i++) {		// 마지막 요소를 바꾸기 전에 다른 모든 요소들의 교환이 일어나므로 할 필요가 없다.
			int min = i;		// 아직 정렬되지 않은 부분에서 가장 작은 요소의 인덱스를 기록합니다.
			for (int j = i + 1; j < n; j++) {	// 첫 요소를 min값으로 잡고 시작을 했기 때문에 실제로 비교해야할 대상은 첫요소를 뺀 나머지 요소들이다.
				if (a[j] < a[min]) {	// 가장 작은 요소를 찾기위함
					min = j;	
				}
			}
			swap(a, i, min); 	// 아직 정렬되지 않은 부분의 첫 요소와 가장 작은 요소를 교환합니다.
		}
	}

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.println("버블 정렬(버전 1)");
		System.out.print("요솟수: ");
		int nx = stdIn.nextInt();
		int[] x = new int[nx];

		for (int i = 0; i < nx; i++) {
			System.out.print("x[" + i + "] :");
			x[i] = stdIn.nextInt();
		}

		selectionSort(x, nx); // 배열 x를 버블 정렬합니다.

		System.out.println("오름차순으로 정렬했습니다.");
		for (int i = 0; i < nx; i++) {
			System.out.println("x[" + i + "] = " + x[i]);
		}
	}
}
